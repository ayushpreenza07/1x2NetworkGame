package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

public class GoldCashFreeSpins {

    static Class<GoldCashFreeSpins> thisClass = GoldCashFreeSpins.class;
    String gameFolderName = thisClass.getSimpleName();
    String folderPath = "";

    @Before
    public void setUp() {
        folderPath = KeywordUtil.updateGameObjectsScreenshotsPath(gameFolderName);
    }

    @Then("Validate if Gold Cash Free Spins game launched in new window")
    public void validateIfGoldCashFreeSpinsGameLaunchedInNewWindow() {
        try {
            setUp();
            modules.GoldCashFreeSpins.validateIfGameLaunchedInNewWindow(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("User clicks on Click screen to continue button in Gold Cash Free Spins game")
    public void userClicksOnClickScreenToContinueButtonInGoldCashFreeSpinsGame() {
        try {
            modules.GoldCashFreeSpins.clickOnClickScreenToContinueBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User selects minimum bet for Gold Cash Free Spins game")
    public void userSelectsMinimumBetForGoldCashFreeSpinsGame() {
        try {
            modules.GoldCashFreeSpins.selectsMinBet(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("Validate if minimum bet is selected in Gold Cash Free Spins game")
    public void validateIfMinimumBetIsSelectedInGoldCashFreeSpinsGame() {
        try {
            modules.GoldCashFreeSpins.validateIfMinBetIsSelected(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("User clicks on spin button in Gold Cash Free Spins game")
    public void userClicksOnSpinButtonInGoldCashFreeSpinsGame() {
        try {
            modules.GoldCashFreeSpins.clickOnSpinBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

}
