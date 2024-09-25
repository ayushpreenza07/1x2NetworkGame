package modules;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import step_definitions.MyTestRunner;
import step_definitions.MyTestRunner;
import utilities.HTMLReportUtil;
import utilities.KeywordUtil;
import utilities.SikuliUtil;

public class LuckyEmeralds {

    public static void selectsMinBet(String folderPath) throws InterruptedException {
        SikuliUtil.clickOnElement(folderPath, "minusBtn.png", 30, "");
        KeywordUtil.delay(2000);
        SikuliUtil.multiClickOnNthImageElement(folderPath, "minusBtn.png", 15, 2);
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Selected the lowest bet"));
        Assert.assertTrue(SikuliUtil.doElementExist(folderPath, "validateLowestBet.png", 30), "Lowest bet should be selected");
    }

}

