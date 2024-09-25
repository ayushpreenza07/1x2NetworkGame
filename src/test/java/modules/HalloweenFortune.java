package modules;

import com.relevantcodes.extentreports.LogStatus;
import commons.Constants;
import org.openqa.selenium.By;
import org.testng.Assert;
import step_definitions.MyTestRunner;
import utilities.HTMLReportUtil;
import utilities.KeywordUtil;
import utilities.LogUtil;
import utilities.SikuliUtil;

public class HalloweenFortune {

    static By balance = By.id("cp-playerBalance");

    public static void validateIfGameLaunchedInNewWindow(String folderName) {
        try {
            Assert.assertTrue(SikuliUtil.doElementExist(folderName, "gameLogo.png", 500), "Halloween Fortune logo should be visible");
        } catch (Throwable e) {
            MyTestRunner.logger.log(LogStatus.WARNING, HTMLReportUtil.warningStringOrangeColor("Waited 500 sec for the visibility of game logo"));
            Assert.assertTrue(SikuliUtil.doElementExist(folderName, "spinBtn.png", 10), "Spin button should be visible");
        }
        Constants.constants.setBalanceBeforeBetStr(KeywordUtil.getElementText(balance).replace("€", ""));
        MyTestRunner.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringBlueColor("Balance before bet: " + Constants.constants.getBalanceBeforeBetStr()));
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Validated that Halloween Fortune game launched in new window"));
    }

    public static void selectsMinBet(String folderPath) throws InterruptedException {
        SikuliUtil.multiClickOnNthImageElement(folderPath, "minusBtnForBets.png", 10, 2);
        SikuliUtil.multiClickOnNthImageElement(folderPath, "minusBtnForLines.png", 21, 2);
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Selected the lowest bet"));
        KeywordUtil.delay(2000);
    }

    public static void validateIfLowestBetIsSelected(String folderPath) {
        Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "validateLowestBet.png", 60), "Lowest bet should be selected");
        commons.Constants.constants.setNetPositionText("0.01");
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Validated that Lowest bet <b>(" + Constants.constants.getNetPositionText() + ")</b> is selected for Blue Wizard game"));
    }

    public static void clickOnSpinBtn(String folderPath) {
        try {
            SikuliUtil.clickOnElement(folderPath, "spinBtn.png", 60, "Clicked on Spin button");
            KeywordUtil.delay(10000);
            KeywordUtil.waitForVisible(balance);
            if (SikuliUtil.doElementExist(folderPath, "betNotPlacedError.png", 10))
                Assert.fail("Error popup with text 'Bet is not placed' occurred");
            Constants.constants.setBalanceAfterBetStr(KeywordUtil.getElementText(balance).replace("€", ""));
            MyTestRunner.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringBlueColor("Balance after bet is " + Constants.constants.getBalanceAfterBetStr() + " and bet is placed for " + Constants.constants.getNetPositionText()));
            LogUtil.infoLog(ImmortalWaysCharms.class, "Balance after bet is " + Constants.constants.getBalanceAfterBetStr() + " and bet is placed for " + Constants.constants.getNetPositionText());
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
    }

}
