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

public class FootballCashCollect {

    public static void validateIfGameLaunchedInNewWindow(String folderName) {
        try {
            Assert.assertTrue(SikuliUtil.doElementExist(folderName, "gameLogo.png", 500), "Football Cash Collect logo should be visible");
        } catch (Throwable e) {
            MyTestRunner.logger.log(LogStatus.WARNING, HTMLReportUtil.warningStringOrangeColor("Waited 500 sec for the game logo visibility"));
            Assert.assertTrue(SikuliUtil.doElementExist(folderName, "playBtn.png", 10), "Play button should be visible");
        }

        //Fetching balance before the bet
        Constants.constants.setBalanceBeforeBetStr(KeywordUtil.getElementText(CommonLocators.gameBalanceWithSymbol).replace("€", ""));
        String tmp = "Balance before bet: " + Constants.constants.getBalanceBeforeBetStr();
        LogUtil.infoLog(AOTGGodOfStorms.class, tmp);
        MyTestRunner.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringBlueColor(tmp));

        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Validated that Football Cash Collect game launched in new window"));
    }

    public static void clickOnPlayBtn(String folderPath) {
        SikuliUtil.clickOnElement(folderPath, "soundIcon.png", 10, "");
        try {
            SikuliUtil.clickOnElement(folderPath, "playBtn.png", 30, "Clicked on play button");
        } catch (Throwable e) {
            SikuliUtil.clickOnElement(folderPath, "sectionInsidePlayBtn.png", 30, "Clicked inside Play button highlighted section");
        }

        //TODO - Dynamic notification [Pending - Not able to reproduce]
        if (SikuliUtil.doElementExist(folderPath, "notification.png", 5))
            SikuliUtil.clickOnImgElementLocation(folderPath, "crossBtn.png", 5, "");

        //Clicking on play button if bet selector popup is not visible
        if (!SikuliUtil.doElementExist(folderPath, "betSelector.png", 10))
            try {
                SikuliUtil.clickOnElement(folderPath, "playBtn.png", 5, "Clicked on play button");
            } catch (Throwable e) {
                SikuliUtil.clickOnElement(folderPath, "sectionInsidePlayBtn.png", 5, "Clicked inside play button highlighted section");
            }
    }

    public static void selectsMinBet(String folderPath) {
        SikuliUtil.clickOnElement(folderPath, "betSelectorCaret.png", 120, "");

        //Selecting the lowest bet inside a bet selector popup
        try {
            SikuliUtil.multiScroll("Down", 10);
            Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "lowestBetInMenu.png", 5), "Lowest bet should be selected");
        } catch (Throwable e) {
            Assert.fail(e.getMessage());
        }
        SikuliUtil.clickOnElement(folderPath, "lowestBetInMenu.png", 10, "");
        SikuliUtil.clickOnElement(folderPath, "confirmBtn.png", 120, "Clicked on Confirm button inside bet selector popup");
        if (!SikuliUtil.doElementExist(folderPath, "spinBtn.png", 10))
            SikuliUtil.clickOnImgElementLocation(folderPath, "confirmBtn.png", 10, "");
    }

    public static void validateIfLowestBetIsSelected(String folderPath) {
        Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "validateLowestBet.png", 60), "Lowest bet should be selected");
        commons.Constants.constants.setNetPositionText("0.10");
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
