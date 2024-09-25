package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

public class GoldHitOReillysCharms {

    String gameFolderName = getClass().getSimpleName();
    String folderPath = "";

    @Before
    public void setUp() {
        folderPath = KeywordUtil.updateGameObjectsScreenshotsPath(gameFolderName);
    }

    @Then("Validate if Gold Hit: O Reillys Charms game launched in new window")
    public void validateIfGoldHitOReillysCharmsGameLaunchedInNewWindow() {
        try {
            modules.LegacyOfDead.validateIfGameLaunchedInNewWindow(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("User turn off the audio for Gold Hit: O Reillys Charms game")
    public void userTurnOffTheAudioForGoldHitOReillysCharmsGame() {
        try {
            modules.LegacyOfDead.turnOffTheAudio(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User clicks on play button in Gold Hit: O Reillys Charms game")
    public void userClicksOnPlayButtonInGoldHitOReillysCharmsGame() {
        try {
            modules.LeprechaunsLuckCC.clickOnPlayBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User selects minimum bet in Gold Hit: O Reillys Charms game and close the popup")
    public void userSelectsMinimumBetInGoldHitOReillysCharmsGameAndCloseThePopup() {
        try {
            modules.GoldHitOReillysCharms.selectsMinBet(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("Validate if minimum bet is selected for Gold Hit: O Reillys Charms game")
    public void validateIfMinimumBetIsSelectedForGoldHitOReillysCharmsGame() {
        try {
            modules.QOTPMegaCash.validateIfLowestBetIsSelected(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("User clicks on spin button for Gold Hit: O Reillys Charms game")
    public void userClicksOnSpinButtonForGoldHitOReillysCharmsGame() {
        try {
            modules.LeprechaunsLuckCC.clickOnSpinBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

}
