package modules;

import com.relevantcodes.extentreports.LogStatus;
import commons.Constants;
import step_definitions.MyTestRunner;
import utilities.HTMLReportUtil;
import utilities.KeywordUtil;
import utilities.SikuliUtil;

public class AOTGGodOfStormsIII {

    public static void selectsMinBet(String folderPath) throws InterruptedException {
        SikuliUtil.multiClickOnNthImageElement(folderPath, "minusBtn.png", 10, 2);
        KeywordUtil.delay(2000);
        SikuliUtil.multiClickOnNthImageElement(folderPath, "minusBtn.png", 10, 2);
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Selected the lowest bet"));
    }

    public static void clickOnConfirmBtn(String folderPath) {
        SikuliUtil.clickOnElement(folderPath, "confirmBtn.png", 30, "Clicked on CONFIRM button");
        Constants.constants.setNetPositionText("0.02");
    }

}
