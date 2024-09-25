package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.GlobalUtil;
import utilities.TestSetupUtil;

import java.util.HashMap;

public class SaintNicked {

    public static HashMap<String, String> dataMap = new HashMap<String, String>();
    String gameFolderName = "SaintNicked";
    String folderPath = "";

    @Before
    public void setUp() {
        folderPath = TestSetupUtil.determineFolderPathForResolution(gameFolderName);
    }

    @And("User click on Start button inside Saint Nicked game")
    public void userClickOnStartButtonInsideSaintNickedGame() {
        try {
            modules.SaintNicked.clickOnStartBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User click on skip button inside Saint Nicked game")
    public void userClickOnSkipButtonInsideSaintNickedGame() {
        try {
            modules.SaintNicked.clickOnSkipBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User selects the minimum bet for Saint Nicked game")
    public void userSelectsTheMinimumBetForSaintNickedGame() {
        try {
            modules.SaintNicked.selectingLowestBet(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("Validate if minimum bet is selected")
    public void validateIfMinimumBetIsSelected() {
        try {
            modules.SaintNicked.validateIfLowestBetIsSelected(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("User click on Spin button inside Saint Nicked game")
    public void userClickOnSpinButtonInsideSaintNickedGame() {
        try {
            modules.SaintNicked.clickOnSpinBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

}
