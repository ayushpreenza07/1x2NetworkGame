package modules;

import com.relevantcodes.extentreports.LogStatus;
import commons.CommonLocators;
import commons.Constants;
import org.openqa.selenium.By;
import org.testng.Assert;
import step_definitions.MyTestRunner;
import utilities.*;

import java.io.File;

public class ImmortalWaysCharms {

    public static void ClickOnStartBtn(String folderPath) {
        SikuliUtil.clickOnElement(folderPath, "startBtn.png", 20, "Clicked on START button");
        if (!SikuliUtil.doElementExist(folderPath, "spinBtn.png", 10))
            SikuliUtil.clickOnImgElementLocation(folderPath, "startBtn.png", 10, "");
    }

    public static void verifyGameIsLaunchedInNewWindow(String folderPath) {
        Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "startBtn.png", 90), "Start button should be visible");
        KeywordUtil.waitForVisible(CommonLocators.gameBalance, 40);
        Constants.constants.setBalanceBeforeBetStr(KeywordUtil.getElementText(CommonLocators.gameBalance).replace("EUR ", ""));
        String tmp = "Balance before bet: " + Constants.constants.getBalanceBeforeBetStr();
        LogUtil.infoLog(ImmortalWaysCharms.class, tmp);
        MyTestRunner.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringBlueColor(tmp));
    }

    public static void selectLowestBet(String folderPath) {
        try {
            SikuliUtil.waitUntilImgElementIsVisible(folderPath, "minusBtn.png", 60);
            SikuliUtil.clickOnElement(folderPath, "soundIcon.png", 10, "");
            SikuliUtil.multiClickOnNthImageElement(folderPath, "minusBtn.png", 10, 2);
            Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "validateLowestBet.png", 90), "Lowest bet should be selected");
            MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Selected the lowest bet for the game"));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            Assert.fail(e.getMessage());
        }
    }

    public static void ClickOnSpinBtn(String folderPath) {
        try {
            SikuliUtil.clickOnElement(folderPath, "spinBtn.png", 60, "Clicked on Spin button");
            KeywordUtil.delay(10000);
            KeywordUtil.waitForVisible(CommonLocators.gameBalance);
            if (SikuliUtil.doElementExist(folderPath, "betNotPlacedError.png", 10))
                Assert.fail("Error popup with text 'Bet is not placed' occurred");
            Constants.constants.setBalanceAfterBetStr(KeywordUtil.getElementText(CommonLocators.gameBalance).replace("EUR ", ""));
            Constants.constants.setNetPositionText("0.25");
            MyTestRunner.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringBlueColor("Balance after bet is " + Constants.constants.getBalanceAfterBetStr() + " and bet is placed for " + Constants.constants.getNetPositionText()));
            LogUtil.infoLog(ImmortalWaysCharms.class, "Balance after bet is " + Constants.constants.getBalanceAfterBetStr() + " and bet is placed for " + Constants.constants.getNetPositionText());
        } catch (Throwable e) {
            GlobalUtil.e = e;
            Assert.fail(e.getMessage());
        }
    }

}
