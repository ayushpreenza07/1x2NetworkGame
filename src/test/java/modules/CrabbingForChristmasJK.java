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

public class CrabbingForChristmasJK {

    public static void validateIfGameLaunchedInNewWindow(String folderPath) {
        try {
            Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "gameLogo.png", 90), "Game logo should be visible");
        } catch (Throwable e) {
            Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "playBtn.png", 30), "Play button should be visible");
        }
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Validated that game is launched in new window"));
    }

    public static void clickOnPlayBtn(String folderPath) {
        SikuliUtil.waitUntilImgElementIsVisible(folderPath, "playBtn.png", 45);
        KeywordUtil.waitForVisible(CommonLocators.gameBalance);
        Constants.constants.setBalanceBeforeBetStr(KeywordUtil.getElementText(CommonLocators.gameBalance).replace("EUR ", ""));
        String tmp = "Balance before the bet is " + Constants.constants.getBalanceBeforeBetStr();
        LogUtil.infoLog(CrabbinCash.class, tmp);
        MyTestRunner.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringBlueColor(tmp));
        SikuliUtil.clickOnElement(folderPath, "playBtn.png", 10, "Clicked on play button");
        SikuliUtil.clickOnElement(folderPath, "soundBtn.png", 10, "Clicked on sound button");
    }

    public static void selectsMinBet(String folderPath) {
        SikuliUtil.clickOnElement(folderPath, "betBtn.png", 30, "Clicked on bet button");
        SikuliUtil.clickOnElement(folderPath, "lowestBet.png", 30, "Clicked on the lowest bet");
        Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "validateLowestBet.png", 30), "Lowest bet should be selected");
    }

    public static void clickOnSpinBtn(String folderPath) throws Exception {
        SikuliUtil.clickOnElement(folderPath, "spinBtn.png", 30, "Clicked on spin button");
        KeywordUtil.delay(10000);
        if (SikuliUtil.doElementExist(folderPath, "betNotPlacedError.png", 10))
            Assert.fail("Error popup with text 'Bet is not placed' occurred");
        KeywordUtil.waitForVisible(CommonLocators.gameBalance);
        Constants.constants.setBalanceAfterBetStr(KeywordUtil.getElementText(CommonLocators.gameBalance).replace("EUR ", ""));
        Constants.constants.setNetPositionText("0.10");
        String tmp = "Balance after bet is " + Constants.constants.getBalanceAfterBetStr() + " and bet placed for " + Constants.constants.getNetPositionText();
        LogUtil.infoLog(CrabbinCash.class, tmp);
        MyTestRunner.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringBlueColor(tmp));
    }

}
