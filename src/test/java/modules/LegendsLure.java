package modules;

import com.relevantcodes.extentreports.LogStatus;
import commons.CommonLocators;
import commons.CommonMethods;
import commons.Constants;
import org.testng.Assert;
import step_definitions.MyTestRunner;
import utilities.*;

import java.math.BigDecimal;

public class LegendsLure {

    public static void playLegendsLureGame(String folderPath) {
        if (SikuliUtil.doElementExist(folderPath, "invalidTokenPopup.png", 90))
            Assert.fail("[ERROR] Invalid token popup occurred");
        Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "clickToContinueBtn.png", 60), "Click to continue button should be visible");
        KeywordUtil.waitForVisible(CommonLocators.gameBalance);
        Constants.constants.setBalanceBeforeBetStr(KeywordUtil.getElementText(CommonLocators.gameBalance).replace("EUR ", ""));
        String temp = "Balance before the bet is " + Constants.constants.getBalanceBeforeBetStr();
        LogUtil.infoLog(LegendsLure.class, temp);
        MyTestRunner.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringBlueColor(temp));
        SikuliUtil.clickOnElement(folderPath, "clickToContinueBtn.png", 30, "Clicked on CLICK TO CONTINUE button");
    }

    public static void placeBetForLegendsLureGame(String folderPath) {
        SikuliUtil.waitUntilImgElementIsVisible(folderPath, "spinBtn.png", 60);
        SikuliUtil.clickOnElement(folderPath, "hamburgerBtn.png", 10, "");
        SikuliUtil.clickOnElement(folderPath, "soundIcon.png", 10, "");
        SikuliUtil.multiClickOnLocationOfImgObj(folderPath, "minusBtn.png", "Multi clicked on minus button till lowest bet is selected", 1);
        Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "validateLowestBet.png", 10), "Lowest bet should be selected");
    }

    public static void spinLegensdLureGame(String folderPath) throws Exception {
        SikuliUtil.clickOnElement(folderPath, "spinBtn.png", 30, "Clicked on spin button");
        KeywordUtil.delay(10000);
        KeywordUtil.waitForVisible(CommonLocators.gameBalance);
        Constants.constants.setBalanceAfterBetStr(KeywordUtil.getElementText(CommonLocators.gameBalance).replace("EUR ", ""));
        Constants.constants.setNetPositionText("0.10");
        MyTestRunner.logger.log(LogStatus.INFO, "Balance after bet is " + Constants.constants.getBalanceAfterBetStr() + " and " + Constants.constants.getNetPositionText() + " is selected as bet amount");
    }

}
