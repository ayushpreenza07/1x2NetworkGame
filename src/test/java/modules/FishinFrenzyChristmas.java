package modules;

import com.relevantcodes.extentreports.LogStatus;
import commons.CommonLocators;
import commons.Constants;
import org.sikuli.script.Location;
import org.sikuli.script.Match;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import org.testng.Assert;
import step_definitions.MyTestRunner;
import step_definitions.MyTestRunner;
import utilities.*;

import java.io.File;

public class FishinFrenzyChristmas {

    public static void clickOnPlayBtn(String folderPath) {
        KeywordUtil.waitForVisible(CommonLocators.gameBalance, 90);
        Constants.constants.setBalanceBeforeBetStr(KeywordUtil.getElementText(CommonLocators.gameBalance).replace("EUR ", ""));
        String tmp = "Balance before bet: " + Constants.constants.getBalanceBeforeBetStr();
        LogUtil.infoLog(ImmortalWaysCharms.class, tmp);
        MyTestRunner.logger.log(LogStatus.INFO, HTMLReportUtil.infoStringBlueColor(tmp));
        SikuliUtil.clickOnElement(folderPath, "playBtn.png", 120, "Clicked on play button");
        if (!SikuliUtil.doElementExist(folderPath, "spinBtn.png", 10))
            SikuliUtil.clickOnElement(folderPath, "playBtn.png", 10, "");
    }

    public static void selectingLowestBet(String folderPath) {
        try {
            SikuliUtil.clickOnElement(folderPath, "betBtn.png", 30, "");
            KeywordUtil.delay(2000);
            try {
                SikuliUtil.clickOnElement(folderPath, "lowestBet.png", 30, "");
            } catch (Throwable e) {
                Region reg = new Screen();
                Match m = reg.find(folderPath + File.separator + "lowestBet.png");
                new Location(m.getX(), m.getY()).click();
            }
            MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Selected the lowest bet"));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            Assert.fail(e.getMessage());
        }
    }

    public static void turnOffAudio(String folderPath) {
        SikuliUtil.clickOnElement(folderPath, "soundIcon.png", 30, "Clicked on sound button");
    }

}
