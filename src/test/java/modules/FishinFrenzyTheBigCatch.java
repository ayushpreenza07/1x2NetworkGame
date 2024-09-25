package modules;

import com.relevantcodes.extentreports.LogStatus;
import commons.Constants;
import org.openqa.selenium.By;
import org.testng.Assert;
import step_definitions.MyTestRunner;
import step_definitions.MyTestRunner;
import utilities.*;

import java.io.File;

public class FishinFrenzyTheBigCatch {

    static By balance = By.cssSelector(".balance h2");

    public static void validateIfGameLaunchedInNewWindow(String folderPath) {
        Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "playBtn.png", 200), "Play button should be visible");
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Validated that game is launching in new window"));
    }

    public static void clickOnPlayBtn(String folderPath) {
        KeywordUtil.waitForVisible(balance, 90);
        Constants.constants.setBalanceBeforeBetStr(KeywordUtil.getElementText(balance).replace("EUR ", ""));
        String tmp = "Balance before bet: " + Constants.constants.getBalanceBeforeBetStr();
        LogUtil.infoLog(ImmortalWaysCharms.class, tmp);
        MyTestRunner.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringBlueColor(tmp));
        SikuliUtil.clickOnElement(folderPath, "playBtn.png", 120, "Clicked on play button");
        if (!SikuliUtil.doElementExist(folderPath, "greenPlayBtn.png", 5))
            SikuliUtil.clickOnImgElementLocation(folderPath, "playBtn.png", 10, "");
        if (!SikuliUtil.doElementExist(folderPath, "spinBtn.png", 5))
            SikuliUtil.clickOnImgElementLocation(folderPath, "greenPlayBtn.png", 10, "");
    }

    public static void selectingLowestBet(String folderPath) {
        try {
            SikuliUtil.waitUntilImgElementIsVisible(folderPath, "spinBtn.png", 90);
            SikuliUtil.multiClickOnNthImageElement(folderPath, "downArrowBtn.png", 7, 2);
            MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Selected the lowest bet for <b>Saint Nicked</b> game"));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            Assert.fail(e.getMessage());
        }
    }

    public static void turnOffAudio(String folderPath) {
        SikuliUtil.clickOnElement(folderPath, "hamburgerBtn.png", 30, "Clicked on hamburger button");
        SikuliUtil.clickOnElement(folderPath, "soundIcon.png", 30, "Clicked on sound button");
    }

    public static void validateIfLowestBetIsSelected(String folderPath) {
        Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "validateLowestBet.png", 60));
        Constants.constants.setNetPositionText("0.10");
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Validated that Lowest bet <b>(0.10)</b> is selected Fishing Frenzy The Big Catch game"));
    }

    public static void clickOnSpinBtn(String folderPath) {
        try {
            SikuliUtil.clickOnElement(folderPath, "spinBtn.png", 60, "Clicked on Spin button");
            KeywordUtil.delay(10000);
            KeywordUtil.waitForVisible(balance);
            if (SikuliUtil.doElementExist(folderPath, "betNotPlacedError.png", 10))
                Assert.fail("Error popup with text 'Bet is not placed' occurred");
            Constants.constants.setBalanceAfterBetStr(KeywordUtil.getElementText(balance).replace("EUR ", ""));
            MyTestRunner.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringBlueColor("Balance after bet is " + Constants.constants.getBalanceAfterBetStr() + " and bet is placed for " + Constants.constants.getNetPositionText()));
            LogUtil.infoLog(ImmortalWaysCharms.class, "Balance after bet is " + Constants.constants.getBalanceAfterBetStr() + " and bet is placed for " + Constants.constants.getNetPositionText());
        } catch (Throwable e) {
            GlobalUtil.e = e;
            Assert.fail(e.getMessage());
        }
    }

}
