package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

public class AOTGGodOfStormsIII {

    String gameFolderName = getClass().getSimpleName();
    String folderPath = "";

    @Before
    public void setUp() {
        folderPath = KeywordUtil.updateGameObjectsScreenshotsPath(gameFolderName);
    }

    @Then("Validate if AOTG God of storms III game launched in new window")
    public void validateIfAOTGGodOfStormsIIIGameLaunchedInNewWindow() {
        try {
            modules.AgeOfGodsGodOfStorm.validateIfGameLaunched(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User clicks on Continue button inside AOTG God of storms III game")
    public void userClicksOnContinueButtonInsideAOTGGodOfStormsIIIGame() {
        try {
            modules.AgeOfGodsGodOfStorm.clickOnContinueBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User selects minimum bet for AOTG God of storms III game")
    public void userSelectsMinimumBetForAOTGGodOfStormsIIIGame() {
        try {
            modules.AOTGGodOfStormsIII.selectsMinBet(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User clicks on confirm button for AOTG God of storms III game")
    public void userClicksOnConfirmButtonForAOTGGodOfStormsIIIGame() {
        try {
            modules.AOTGGodOfStormsIII.clickOnConfirmBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("Validate if minimum bet is selected for AOTG God of storms III game")
    public void validateIfMinimumBetIsSelectedForAOTGGodOfStormsIIIGame() {
        try {
            modules.KingKongCGBJackpotKing.validateLowestBet(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("User clicks on Spin button inside AOTG God of storms III game")
    public void userClicksOnSpinButtonInsideAOTGGodOfStormsIIIGame() {
        try {
            modules.AgeOfGodsGodOfStorm.clickOnSpinBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

}
