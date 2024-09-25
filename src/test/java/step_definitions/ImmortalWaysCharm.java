package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import utilities.GlobalUtil;
import utilities.TestSetupUtil;

import java.util.HashMap;

public class ImmortalWaysCharm {

    public static HashMap<String, String> dataMap = new HashMap<String, String>();
    String gameFolderName = "ImmortalWaysCharms";
    String folderPath = "";

    @Before
    public void setUp() {
        folderPath = TestSetupUtil.determineFolderPathForResolution(gameFolderName);
    }

    @And("User click on Start button inside Immortal Ways Charms game")
    public void userClickOnStartButtonInsideImmortalWaysCharmsGame() {
        try {
            modules.ImmortalWaysCharms.ClickOnStartBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("User place the minimum bet for Immortal Ways Charms game")
    public void userPlaceTheMinimumBetForImmortalWaysCharmsGame() {
        try {
            modules.ImmortalWaysCharms.selectLowestBet(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("User clicks on Spin button in Immortal Ways Charms game")
    public void userClicksOnSpinButtonInImmortalWaysCharmsGame() {
        try {
            modules.ImmortalWaysCharms.ClickOnSpinBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("Validate if the balance is updated")
    public void validateIfTheBalanceIsUpdated() {
        try {
            commons.CommonMethods.validateBalance();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("Validate if Immortal Ways Charms game is launched in new window")
    public void validateIfImmortalWaysCharmsGameIsLaunchedInNewWindow() {
        try {
            modules.ImmortalWaysCharms.verifyGameIsLaunchedInNewWindow(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }
}
