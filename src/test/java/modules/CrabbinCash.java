package modules;

import com.relevantcodes.extentreports.LogStatus;
import commons.CommonLocators;
import commons.Constants;
import org.openqa.selenium.By;
import org.testng.Assert;
import step_definitions.MyTestRunner;
import utilities.*;

import java.math.BigDecimal;

public class CrabbinCash {

    public static By searchBar = By.cssSelector("div#main-menu input#GamesSearch");
    public static By searchBarInCasinoPage = By.cssSelector("[placeholder='Search']");
    public static By closeBtnPopup = By.xpath("//div[@class='eGamingBasic_loginPopup_closeBtn']");
    public static By gamePageLogo = By.id("header-logo");

    public static void clickGamesTab() {
        try {
            KeywordUtil.waitForVisible(searchBarInCasinoPage, 120);
            try {
                KeywordUtil.click(CommonLocators.recentCloseIcon, "");
            } catch (Throwable e) {
                KeywordUtil.clickJSWithoutWait(CommonLocators.recentCloseIcon, "");
            }
            MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Clicked on Cross icon in Recently played section"));
            KeywordUtil.waitForVisible(CommonLocators.gamesTabXpath, 60);
            KeywordUtil.clickJS(CommonLocators.gamesTabXpath, "Clicked on Games tab");
        } catch (Throwable e) {
            GlobalUtil.e = e;
            Assert.fail(e.getMessage());
        }
    }

    public static void enterGameSearch(String gameName) {
        try {
            KeywordUtil.waitForVisible(gamePageLogo, 80);
            boolean flag = KeywordUtil.waitForVisible(closeBtnPopup, 10);
            if (flag) KeywordUtil.click(closeBtnPopup, "");
            KeywordUtil.click(searchBar, "");
            KeywordUtil.writeInInputCharByChar(searchBar, gameName, "Searched for " + gameName + " game in search bar");
        } catch (Throwable e) {
            GlobalUtil.e = e;
            Assert.fail(e.getMessage());
        }
    }

    public static void validateIfGameLaunchedInNewWindow(String folderPath) {
        Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "playBtn.png", 90), "Play button should be visible");
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Validated that game launched in new window"));
    }

    public static void playCrabbinLuckGame(String folderPath) {
        SikuliUtil.waitUntilImgElementIsVisible(folderPath, "playBtn.png", 45);
        KeywordUtil.waitForVisible(CommonLocators.gameBalance);
        Constants.constants.setBalanceBeforeBetStr(KeywordUtil.getElementText(CommonLocators.gameBalance).replace("EUR ", ""));
        String tmp = "Balance before the bet is " + Constants.constants.getBalanceBeforeBetStr();
        LogUtil.infoLog(CrabbinCash.class, tmp);
        MyTestRunner.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringBlueColor(tmp));
        SikuliUtil.clickOnElement(folderPath, "playBtn.png", 10, "Clicked on play button");
        SikuliUtil.clickOnElement(folderPath, "soundIcon.png", 10, "Clicked on sound icon");
    }

    public static void placeBetForCrabbinGame(String folderPath) {
        SikuliUtil.clickOnElement(folderPath, "betBtn.png", 30, "");
        SikuliUtil.clickOnElement(folderPath, "lowestBet.png", 30, "Selected lowest bet");
    }

    public static void spinCrabbinGame(String folderPath) throws Exception {
        SikuliUtil.clickOnElement(folderPath, "spinBtn.png", 30, "Clicked on spin button");
        KeywordUtil.delay(10000);
        if (SikuliUtil.doElementExist(folderPath, "betNotPlacedError.png", 10))
            Assert.fail("Error popup with text 'Bet is not placed' occurred");
        KeywordUtil.waitForVisible(CommonLocators.gameBalance);
        Constants.constants.setBalanceAfterBetStr(KeywordUtil.getElementText(CommonLocators.gameBalance).replace("EUR ", ""));
        Constants.constants.setNetPositionText("0.10");

        String tmp = "Balance after bet is " + Constants.constants.getBalanceAfterBetStr() + " and bet placed for " + Constants.constants.getNetPositionText();
        LogUtil.infoLog(CrabbinCash.class, tmp);
        MyTestRunner.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringBlueColor(tmp));

//        // Convert balance strings to BigDecimal for precise arithmetic
//        BigDecimal balanceBeforeBetDecimal = new BigDecimal(Constants.constants.getBalanceAfterBetStr());
//        BigDecimal balanceAfterBetDecimal = new BigDecimal(Constants.constants.getBalanceAfterBetStr());
//        BigDecimal netPosition = new BigDecimal(Constants.constants.getNetPositionText());
//        BigDecimal maxLossDecimal = balanceBeforeBetDecimal.subtract(netPosition);
//
//        //Check if balance decreased beyond the maximum allowable loss, indicating a loss
//        if (balanceAfterBetDecimal.compareTo(maxLossDecimal) < 0) {
//            System.out.println("You lost the bet. The deducted amount exceeds the bet.");
//            Assert.fail("You lost the bet. The deducted amount exceeds the bet.");
//        }
//
//        // Check if balance decreased, indicating a loss within the maximum allowable limit
//        else if (balanceAfterBetDecimal.compareTo(maxLossDecimal) == 0) {
//            System.out.println("You lost the bet and valid amount is deducted : " + netPosition);
//        }
//
//        // Check if balance remained the same, indicating no change
//        else if (balanceAfterBetDecimal.compareTo(balanceBeforeBetDecimal) == 0) {
//            System.out.println("Your balance remains unchanged.");
//        }
//
//        // Check if balance increased, indicating a win
//        else if (balanceAfterBetDecimal.compareTo(balanceBeforeBetDecimal) > 0) {
//            BigDecimal profitDecimal = balanceAfterBetDecimal.subtract(balanceBeforeBetDecimal);
//            BigDecimal netProfit = profitDecimal.add(netPosition);
//            System.out.println("Congratulations! You won the bet : " + netProfit);
//        }
//
//        // If none of the above conditions are met, there might be an issue with the data or logic
//        else {
//            System.out.println("Unable to determine bet outcome. Check the data or logic.");
//            Assert.fail("Unable to determine bet outcome. Check the data or logic.");
//        }
    }

}
