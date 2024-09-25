package modules;

import com.relevantcodes.extentreports.LogStatus;
import commons.CommonLocators;
import commons.Constants;
import org.testng.Assert;
import step_definitions.MyTestRunner;
import utilities.*;

public class LegacyOfDead {

    static Class<LegacyOfDead> thisClass = LegacyOfDead.class;

    public static void validateIfGameLaunchedInNewWindow(String folderPath) {
        try {
            Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "gameLogo.png", 200), "Game logo should be visible");

            String temp = "";
            if (KeywordUtil.waitForVisible(CommonLocators.gameBalance, 10))
                temp = KeywordUtil.getElementText(CommonLocators.gameBalance).replace("EUR ", "");
            else if (KeywordUtil.waitForVisible(CommonLocators.gameBalanceWithSymbol, 10))
                temp = KeywordUtil.getElementText(CommonLocators.gameBalanceWithSymbol).replace("€", "");
            Constants.constants.setBalanceBeforeBetStr(temp);

            String tmp = "Balance before bet is " + Constants.constants.getBalanceBeforeBetStr();
            MyTestRunner.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringBlueColor(tmp));
            LogUtil.infoLog(thisClass, tmp);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            Assert.fail(e.getMessage());
        }
    }

    public static void clickOnContinueBtn(String folderPath) {
        SikuliUtil.clickOnElement(folderPath, "continueBtn.png", 120, "Clicked on CONTINUE button");
    }

    public static void turnOffTheAudio(String folderPath) {
        SikuliUtil.clickOnElement(folderPath, "soundIcon.png", 120, "Turned off the audio for the game");
    }

    public static void selectsMinBet(String folderPath) throws InterruptedException {
        SikuliUtil.waitUntilImgElementIsVisible(folderPath, "spinBtn.png", 60);
        SikuliUtil.multiClickOnNthImageElement(folderPath, "minusBtn.png", 10, 2);
        KeywordUtil.delay(2000);
        SikuliUtil.multiClickOnNthImageElement(folderPath, "minusBtn.png", 10, 3);
        KeywordUtil.delay(2000);
        SikuliUtil.multiClickOnNthImageElement(folderPath, "minusBtn.png", 10, 4);
        Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "validateMinBet.png", 10), "Lowest bet should be selected");
    }

    public static void clickOnSpinBtn(String folderPath) throws InterruptedException {
        SikuliUtil.clickOnElement(folderPath, "spinBtn.png", 30, "Clicked on spin button");
        KeywordUtil.delay(10000);

        String temp = "";
        if (KeywordUtil.waitForVisible(CommonLocators.gameBalance, 10))
            temp = KeywordUtil.getElementText(CommonLocators.gameBalance).replace("EUR ", "");
        else if (KeywordUtil.waitForVisible(CommonLocators.gameBalanceWithSymbol, 10))
            temp = KeywordUtil.getElementText(CommonLocators.gameBalanceWithSymbol).replace("€", "");
        Constants.constants.setBalanceAfterBetStr(temp);

        Constants.constants.setNetPositionText("0.01");
        MyTestRunner.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringBlueColor("Balance after bet is " + Constants.constants.getBalanceAfterBetStr() + " and " + Constants.constants.getNetPositionText() + " is selected as bet amount"));
    }

}
