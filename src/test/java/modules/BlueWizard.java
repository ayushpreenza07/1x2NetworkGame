package modules;

import com.relevantcodes.extentreports.LogStatus;
import commons.CommonLocators;
import commons.Constants;
import org.sikuli.script.*;
import org.testng.Assert;
import step_definitions.MyTestRunner;
import step_definitions.MyTestRunner;
import utilities.HTMLReportUtil;
import utilities.KeywordUtil;
import utilities.LogUtil;
import utilities.SikuliUtil;

import java.io.File;

public class BlueWizard {

    public static void validateIfBlueWizardGameIsLoaded(String folderName) {
        try {
            Assert.assertTrue(SikuliUtil.doElementExist(folderName, "blueWizardLogo.png", 160), "Game logo should be visible");
        } catch (Throwable e) {
            MyTestRunner.logger.log(LogStatus.WARNING, HTMLReportUtil.warningStringOrangeColor("Sikuli is not able to locate Blue Wizard logo"));
            Assert.assertTrue(SikuliUtil.doElementExist(folderName, "startBtn.png", 120), "START button should be visible");
        }
    }

    public static void clickOnStartBtn(String folderPath) {
        KeywordUtil.waitForVisible(CommonLocators.gameBalanceWithSymbol, 90);
        Constants.constants.setBalanceBeforeBetStr(KeywordUtil.getElementText(CommonLocators.gameBalanceWithSymbol).replace("€", ""));
        String tmp = "Balance before bet: " + Constants.constants.getBalanceBeforeBetStr();
        LogUtil.infoLog(AOTGGodOfStorms.class, tmp);
        MyTestRunner.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringBlueColor(tmp));
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Clicked on <b>Start</b> button"));

        SikuliUtil.clickOnElement(folderPath, "soundIcon.png", 60, "");
        SikuliUtil.clickOnElement(folderPath, "startBtn.png", 60, "");
        if (!SikuliUtil.doElementExist(folderPath, "spinBtn.png", 5))
            SikuliUtil.clickOnImgElementLocation(folderPath, "startBtn.png", 10, "");
    }

    public static void selectsMinBet(String folderPath) throws FindFailed, InterruptedException {
        try {
            SikuliUtil.multiClickOnNthImageElement(folderPath, "minusBtn.png", 10, 2);
        } catch (Throwable e) {
            Region reg = new Screen();
            Match m = reg.find(new Pattern(folderPath + File.separator + "linesThirty.png"));
            Location loc = new Location(m.getX() + 50, m.getY());
            for (int i = 0; i < 10; i++) {
                loc.click();
            }
        }
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Selected the lowest bet"));
        KeywordUtil.delay(2000);
    }

    public static void validateIfLowestBetIsSelected(String folderPath) {
        Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "validateLowestBet.png", 60));
        Constants.constants.setNetPositionText("0.10");
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Validated that Lowest bet <b>(" + Constants.constants.getNetPositionText() + ")</b> is selected for Blue Wizard game"));
    }

    public static void clickOnSpinBtn(String folderPath) {
        try {
            SikuliUtil.clickOnElement(folderPath, "spinBtn.png", 60, "Clicked on Spin button");
            KeywordUtil.delay(10000);
            KeywordUtil.waitForVisible(CommonLocators.gameBalanceWithSymbol);
            if (SikuliUtil.doElementExist(folderPath, "betNotPlacedError.png", 10))
                Assert.fail("Error popup with text 'Bet is not placed' occurred");
            Constants.constants.setBalanceAfterBetStr(KeywordUtil.getElementText(CommonLocators.gameBalanceWithSymbol).replace("€", ""));
            MyTestRunner.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringBlueColor("Balance after bet is " + Constants.constants.getBalanceAfterBetStr() + " and bet is placed for " + Constants.constants.getNetPositionText()));
            LogUtil.infoLog(ImmortalWaysCharms.class, "Balance after bet is " + Constants.constants.getBalanceAfterBetStr() + " and bet is placed for " + Constants.constants.getNetPositionText());
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }
}
