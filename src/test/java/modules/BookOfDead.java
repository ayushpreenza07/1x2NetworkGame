package modules;

import com.relevantcodes.extentreports.LogStatus;
import commons.CommonLocators;
import commons.Constants;
import org.testng.Assert;
import step_definitions.MyTestRunner;
import utilities.HTMLReportUtil;
import utilities.KeywordUtil;
import utilities.SikuliUtil;

public class BookOfDead {

    public static void playBookDeadGame(String folderPath) {
        SikuliUtil.clickOnElement(folderPath, "continueBtn.png", 180, "Clicked on Continue button");
        KeywordUtil.waitForVisible(CommonLocators.gameBalance);
        Constants.constants.setBalanceBeforeBetStr(KeywordUtil.getElementText(CommonLocators.gameBalance).replace("EUR ", ""));
        MyTestRunner.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringBlueColor("Balance before the bet is " + Constants.constants.getBalanceBeforeBetStr()));
    }

    public static void placeBetForBookOfDeadGame(String folderPath) throws InterruptedException {
        SikuliUtil.clickOnElement(folderPath, "soundIcon.png", 30, "Clicked on sound button");
        SikuliUtil.multiClickOnLocationOfImgObj(folderPath, "minusBtnForLines.png", "", 10);
        KeywordUtil.delay(3000);
        SikuliUtil.multiClickOnLocationOfImgObj(folderPath, "minusBtnForCoins.png", "Multi clicked on the minus button till lowest bet is selected", 10);
        //Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "validateLowestBet.png", 20), "Lowest bet should be selected");
    }

    public static void spinBookOfDeadGame(String folderPath) throws Exception {
        SikuliUtil.clickOnElement(folderPath, "spinBtn.png", 60, "Clicked on Spin button");
        KeywordUtil.delay(10000);
        if (SikuliUtil.doElementExist(folderPath, "betNotPlacedError.png", 10))
            Assert.fail("Error popup with text 'Bet is not placed' occurred");
        KeywordUtil.waitForVisible(CommonLocators.gameBalance);
        Constants.constants.setBalanceAfterBetStr(KeywordUtil.getElementText(CommonLocators.gameBalance).replace("EUR ", ""));
        Constants.constants.setNetPositionText("0.20");
        MyTestRunner.logger.log(LogStatus.INFO, "Balance after the bet is " + Constants.constants.getBalanceAfterBetStr() + " and bet was placed for " + Constants.constants.getNetPositionText());
    }

}
