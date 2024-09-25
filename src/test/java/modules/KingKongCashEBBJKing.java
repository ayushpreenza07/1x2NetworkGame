package modules;

import com.relevantcodes.extentreports.LogStatus;
import commons.CommonLocators;
import commons.Constants;
import org.testng.Assert;
import step_definitions.MyTestRunner;
import utilities.*;

public class KingKongCashEBBJKing {

    static Class<KingKongCashEBBJKing> thisClass = KingKongCashEBBJKing.class;

    public static void clickOnPlayBtn(String folderPath) {
        Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "winTxt.png", 180), "WIN text should be visible");
        KeywordUtil.waitForVisible(CommonLocators.gameBalance);
        Constants.constants.setBalanceBeforeBetStr(KeywordUtil.getElementText(CommonLocators.gameBalance).replace("EUR ", ""));
        String tmp = "Balance before bet is " + Constants.constants.getBalanceBeforeBetStr();
        LogUtil.infoLog(thisClass, tmp);
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(tmp));
        for (int i = 0; i <= 1; i++)
            SikuliUtil.clickOnElement(folderPath, "winTxt.png", 120, "");
        if (!SikuliUtil.doElementExist(folderPath, "betBtn.png", 20))
            SikuliUtil.clickOnElement(folderPath, "winTxt.png", 10, "");
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Clicked on WIN text"));
    }

    public static void selectLowestBet(String folderPath) {
        SikuliUtil.clickOnElement(folderPath, "soundBtn.png", 30, "");
        SikuliUtil.clickOnElement(folderPath, "betBtn.png", 30, "Clicked on bet button");
        SikuliUtil.clickOnElement(folderPath, "lowestBet.png", 30, "Clicked on lowest bet");
        Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "validateLowestBet.png", 10), "Lowest bet should be selected");
    }

    public static void clickOnSpinBtn(String folderPath) {
        try {
            SikuliUtil.clickOnElement(folderPath, "spinBtn.png", 30, "Clicked on spin button");
            KeywordUtil.delay(10000);
            KeywordUtil.waitForVisible(CommonLocators.gameBalance);
            Constants.constants.setBalanceAfterBetStr(KeywordUtil.getElementText(CommonLocators.gameBalance).replace("EUR ", ""));
            Constants.constants.setNetPositionText("0.10");
            String tmp = "Balance after bet is " + Constants.constants.getBalanceAfterBetStr() + " and bet placed for " + Constants.constants.getNetPositionText();
            LogUtil.infoLog(thisClass, tmp);
            MyTestRunner.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringBlueColor(tmp));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            Assert.fail(e.getMessage());
        }
    }

}
