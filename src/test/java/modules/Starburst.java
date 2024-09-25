package modules;

import com.relevantcodes.extentreports.LogStatus;
import commons.CommonLocators;
import commons.Constants;
import org.testng.Assert;
import step_definitions.MyTestRunner;
import step_definitions.MyTestRunner;
import utilities.HTMLReportUtil;
import utilities.KeywordUtil;
import utilities.LogUtil;
import utilities.SikuliUtil;

import java.io.File;

public class Starburst {

    public static void clickOnContinueBtn(String folderPath) {
        KeywordUtil.waitForVisible(CommonLocators.gameBalance, 90);
        Constants.constants.setBalanceBeforeBetStr(KeywordUtil.getElementText(CommonLocators.gameBalance).replace("EUR ", ""));
        SikuliUtil.clickOnElement(folderPath, "continueBtn.png", 120, "Clicked on CONTINUE button");
        SikuliUtil.clickOnElement(folderPath, "soundIcon.png", 10, "");
        if (!SikuliUtil.doElementExist(folderPath, "spinBtn.png", 5))
            SikuliUtil.clickOnImgElementLocation(folderPath, "continueBtn.png", 10, "");
    }

    public static void selectMinimumBet(String folderPath) {
        try {
            SikuliUtil.multiClickOnNthImageElement(folderPath, "minusCoinValueBtn.png", 8, 2);
        } catch (Throwable e) {
            SikuliUtil.multiClickOnNthImageElement(folderPath, "lineForLowerBet.png", 5, 2);
        }
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Selected the lowest bet"));
    }

    public static void validateIfMinBetIsSelected(String folderPath) {
        Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "validateLowestBet.png", 60));
        Constants.constants.setNetPositionText("0.10");
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Validated that Lowest bet <b>(" + Constants.constants.getNetPositionText() + ")</b> is selected for Star burst game"));
    }

    public static void clickOnSpinBtn(String folderPath) throws InterruptedException {
        SikuliUtil.clickOnElement(folderPath, "spinBtn.png", 60, "Clicked on Spin button");
        KeywordUtil.delay(10000);
        KeywordUtil.waitForVisible(CommonLocators.gameBalance);
        if (SikuliUtil.doElementExist(folderPath, "betNotPlacedError.png", 10))
            Assert.fail("Error popup with text 'Bet is not placed' occurred");
        Constants.constants.setBalanceAfterBetStr(KeywordUtil.getElementText(CommonLocators.gameBalance).replace("EUR ", ""));
        MyTestRunner.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringBlueColor("Balance after bet is " + Constants.constants.getBalanceAfterBetStr() + " and bet is placed for " + Constants.constants.getNetPositionText()));
        LogUtil.infoLog(ImmortalWaysCharms.class, "Balance after bet is " + Constants.constants.getBalanceAfterBetStr() + " and bet is placed for " + Constants.constants.getNetPositionText());
    }

}
