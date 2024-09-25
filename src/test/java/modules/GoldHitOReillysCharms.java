package modules;

import com.relevantcodes.extentreports.LogStatus;
import step_definitions.MyTestRunner;
import utilities.HTMLReportUtil;
import utilities.SikuliUtil;

public class GoldHitOReillysCharms {

    public static void selectsMinBet(String folderPath) {
        SikuliUtil.multiClickOnNthImageElement(folderPath, "minusBtn.png", 15, 2);
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Selected the lowest bet"));
        SikuliUtil.clickOnElement(folderPath, "crossBtn.png", 20, "Closed the popup");
    }

}
