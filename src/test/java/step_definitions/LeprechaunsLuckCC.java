package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

public class LeprechaunsLuckCC {

    static Class<LeprechaunsLuckCC> thisClass = LeprechaunsLuckCC.class;
    String gameFolderName = thisClass.getSimpleName();
    String folderPath = "";

    @Before
    public void setUp() {
        folderPath = KeywordUtil.updateGameObjectsScreenshotsPath(gameFolderName);
    }

    @Then("Validate if Leprechauns Luck Cash Collect game launched in new window")
    public void validateIfLeprechaunsLuckCashCollectGameLaunchedInNewWindow() {
        try {
            modules.LeprechaunsLuckCC.validateIfGameLaunchedInNewWindow(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("User clicks on play button inside Leprechauns Luck Cash Collect game")
    public void userClicksOnPlayButtonInsideLeprechaunsLuckCashCollectGame() {
        try {
            modules.LeprechaunsLuckCC.clickOnPlayBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User turn off the audio for Leprechauns Luck Cash Collect game")
    public void userTurnOffTheAudioForLeprechaunsLuckCashCollectGame() {
        try {
            modules.LeprechaunsLuckCC.turnOffTheAudio(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User selects minimum bet for Leprechauns Luck Cash Collect game")
    public void userSelectsMinimumBetForLeprechaunsLuckCashCollectGame() {
        try {
            modules.LeprechaunsLuckCC.selectsMinBet(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("Validate if minimum bet is selected for Leprechauns Luck Cash Collect game")
    public void validateIfMinimumBetIsSelectedForLeprechaunsLuckCashCollectGame() {
        try {
            modules.LeprechaunsLuckCC.validateIfMinBetIsSelected(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("User clicks on spin button in Leprechauns Luck Cash Collect game")
    public void userClicksOnSpinButtonInLeprechaunsLuckCashCollectGame() {
        try {
            modules.LeprechaunsLuckCC.clickOnSpinBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

}
