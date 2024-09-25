package modules;

import com.relevantcodes.extentreports.LogStatus;
import commons.CommonLocators;
import commons.Constants;
import org.testng.Assert;
import step_definitions.MyTestRunner;
import step_definitions.MyTestRunner;
import utilities.*;

public class QOTPMegaCash {

    public static void validateIfGameLaunchedInNewWindow(String folderPath) {
        try {
            Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "gameLogo.png", 200), "Game logo should be visible");
        } catch (Throwable e) {
            Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "soundIcon.png", 100), "Sound icon should be visible");
        }
        //SikuliUtil.clickOnElement(folderPath, "soundIcon.png", 10, "");
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Validated that game is launched in new window"));
    }

    public static void clickOnPlayBtn(String folderPath) {
        KeywordUtil.waitForVisible(CommonLocators.gameBalanceWithSymbol, 90);
        Constants.constants.setBalanceBeforeBetStr(KeywordUtil.getElementText(CommonLocators.gameBalanceWithSymbol).replace("€", ""));

        String tmp = "Balance before bet: " + Constants.constants.getBalanceBeforeBetStr();
        LogUtil.infoLog(AOTGGodOfStorms.class, tmp);
        MyTestRunner.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringBlueColor(tmp));

        SikuliUtil.clickOnElement(folderPath, "playBtn.png", 60, "Clicked on play button");
        if (!SikuliUtil.doElementExist(folderPath, "betSelector.png", 10))
            SikuliUtil.clickOnElement(folderPath, "playBtn.png", 60, "");
    }

    public static void selectsMinBet(String folderPath) {
        SikuliUtil.clickOnElement(folderPath, "betSelectorCaret.png", 120, "");

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

    public static void validateIfLowestBetIsSelected(String folderPath) {
        Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "validateLowestBet.png", 60));
        Constants.constants.setNetPositionText("0.10");
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Validated that Lowest bet <b>(" + Constants.constants.getNetPositionText() + ")</b> is selected in game"));
    }

    public static void clickOnSpinBtn(String folderPath) {
        try {
            SikuliUtil.clickOnElement(folderPath, "spinBtn.png", 60, "Clicked on spin button");
            KeywordUtil.delay(10000);
            KeywordUtil.waitForVisible(CommonLocators.gameBalanceWithSymbol);
            if (SikuliUtil.doElementExist(folderPath, "betNotPlacedError.png", 10))
                Assert.fail("Error popup with text 'Bet is not placed' occurred");
            Constants.constants.setBalanceAfterBetStr(KeywordUtil.getElementText(CommonLocators.gameBalanceWithSymbol).replace("€", ""));

            String tmp = "Balance after bet is " + Constants.constants.getBalanceAfterBetStr() + " and bet is placed for " + Constants.constants.getNetPositionText();
            MyTestRunner.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringBlueColor(tmp));
            LogUtil.infoLog(ImmortalWaysCharms.class, tmp);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            Assert.fail(e.getMessage());
        }
    }

}
