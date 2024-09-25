package modules;

import com.relevantcodes.extentreports.LogStatus;
import commons.CommonLocators;
import commons.CommonMethods;
import commons.Constants;
import org.testng.Assert;
import step_definitions.MyTestRunner;
import step_definitions.MyTestRunner;
import utilities.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class SantasStack {

    public static void validateIfGameIsLaunchedInNewWindow(String folderPath) {
        if (SikuliUtil.doElementExist(folderPath, "invalidTokenPopup.png", 120))
            Assert.fail("[ERROR] Invalid token error occurred");
        Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "clickToContinueBtn.png", 60), "Error popup should not be visible");
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Validated that game launched in new window"));

        //Fetching balance before the bet
        Constants.constants.setBalanceBeforeBetStr(KeywordUtil.getElementText(CommonLocators.gameBalance).replace("EUR ", ""));
        String tmp = "Balance before bet: " + Constants.constants.getBalanceBeforeBetStr();
        LogUtil.infoLog(AOTGGodOfStorms.class, tmp);
        MyTestRunner.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringBlueColor(tmp));
    }

    public static void clickOnClickToContinueBtn(String folderPath) {
        KeywordUtil.waitForVisible(CommonLocators.gameBalance, 90);
        SikuliUtil.clickOnElement(folderPath, "clickToContinueBtn.png", 10, "Clicked on CLICK TO CONTINUE button");
        if (!SikuliUtil.doElementExist(folderPath, "spinBtn.png", 15))
            SikuliUtil.clickOnImgElementLocation(folderPath, "clickToContinueBtn.png", 10, "");
    }

    public static void validateIfLowestBetIsSelected(String folderPath) {
        Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "validateLowestBet.png", 60));
        Constants.constants.setNetPositionText("0.10");
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Validated that Lowest bet <b>(" + Constants.constants.getNetPositionText() + ")</b> is selected in the game"));
    }

    public static void clickOnSpinBtn(String folderPath) {
        try {
            SikuliUtil.clickOnElement(folderPath, "spinBtn.png", 60, "Clicked on Spin button");
            KeywordUtil.delay(10000);
            KeywordUtil.waitForVisible(CommonLocators.gameBalance);
            if (SikuliUtil.doElementExist(folderPath, "betNotPlacedError.png", 10))
                Assert.fail("Error popup with text 'Bet is not placed' occurred");
            Constants.constants.setBalanceAfterBetStr(KeywordUtil.getElementText(CommonLocators.gameBalance).replace("EUR ", ""));
            MyTestRunner.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringBlueColor("Balance after bet is " + Constants.constants.getBalanceAfterBetStr() + " and bet is placed for " + Constants.constants.getNetPositionText()));
            LogUtil.infoLog(ImmortalWaysCharms.class, "Balance after bet is " + Constants.constants.getBalanceAfterBetStr() + " and bet is placed for " + Constants.constants.getNetPositionText());
        } catch (Throwable e) {
            GlobalUtil.e = e;
            Assert.fail(e.getMessage());
        }
    }

}
