package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

public class KingKongCGBJackpotKing {

    static Class<KingKongCGBJackpotKing> thisClass = KingKongCGBJackpotKing.class;
    String gameFolderName = thisClass.getSimpleName();
    String folderPath = "";

    @Before
    public void setUp() {
        folderPath = KeywordUtil.updateGameObjectsScreenshotsPath(gameFolderName);
    }

    @Then("Validate if King Kong Cash Go Bananas Jackpot King game launched in new window")
    public void validateIfKingKongCashGoBananasJackpotKingGameLaunchedInNewWindow() {
        try {
            modules.KingKongCGBJackpotKing.validateIfGameLaunchedInNewWindow(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("User clicks on the screen for King Kong Cash Go Bananas Jackpot King")
    public void userClicksOnTheScreenForKingKongCashGoBananasJackpotKing() {
        try {
            modules.KingKongCGBJackpotKing.clickOnGameName(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User selects the minimum bet for King Kong Cash Go Bananas Jackpot King")
    public void userSelectsTheMinimumBetForKingKongCashGoBananasJackpotKing() {
        try {
            modules.KingKongCashEBBJKing.selectLowestBet(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("Validate if minimum bet is selected for King Kong Cash Go Bananas Jackpot King")
    public void validateIfMinimumBetIsSelectedForKingKongCashGoBananasJackpotKing() {
        try {
            modules.KingKongCGBJackpotKing.validateLowestBet(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User clicks on spin button for King Kong Cash Go Bananas Jackpot King")
    public void userClicksOnSpinButtonForKingKongCashGoBananasJackpotKing() {
        try {
            modules.KingKongCashEBBJKing.clickOnSpinBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

}
