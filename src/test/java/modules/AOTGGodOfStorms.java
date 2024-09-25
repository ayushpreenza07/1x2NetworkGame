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
import utilities.LogUtil;
import utilities.SikuliUtil;

import java.math.BigDecimal;

public class AOTGGodOfStorms {

    public static By aotfGodOfStorms2 = By.xpath("//*[@id='game-2657']/img");

    public static void chooseGodOfStormsLuckGame() throws InterruptedException {
        KeywordUtil.waitForPageToLoad();
        KeywordUtil.waitForVisible(CommonLocators.netPositionDiv, 20);
        KeywordUtil.clickJSWithoutWait(CommonLocators.netPositionDiv, "");
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Clicked on Cross icon in Recently played banner"));
        KeywordUtil.scrollDown();
        KeywordUtil.waitForVisible(aotfGodOfStorms2);
        KeywordUtil.click(aotfGodOfStorms2, "Clicked on God of Storms cash collect game");
    }

    public static void playAotgLuckGame(String folderPath) {
        try {
            Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "gameLogo.png", 60), "AOTG God of Storms II logo should be visible");
        } catch (Throwable e) {
            Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "continueBtn.png", 60), "Continue button should be visible");
        }
        KeywordUtil.waitForVisible(CommonLocators.gameBalanceWithSymbol);
        Constants.constants.setBalanceBeforeBetStr(KeywordUtil.getElementText(CommonLocators.gameBalanceWithSymbol).replace("€", ""));
        String tmp = "Balance before bet: " + Constants.constants.getBalanceBeforeBetStr();
        LogUtil.infoLog(AOTGGodOfStorms.class, tmp);
        MyTestRunner.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringBlueColor(tmp));
        SikuliUtil.clickOnElement(folderPath, "continueBtn.png", 120, "Clicked on Continue button");
        if (!SikuliUtil.doElementExist(folderPath, "spinBtn.png", 20))
            SikuliUtil.clickOnElement(folderPath, "continueBtn.png", 120, "Clicked on Continue button");
    }

    public static void placeBetForAOTGGame(String folderPath) {
        SikuliUtil.multiClickOnNthImageElement(folderPath, "minusBtn.png", 10, 2);
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Selected the lowest bet"));
        Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "validateLowestBet.png", 30), "Lowest bet should be selected");
    }

    public static void spinAOTGGame(String folderPath) throws Exception {
        SikuliUtil.clickOnElement(folderPath, "spinBtn.png", 20, "Clicked on Spin button");
        KeywordUtil.delay(10000);
        if (SikuliUtil.doElementExist(folderPath, "betNotPlacedError.png", 10))
            Assert.fail("Error popup with text 'Bet is not placed' occurred");
        KeywordUtil.waitForVisible(CommonLocators.gameBalanceWithSymbol);
        Constants.constants.setBalanceAfterBetStr(KeywordUtil.getElementText(CommonLocators.gameBalanceWithSymbol).replace("€", ""));
        KeywordUtil.waitForVisible(CommonLocators.netPositionDiv);
        Constants.constants.setNetPositionText(KeywordUtil.getElementText(CommonLocators.netPositionDiv).replace("-", "").replace("€", ""));
        String temp = "Balance after bet is " + Constants.constants.getBalanceAfterBetStr() + " and bet amount is " + Constants.constants.getNetPositionText();
        LogUtil.infoLog(AOTGGodOfStorms.class, temp);
        MyTestRunner.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringBlueColor(temp));

        BigDecimal balanceBeforeBetDecimal = new BigDecimal(Constants.constants.getBalanceBeforeBetStr());
        BigDecimal balanceAfterBetDecimal = new BigDecimal(Constants.constants.getBalanceAfterBetStr());
        BigDecimal netPosition = new BigDecimal(Constants.constants.getNetPositionText());
        BigDecimal maxLossDecimal = balanceBeforeBetDecimal.subtract(netPosition);
        String tmp;

        //Check if balance decreased beyond the maximum allowable loss, indicating a loss
        if (balanceAfterBetDecimal.compareTo(maxLossDecimal) < 0) {
            tmp = "User have lost the bet. The deducted amount exceeds the bet.";
        }

        //Check if balance decreased, indicating a loss within the maximum allowable limit
        else if (balanceAfterBetDecimal.compareTo(maxLossDecimal) == 0) {
            tmp = "User have lost the bet and " + netPosition + " amount is deducted";
        }

        //Check if balance remained the same, indicating no change
        else if (balanceAfterBetDecimal.compareTo(balanceBeforeBetDecimal) == 0) {
            tmp = "User's balance remains unchanged.";
        }

        //Check if balance increased, indicating a win
        else if (balanceAfterBetDecimal.compareTo(balanceBeforeBetDecimal) > 0) {
            BigDecimal profitDecimal = balanceAfterBetDecimal.subtract(balanceBeforeBetDecimal);
            BigDecimal netProfit = profitDecimal.add(netPosition);
            tmp = "User have won the bet with <b>" + netProfit + "</b> profit bet amount";
        }

        //If none of the above conditions are met, there might be an issue with the data or logic
        else {
            tmp = "Unable to determine bet outcome. Check the data or logic.";
            MyTestRunner.logger.log(LogStatus.FAIL, HTMLReportUtil.failStringRedColor(tmp));
            Assert.fail("Unable to determine bet outcome. Check the data or logic.");
        }

        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(tmp));
        LogUtil.infoLog(AOTGGodOfStorms.class, tmp);

    }
}
