package modules;

import com.relevantcodes.extentreports.LogStatus;
import commons.CommonLocators;
import commons.Constants;
import org.testng.Assert;
import step_definitions.MyTestRunner;
import utilities.HTMLReportUtil;
import utilities.KeywordUtil;
import utilities.LogUtil;
import utilities.SikuliUtil;

public class GoldCashFreeSpins {

    public static void validateIfGameLaunchedInNewWindow(String folderName) {
        try {
            Assert.assertTrue(SikuliUtil.doElementExist(folderName, "gameLogo.png", 300), "Game logo should be visible");
        } catch (Throwable e) {
            MyTestRunner.logger.log(LogStatus.WARNING, HTMLReportUtil.warningStringOrangeColor("Waited 300 sec for the visibility of game logo"));
            Assert.assertTrue(SikuliUtil.doElementExist(folderName, "clickScreenToContinue.png", 10), "CLICK SCREEN TO CONTINUE button should be visible");
        }
        Constants.constants.setBalanceBeforeBetStr(KeywordUtil.getElementText(CommonLocators.gameBalance).replace("EUR ", ""));
        MyTestRunner.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringBlueColor("Balance before bet is " + Constants.constants.getBalanceBeforeBetStr()));
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Validated that game launched in new window"));
    }

    public static void clickOnClickScreenToContinueBtn(String folderPath) {
        SikuliUtil.clickOnElement(folderPath, "clickScreenToContinue.png", 60, "Clicked on CLICK SCREEN TO CONTINUE button");
    }

    public static void selectsMinBet(String folderPath) throws InterruptedException {
        if (SikuliUtil.doElementExist(folderPath, "pressToContinue.png", 15))
            SikuliUtil.clickOnElement(folderPath, "pressToContinue.png", 10, "Clicked on PRESS TO CONTINUE button on popup");
        MyTestRunner.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringBlueColor("Popup: " + KeywordUtil.getScreenShotPathAsBase64()));

        //Chances are there if any free spins are won by previous execution...
        SikuliUtil.waitUntilImgElementIsVisible(folderPath, "downArrow.png", 90);
        SikuliUtil.multiClickOnNthImageElement(folderPath, "downArrow.png", 4, 2);
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Selected the lowest bet"));
    }

    public static void validateIfMinBetIsSelected(String folderPath) {
        Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "validateLowestBet.png", 60), "Lowest bet should be selected");
        commons.Constants.constants.setNetPositionText("0.20");
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Validated that Lowest bet <b>(" + Constants.constants.getNetPositionText() + ")</b> is selected for Gold Cash Free Spins game"));
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
            Assert.fail(e.getMessage());
        }
    }

}
