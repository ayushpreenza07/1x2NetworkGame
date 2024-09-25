package modules;

import com.relevantcodes.extentreports.LogStatus;
import commons.CommonLocators;
import commons.Constants;
import org.openqa.selenium.By;
import org.testng.Assert;
import step_definitions.MyTestRunner;
import step_definitions.MyTestRunner;
import utilities.*;

import java.io.File;

public class SaintNicked {

    public static void clickOnStartBtn(String folderPath) {
        SikuliUtil.clickOnElement(folderPath, "soundIcon.png", 200, "");
        KeywordUtil.waitForVisible(commons.CommonLocators.gameBalance, 90);
        Constants.constants.setBalanceBeforeBetStr(KeywordUtil.getElementText(commons.CommonLocators.gameBalance).replace("EUR ", ""));
        String tmp = "Balance before bet: " + Constants.constants.getBalanceBeforeBetStr();
        LogUtil.infoLog(ImmortalWaysCharms.class, tmp);
        MyTestRunner.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringBlueColor(tmp));
        SikuliUtil.clickOnElement(folderPath, "playBtn.png", 10, "Clicked on play button");
        if (!SikuliUtil.doElementExist(folderPath, "skipBtn.png", 10))
            SikuliUtil.clickOnElement(folderPath, "playBtn.png", 10, "Clicked on play button");
    }

    public static void clickOnSkipBtn(String folderPath) {
        SikuliUtil.clickOnElement(folderPath, "skipBtn.png", 20, "Clicked on SKIP button");
        if (!SikuliUtil.doElementExist(folderPath, "spinBtn.png", 8))
            SikuliUtil.clickOnImgElementLocation(folderPath, "skipBtn.png", 10, "");
    }

    public static void selectingLowestBet(String folderPath) {
        try {
            SikuliUtil.waitUntilImgElementIsVisible(folderPath, "spinBtn.png", 90);
            SikuliUtil.clickOnElement(folderPath, "betChangeBtn.png", 20, "");
            SikuliUtil.clickOnElement(folderPath, "lowestBetInMenu.png", 20, "");
            MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Selected the lowest bet for Saint Nicked game"));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            Assert.fail(e.getMessage());
        }
    }

    public static void validateIfLowestBetIsSelected(String folderPath) {
        Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "validateLowestBet.png", 60));
        Constants.constants.setNetPositionText("0.20");
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Validated that Lowest bet (0.20) is selected in Saint Nicked game"));
    }

    public static void clickOnSpinBtn(String folderPath) {
        try {
            SikuliUtil.clickOnElement(folderPath, "spinBtn.png", 60, "Clicked on Spin button");
            KeywordUtil.delay(10000);
            KeywordUtil.waitForVisible(commons.CommonLocators.gameBalance);
            if (SikuliUtil.doElementExist(folderPath, "betNotPlacedError.png", 10))
                Assert.fail("Error popup with text 'Bet is not placed' occurred");
            Constants.constants.setBalanceAfterBetStr(KeywordUtil.getElementText(commons.CommonLocators.gameBalance).replace("EUR ", ""));
            MyTestRunner.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringBlueColor("Balance after bet is " + Constants.constants.getBalanceAfterBetStr() + " and bet is placed for " + Constants.constants.getNetPositionText()));
            LogUtil.infoLog(ImmortalWaysCharms.class, "Balance after bet is " + Constants.constants.getBalanceAfterBetStr() + " and bet is placed for " + Constants.constants.getNetPositionText());
        } catch (Throwable e) {
            GlobalUtil.e = e;
            Assert.fail(e.getMessage());
        }
    }

}
