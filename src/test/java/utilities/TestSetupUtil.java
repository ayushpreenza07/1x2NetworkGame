package utilities;

import java.awt.*;
import java.io.File;

public class TestSetupUtil {

    public static String determineFolderPathForResolution(String GameFolderName) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        int desiredWidth = Integer.parseInt(ConfigReader.getValue("DefaultScreenWidth"));
        int desiredHeight = Integer.parseInt(ConfigReader.getValue("DefaultScreenHeight"));

        String folderPath = System.getProperty("user.dir") + File.separator +
                ConfigReader.getValue("GameScreenshotPath") + File.separator + GameFolderName + File.separator;

        // Modify folder path based on screen resolution
//        if (screenWidth == desiredWidth && screenHeight == desiredHeight)
//            folderPath += "1920_1080";
//        else if (screenWidth == 1366 && screenHeight == 768)
//            folderPath += "1366_768";
//        else if (screenWidth == 1280 && screenHeight == 800)
//            folderPath += "1280_800";

        return folderPath;
    }

}
