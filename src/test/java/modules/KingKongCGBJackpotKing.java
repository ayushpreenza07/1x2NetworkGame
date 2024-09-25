package modules;

import com.relevantcodes.extentreports.LogStatus;
import commons.CommonLocators;
import commons.Constants;
import org.sikuli.script.*;
import org.testng.Assert;
import step_definitions.MyTestRunner;
import step_definitions.MyTestRunner;
import utilities.*;

import java.io.File;

public class KingKongCGBJackpotKing {

    static Class<KingKongCashEBBJKing> thisClass = KingKongCashEBBJKing.class;

    public static void validateIfGameLaunchedInNewWindow(String folderPath) throws FindFailed {
        Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "gameName.png", 300), "Game name should be visible");
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Validated that game launched in new window"));
    }

    public static void clickOnGameName(String folderPath) throws FindFailed {
        KeywordUtil.waitForVisible(CommonLocators.gameBalance);
        Constants.constants.setBalanceBeforeBetStr(KeywordUtil.getElementText(CommonLocators.gameBalance).replace("EUR ", ""));
        String tmp = "Balance before bet is " + Constants.constants.getBalanceBeforeBetStr();
        LogUtil.infoLog(thisClass, tmp);
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(tmp));

        Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "kongImg.png", 90), "Kong image should be visible");
        Region reg = new Screen();
        Match m = reg.find(new Pattern(folderPath + File.separator + "kongImg.png"));
        for (int i = 0; i <= 1; i++)
            new Location(m.getX(), m.getY()).click();
        if (!SikuliUtil.doElementExist(folderPath, "betBtn.png", 20))
            new Location(m.getX(), m.getY()).click();
        MyTestRunner.logger.log(LogStatus.PASS, "Clicked on game name text");
    }

    public static void validateLowestBet(String folderPath) {
        Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "validateLowestBet.png", 30), "Lowest bet should be selected");
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Validated that lowest bet is selected in the game"));
    }

}
