package commons;

import com.relevantcodes.extentreports.LogStatus;
import modules.ImmortalWaysCharms;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import step_definitions.MyTestRunner;
import utilities.GlobalUtil;
import utilities.HTMLReportUtil;
import utilities.KeywordUtil;
import utilities.LogUtil;

import java.math.BigDecimal;

public class CommonMethods {

    public static void navigateToGameWindow() {
        Assert.assertTrue(KeywordUtil.switchToWindow(), "Unable to switch window");
        KeywordUtil.maximizeWindow();
        KeywordUtil.waitForPageToLoad();
    }

    public static void validateBalance() {
        try {
            // Convert balance strings to BigDecimal for precise arithmetic
            BigDecimal balanceBeforeBetDecimal = new BigDecimal(Constants.constants.getBalanceBeforeBetStr());
            BigDecimal balanceAfterBetDecimal = new BigDecimal(Constants.constants.getBalanceAfterBetStr());
            BigDecimal netPosition = new BigDecimal(Constants.constants.getNetPositionText());
            BigDecimal maxLossDecimal = balanceBeforeBetDecimal.subtract(netPosition);
            String tmp = "";

            // Check if balance decreased beyond the maximum allowable loss, indicating a loss
            if (balanceAfterBetDecimal.compareTo(maxLossDecimal) < 0) {
                tmp = "User has lost the bet. The deducted amount exceeds the bet.";
            }

            // Check if balance decreased, indicating a loss within the maximum allowable limit
            else if (balanceAfterBetDecimal.compareTo(maxLossDecimal) == 0) {
                tmp = "User has lost the bet and bet amount <b>(" + netPosition + ")</b> is deducted";
            }

            // Check if balance decreased, indicating a loss within the maximum allowable limit
            else if (balanceAfterBetDecimal.compareTo(maxLossDecimal) > 0) {
                // Check if balance increased, indicating a win
                if (balanceAfterBetDecimal.compareTo(balanceBeforeBetDecimal) > 0) {
                    BigDecimal profitDecimal = balanceAfterBetDecimal.subtract(balanceBeforeBetDecimal);
                    BigDecimal netProfit = profitDecimal.add(netPosition);
                    tmp = "User has won the bet and " + netProfit + " amount is credited";
                } else
                    tmp = "User has lost the bet and " + netPosition.subtract(balanceAfterBetDecimal.subtract(maxLossDecimal)) + " amount is deducted";
            }

            // Check if balance remained the same, indicating no change
            else if (balanceAfterBetDecimal.compareTo(balanceBeforeBetDecimal) == 0) {
                tmp = "User's balance remains unchanged.";
            }

            // If none of the above conditions are met, there might be an issue with the data or logic
            else {
                tmp = "Unable to determine bet outcome. Check the data or logic.";
                MyTestRunner.logger.log(LogStatus.FAIL, HTMLReportUtil.failStringRedColor(tmp));
                Assert.fail(tmp);
            }

            MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor(tmp));
            LogUtil.infoLog(ImmortalWaysCharms.class, tmp);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            Assert.fail(e.getMessage());
        }
    }

    public static void selectGame(String gameName) {
        try {
            By gameImg = By.cssSelector("#GamesSearchResult [alt='" + gameName + "']");
            KeywordUtil.waitForVisible(gameImg, 20);
            KeywordUtil.delay(2000);
            KeywordUtil.waitForVisible(gameImg);
            KeywordUtil.hoverOnElement(gameImg);

            //Following modification is performed if play icon is not clicked once...
            KeywordUtil.click(By.xpath(CommonLocators.playIconOnGame.replace("gameName", gameName)), "");
            if (!new WebDriverWait(GlobalUtil.getDriver(), 20).until(ExpectedConditions.numberOfWindowsToBe(2)))
                KeywordUtil.click(By.xpath(CommonLocators.playIconOnGame.replace("gameName", gameName)), "");

            MyTestRunner.logger.log(LogStatus.PASS, HTMLReportUtil.passStringGreenColor("Clicked on play button after hovering on the game"));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            Assert.fail(e.getMessage());
        }
    }

}
