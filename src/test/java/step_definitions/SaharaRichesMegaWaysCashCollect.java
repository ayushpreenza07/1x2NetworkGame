package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

public class SaharaRichesMegaWaysCashCollect {

    String gameFolderName = getClass().getSimpleName();
    String folderPath = "";

    @Before
    public void setUp() {
        folderPath = KeywordUtil.updateGameObjectsScreenshotsPath(gameFolderName);
    }

    @Then("Validate if Sahara Riches Megaways Cash Collect game launched in new window")
    public void validateIfSaharaRichesMegawaysCashCollectGameLaunchedInNewWindow() {
        try {
            modules.QOTPMegaCash.validateIfGameLaunchedInNewWindow(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("User clicks on play button in Sahara Riches Megaways Cash Collect game")
    public void userClicksOnPlayButtonInSaharaRichesMegawaysCashCollectGame() {
        try {
            modules.QOTPMegaCash.clickOnPlayBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User selects the minimum bet from the bet selector popup in Sahara Riches Megaways Cash Collect game")
    public void userSelectsTheMinimumBetFromTheBetSelectorPopupInSaharaRichesMegawaysCashCollectGame() {
        try {
            modules.QOTPMegaCash.selectsMinBet(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("Validate if minimum bet is selected for Sahara Riches Megaways Cash Collect game")
    public void validateIfMinimumBetIsSelectedForSaharaRichesMegawaysCashCollectGame() {
        try {
            modules.QOTPMegaCash.validateIfLowestBetIsSelected(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("User clicks on spin button in Sahara Riches Megaways Cash Collect game")
    public void userClicksOnSpinButtonInSaharaRichesMegawaysCashCollectGame() {
        try {
            modules.QOTPMegaCash.clickOnSpinBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

}
