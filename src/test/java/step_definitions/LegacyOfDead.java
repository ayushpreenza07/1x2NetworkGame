package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

public class LegacyOfDead {

    String gameFolderName = getClass().getSimpleName();
    String folderPath = "";

    @Before
    public void setUp() {
        folderPath = KeywordUtil.updateGameObjectsScreenshotsPath(gameFolderName);
    }

    @Then("Validate if Legacy of Dead game is launched in new window")
    public void validateIfLegacyOfDeadGameIsLaunchedInNewWindow() {
        try {
            modules.LegacyOfDead.validateIfGameLaunchedInNewWindow(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("User clicks on continue button inside Legacy of Dead game")
    public void userClicksOnContinueButtonInsideLegacyOfDeadGame() {
        try {
            modules.LegacyOfDead.clickOnContinueBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User turn off the audio for Legacy of Dead game")
    public void userTurnOffTheAudioForLegacyOfDeadGame() {
        try {
            modules.LegacyOfDead.turnOffTheAudio(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User selects minimum bet for Legacy of Dead game")
    public void userSelectsMinimumBetForLegacyOfDeadGame() {
        try {
            modules.LegacyOfDead.selectsMinBet(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User clicks on spin button inside Legacy of Dead game")
    public void userClicksOnSpinButtonInsideLegacyOfDeadGame() {
        try {
            modules.LegacyOfDead.clickOnSpinBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

}
