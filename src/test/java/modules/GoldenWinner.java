package modules;

import utilities.SikuliUtil;

public class GoldenWinner {

    public static void clickOnTouchToContinueBtn(String folderPath) {
        SikuliUtil.clickOnElement(folderPath, "touchToContinueBtn.png", 120, "Clicked on TOUCH TO CONTINUE button");
    }

}
