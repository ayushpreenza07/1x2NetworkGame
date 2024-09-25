package modules;

import com.relevantcodes.extentreports.LogStatus;
import step_definitions.MyTestRunner;
import utilities.HTMLReportUtil;
import utilities.SikuliUtil;

public class RickAndMortyWubbaLubbaDDJKing {

    public static void selectsMinBetWithDownBtn(String folderPath, int clickCount) {
        SikuliUtil.multiClickOnNthImageElement(folderPath, "downBtn.png", clickCount, 2);
        MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Selected the lowest bet"));
    }

}
