package modules;

import utilities.SikuliUtil;

public class TheGooniesReturnJKing {

    public static void clickOnArrowBtnInsideIntroductionScreen(String folderPath) {
        SikuliUtil.clickOnElement(folderPath, "arrowBtnInsideIntroScreen.png", 30, "Clicked on arrow button inside introduction screen");
    }

}
