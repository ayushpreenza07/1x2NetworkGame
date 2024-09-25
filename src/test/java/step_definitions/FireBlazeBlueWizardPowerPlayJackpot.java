package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

public class FireBlazeBlueWizardPowerPlayJackpot {

    String gameFolderName = getClass().getSimpleName();
    String folderPath = "";

    @Before
    public void setUp() {
        folderPath = KeywordUtil.updateGameObjectsScreenshotsPath(gameFolderName);
    }

    @Then("Validate if Fire Blaze Blue Wizard PowerPlay Jackpot game launched in new window")
    public void validateIfFireBlazeBlueWizardPowerPlayJackpotGameLaunchedInNewWindow() {
        try {
            modules.BlueWizard.validateIfBlueWizardGameIsLoaded(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail();
        }
    }

    @When("User clicks on start button on Fire Blaze: Blue Wizard PowerPlay Jackpot game")
    public void userClicksOnStartButtonOnFireBlazeBlueWizardPowerPlayJackpotGame() {
        try {
            modules.BlueWizard.clickOnStartBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail();
        }
    }

    @And("User selects minimum bet on Fire Blaze: Blue Wizard PowerPlay Jackpot game with minus button")
    public void userSelectsMinimumBetOnFireBlazeBlueWizardPowerPlayJackpotGameWithMinusButton() {
        try {
            modules.BlueWizard.selectsMinBet(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("Validate if minimum bet is selected for Fire Blaze: Blue Wizard PowerPlay Jackpot game")
    public void validateIfMinimumBetIsSelectedForFireBlazeBlueWizardPowerPlayJackpotGame() {
        try {
            modules.BlueWizard.validateIfLowestBetIsSelected(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("User clicks on spin button in Fire Blaze: Blue Wizard PowerPlay Jackpot game")
    public void userClicksOnSpinButtonInFireBlazeBlueWizardPowerPlayJackpotGame() {
        try {
            modules.BlueWizard.clickOnSpinBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

}

