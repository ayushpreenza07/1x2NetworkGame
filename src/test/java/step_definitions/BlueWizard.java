package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.GlobalUtil;
import utilities.TestSetupUtil;

import java.util.HashMap;

public class BlueWizard {

    public static HashMap<String, String> dataMap = new HashMap<>();
    String gameFolderName = getClass().getSimpleName();
    String folderPath = "";

    @Before
    public void setUp() {
        folderPath = TestSetupUtil.determineFolderPathForResolution(gameFolderName);
    }

    @Then("Validate if Blue Wizard game launched in new window")
    public void validateIfBlueWizardGameLaunchedInNewWindow() {
        try {
            //TODO - In case steps are reused
            setUp();

            modules.BlueWizard.validateIfBlueWizardGameIsLoaded(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("User clicks on start button on Blue Wizard game")
    public void userClicksOnStartButtonOnBlueWizardGame() {
        try {
            modules.BlueWizard.clickOnStartBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User selects minimum bet on Blue Wizard game")
    public void userSelectsMinimumBetOnBlueWizardGame() {
        try {
            modules.BlueWizard.selectsMinBet(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("Validate if minimum bet is selected for Blue Wizard game")
    public void validateIfMinimumBetIsSelectedForBlueWizardGame() {
        try {
            modules.BlueWizard.validateIfLowestBetIsSelected(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("User clicks on spin button in Blue Wizard game")
    public void userClicksOnSpinButtonInBlueWizardGame() {
        try {
            modules.BlueWizard.clickOnSpinBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

}
