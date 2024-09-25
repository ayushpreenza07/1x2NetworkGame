package modules;

import com.relevantcodes.extentreports.LogStatus;
import commons.CommonLocators;
import commons.Constants;
import org.testng.Assert;
import step_definitions.MyTestRunner;
import utilities.*;

public class LuckOTheIrishGoldSFPJKing {

    public static void validateIfGameLaunchedInNewWindow(String folderPath) {
        Assert.assertFalse(SikuliUtil.doElementExist(folderPath, "LoginError.png", 120), "Login error popup should not be visible");
        try {
            Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "gameLogo.png", 120), "Game logo should be visible");
        } catch (Throwable e) {
            Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "playBtn.png", 30), "Play button should be visible");
        }
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Validated that game is launched in new window"));
    }

    public static void clickOnFirstPlayBtn(String folderPath) {
        SikuliUtil.waitUntilImgElementIsVisible(folderPath, "playBtn.png", 200);
        KeywordUtil.waitForVisible(CommonLocators.gameBalance);
        Constants.constants.setBalanceBeforeBetStr(KeywordUtil.getElementText(CommonLocators.gameBalance).replace("EUR ", ""));
        String tmp = "Balance before the bet is " + Constants.constants.getBalanceBeforeBetStr();
        LogUtil.infoLog(CrabbinCash.class, tmp);
        MyTestRunner.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringBlueColor(tmp));
        SikuliUtil.clickOnElement(folderPath, "playBtn.png", 10, "Clicked on play button");
    }

    public static void clickOnPlayBtnOnTutorialScr(String folderPath) {
        SikuliUtil.clickOnElement(folderPath, "playBtnInTutorial.png", 30, "Clicked on play button inside tutorial screen");
    }

    public static void turnOffTheAudio(String folderPath) {
        SikuliUtil.clickOnElement(folderPath, "hamburgerBtn.png", 30, "");
        SikuliUtil.clickOnElement(folderPath, "soundBtn.png", 30, "Turned off the audio of the game");
    }

    public static void selectsTheMinBet(String folderPath) throws InterruptedException {
        SikuliUtil.clickOnElement(folderPath, "betBtn.png", 30, "");
        KeywordUtil.delay(2000);
        SikuliUtil.clickOnImgElementLocation(folderPath, "lowestBtn.png", 20, "Selected lowest bet");
    }

    public static void validateIfLowestBetIsSelected(String folderPath) {
        Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "validateLowestBet.png", 30), "Lowest bet should be selected");
        MyTestRunner.logger.log(LogStatus.PASS, "Validated that the lowest bet is selected for the game");
    }

    public static void clickOnSpinBtn(String folderPath) {
        try {
            SikuliUtil.clickOnElement(folderPath, "spinBtn.png", 30, "Clicked on spin button");
            KeywordUtil.delay(10000);
            if (SikuliUtil.doElementExist(folderPath, "betNotPlacedError.png", 10))
                Assert.fail("Error popup with text 'Bet is not placed' occurred");

            String temp = "";
            if (KeywordUtil.waitForVisible(CommonLocators.gameBalance, 10))
                temp = KeywordUtil.getElementText(CommonLocators.gameBalance).replace("EUR ", "");
            else if (KeywordUtil.waitForVisible(CommonLocators.gameBalanceWithSymbol, 10))
                temp = KeywordUtil.getElementText(CommonLocators.gameBalanceWithSymbol).replace("€", "");
            Constants.constants.setBalanceBeforeBetStr(temp);
            Constants.constants.setNetPositionText("0.10");

            Constants.constants.setBalanceAfterBetStr(temp);

            String tmp = "Balance after bet is " + Constants.constants.getBalanceAfterBetStr() + " and bet placed for " + Constants.constants.getNetPositionText();
            LogUtil.infoLog(CrabbinCash.class, tmp);
            MyTestRunner.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringBlueColor(tmp));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            Assert.fail(e.getMessage());
        }
    }

}
