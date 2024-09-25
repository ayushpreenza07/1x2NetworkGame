package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.GlobalUtil;
import utilities.TestSetupUtil;

import java.util.HashMap;

public class SantasStack {

    public static HashMap<String, String> dataMap = new HashMap<>();
    String gameFolderName = getClass().getSimpleName();
    String folderPath = "";

    @Before
    public void setUp() {
        folderPath = TestSetupUtil.determineFolderPathForResolution(gameFolderName);
    }

    @Then("Validate if Santas Stack game launched in new window")
    public void validateIfSantasStackGameLaunchedInNewWindow() {
        try {
            setUp();
            modules.SantasStack.validateIfGameIsLaunchedInNewWindow(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            Assert.fail(e.getMessage());
        }
    }

    @And("User clicks on Click to continue button inside Santas Stack game")
    public void userClicksOnClickToContinueButtonInsideSantasStackGame() {
        try {
            modules.SantasStack.clickOnClickToContinueBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            Assert.fail(e.getMessage());
        }
    }

    @Then("Validate if minimum bet is pre-selected for Santas Stack game")
    public void validateIfMinimumBetIsPreSelectedForSantasStackGame() {
        try {
            modules.SantasStack.validateIfLowestBetIsSelected(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            Assert.fail(e.getMessage());
        }
    }

    @When("User click on Spin button inside Santas Stack game")
    public void userClickOnSpinButtonInsideSantasStackGame() {
        try {
            modules.FishinFrenzyTheBigCatch.clickOnSpinBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

}
