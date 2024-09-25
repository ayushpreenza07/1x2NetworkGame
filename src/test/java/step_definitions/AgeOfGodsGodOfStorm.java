package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.GlobalUtil;
import utilities.TestSetupUtil;

public class AgeOfGodsGodOfStorm {

    String gameFolderName = "AOTG_GodOfStorms";
    String folderPath = "";

    @Before
    public void setUp() {
        folderPath = TestSetupUtil.determineFolderPathForResolution(gameFolderName);
    }

    @Then("Validate if AOTG God of Storms game launched in new window")
    public void validateIfAOTGGodOfStormsGameLaunchedInNewWindow() {
        try {
            modules.AgeOfGodsGodOfStorm.validateIfGameLaunched(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User search for \"([^\"]*)\" inside Casino search bar$")
    public void userSearchForInsideCasinoSearchBar(String gameName) {
        try {
            modules.AgeOfGodsGodOfStorm.searchForGameInCasino(gameName);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User clicks on the desired game inside Casino search result")
    public void userClicksOnTheDesiredGameInsideCasinoSearchResult() {
        try {
            modules.AgeOfGodsGodOfStorm.clickOnAGameInsideCasinoSearchResult();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User clicks on Continue button inside AOTG God of Storms game")
    public void userClicksOnContinueButtonInsideAOTGGodOfStormsGame() {
        try {
            modules.AgeOfGodsGodOfStorm.clickOnContinueBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("Validate if minimum bet is pre-selected for AOTG God of Storms game")
    public void validateIfMinimumBetIsPreSelectedForAOTGGodOfStormsGame() {
        try {
            modules.AgeOfGodsGodOfStorm.validateIfLowestBetIsSelected(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("User clicks on Spin button inside AOTG God of Storms game")
    public void userClicksOnSpinButtonInsideAOTGGodOfStormsGame() {
        try {
            modules.AgeOfGodsGodOfStorm.clickOnSpinBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

}
