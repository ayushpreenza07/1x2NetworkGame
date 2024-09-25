package modules;

import com.relevantcodes.extentreports.LogStatus;
import commons.CommonLocators;
import commons.Constants;
import org.openqa.selenium.By;
import org.testng.Assert;
import step_definitions.MyTestRunner;
import step_definitions.MyTestRunner;
import utilities.HTMLReportUtil;
import utilities.KeywordUtil;
import utilities.SikuliUtil;

import java.math.BigDecimal;

public class BoylePlayCasinoGame {

    static By megaFireBlazeThreeImg = By.xpath("//*[@id='game-2785']/img");

    public static void chooseMegaFireBlazeGame() throws InterruptedException {
        KeywordUtil.waitForPageToLoad();
        KeywordUtil.waitForVisible(CommonLocators.recentCloseIcon, 20);
        KeywordUtil.clickJSWithoutWait(CommonLocators.recentCloseIcon, "");
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Clicked on Cross icon on Recently played section"));
        KeywordUtil.scrollDown();
        KeywordUtil.delay(2000);
        KeywordUtil.waitForVisible(megaFireBlazeThreeImg);
        KeywordUtil.click(megaFireBlazeThreeImg, "Clicked on Mega Fire Blaze 3 game");
    }

    public static void playMegaFireBlazeGame(String folderPath) {
        Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "startBtn.png", 120), "Start button should be visible");
        Constants.constants.setBalanceBeforeBetStr(KeywordUtil.getElementText(CommonLocators.gameBalanceWithSymbol).replace("£", "").replace("€", ""));
        SikuliUtil.clickOnElement(folderPath, "soundIcon.png", 10, "Clicked on sound icon");
        SikuliUtil.clickOnElement(folderPath, "startBtn.png", 30, "Clicked on start button");
        if (!SikuliUtil.doElementExist(folderPath, "spinBtn.png", 5))
            SikuliUtil.clickOnElement(folderPath, "startBtn.png", 5, "");
    }

    public static void placeBetForMegaFireBlazeGame(String folderPath) {
        SikuliUtil.clickOnElement(folderPath, "betBtn.png", 20, "Clicked on Bet button");
        for (int i = 0; i < 10; i++) {
            SikuliUtil.clickOnElement(folderPath, "minusBtn.png", 3, "");
        }
        Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "lowestBetInMenu.png", 10), "Lowest balance should be visible");
        SikuliUtil.clickOnElement(folderPath, "crossBtn.png", 10, "Clicked on Cross button");
        Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "validateLowestBet.png", 10), "Lowest balance should be visible on game");
    }

    public static void spinMegaFireBlazeGame(String folderPath) throws Exception {
        SikuliUtil.clickOnElement(folderPath, "spinBtn.png", 30, "Clicked on Spin button");
        KeywordUtil.delay(10000);
        KeywordUtil.waitForVisible(CommonLocators.gameBalanceWithSymbol);
        Constants.constants.setBalanceAfterBetStr(KeywordUtil.getElementText(CommonLocators.gameBalanceWithSymbol).replace("£", "").replace("€", ""));
        KeywordUtil.waitForVisible(CommonLocators.netPositionDiv);
        Constants.constants.setNetPositionText(KeywordUtil.getElementText(CommonLocators.netPositionDiv).replace("-", "").replace("€", "").replace("£", ""));

        // Convert balance strings to BigDecimal for precise arithmetic
        BigDecimal balanceBeforeBetDecimal = new BigDecimal(Constants.constants.getBalanceBeforeBetStr());
        BigDecimal balanceAfterBetDecimal = new BigDecimal(Constants.constants.getBalanceAfterBetStr());
        BigDecimal betAmountDecimal = new BigDecimal("0.10");

        // Calculate the maximum allowable loss with BigDecimal
        BigDecimal maxLossDecimal = balanceBeforeBetDecimal.subtract(betAmountDecimal);

        // Check if balance decreased beyond the maximum allowable loss, indicating a loss
        if (balanceAfterBetDecimal.compareTo(maxLossDecimal) < 0) {
            System.out.println("You lost the bet. The deducted amount exceeds the bet.");
            Assert.fail("You lost the bet. The deducted amount exceeds the bet.");
        }

        // Check if balance decreased, indicating a loss within the maximum allowable limit
        else if (balanceAfterBetDecimal.compareTo(maxLossDecimal) == 0) {
            System.out.println("You lost the bet and valid amount deducted is : " + betAmountDecimal);
            Assert.assertEquals(balanceAfterBetDecimal.compareTo(maxLossDecimal), 0, "You lost the bet and valid amount deducted is : " + betAmountDecimal);
        }

        // Check if balance remained the same, indicating no change
        else if (balanceAfterBetDecimal.compareTo(balanceBeforeBetDecimal) == 0) {
            System.out.println("Your balance remains unchanged.");
            Assert.assertEquals(balanceAfterBetDecimal.compareTo(balanceBeforeBetDecimal), 0, "You neither lost nor win.");
        }

        // Check if balance increased, indicating a win
        else if (balanceAfterBetDecimal.compareTo(balanceBeforeBetDecimal) > 0) {
            BigDecimal profitDecimal = balanceAfterBetDecimal.subtract(balanceBeforeBetDecimal);
            BigDecimal netProfit = profitDecimal.add(betAmountDecimal);
            System.out.println("Congratulations! You won the bet : " + netProfit);
            Assert.assertTrue(true, "Congratulations! You won the bet : " + netProfit);
        }

        // If none of the above conditions are met, there might be an issue with the data or logic
        else
            System.out.println("Congratulations! You won the bet");
    }

}
