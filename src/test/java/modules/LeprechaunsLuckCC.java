package modules;

import com.relevantcodes.extentreports.LogStatus;
import commons.CommonLocators;
import commons.Constants;
import org.testng.Assert;
import step_definitions.MyTestRunner;
import utilities.*;

import java.io.File;

public class LeprechaunsLuckCC {
    public static void validateIfGameLaunchedInNewWindow(String folderPath) {
        try {
            Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "gameLogo.png", 200), "Game logo should be visible");
        } catch (Throwable e) {
            Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "playBtn.png", 200), "Game logo should be visible");
        }
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Validated that game is launched in new window"));
    }

    public static void clickOnPlayBtn(String folderPath) {
        KeywordUtil.waitForVisible(CommonLocators.gameBalanceWithSymbol);
        Constants.constants.setBalanceBeforeBetStr(KeywordUtil.getElementText(CommonLocators.gameBalanceWithSymbol).replace("€", ""));
        String tmp = "Balance before the bet is " + Constants.constants.getBalanceBeforeBetStr();
        LogUtil.infoLog(CrabbinCash.class, tmp);
        MyTestRunner.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringBlueColor(tmp));
        SikuliUtil.clickOnElement(folderPath, "playBtn.png", 30, "Clicked on play button");
    }

    public static void turnOffTheAudio(String folderPath) {
        SikuliUtil.clickOnElement(folderPath, "soundBtn.png", 30, "Turned off the audio for the game");
    }

    public static void selectsMinBet(String folderPath) {
        SikuliUtil.clickOnElement(folderPath, "betSelectorCaret.png", 60, "");
        try {
            SikuliUtil.multiScroll("Down", 10);
            Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "lowestBetInMenu.png", 5), "Lowest bet should be selected");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }

        SikuliUtil.clickOnElement(folderPath, "lowestBetInMenu.png", 10, "");
        SikuliUtil.clickOnElement(folderPath, "confirmBtn.png", 120, "Clicked on Confirm button inside bet selector popup");
        if (!SikuliUtil.doElementExist(folderPath, "spinBtn.png", 10))
            SikuliUtil.clickOnImgElementLocation(folderPath, "confirmBtn.png", 10, "");
    }

    public static void validateIfMinBetIsSelected(String folderPath) {
        Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "validateLowestBet.png", 30), "Lowest bet should be selected");
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
            Constants.constants.setBalanceAfterBetStr(temp);

            Constants.constants.setNetPositionText("0.10");
            String tmp = "Balance after bet is " + Constants.constants.getBalanceAfterBetStr() + " and bet placed for " + Constants.constants.getNetPositionText();
            LogUtil.infoLog(CrabbinCash.class, tmp);
            MyTestRunner.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringBlueColor(tmp));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            Assert.fail(e.getMessage());
        }
    }

}
