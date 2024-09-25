package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

public class CrabbingForChristmasJK {

    static Class<CrabbingForChristmasJK> thisClass = CrabbingForChristmasJK.class;
    String gameFolderName = thisClass.getSimpleName();
    String folderPath = "";

    @Before
    public void setUp() {
        folderPath = KeywordUtil.updateGameObjectsScreenshotsPath(gameFolderName);
    }

    @Then("Validate if Crabbin for Christmas Jackpot King game launched in new window")
    public void validateIfCrabbinForChristmasJackpotKingGameLaunchedInNewWindow() {
        try {
            modules.CrabbingForChristmasJK.validateIfGameLaunchedInNewWindow(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User clicks on play icon for Crabbin for Christmas Jackpot King game")
    public void userClicksOnPlayIconForCrabbinForChristmasJackpotKingGame() {
        try {
            modules.CrabbingForChristmasJK.clickOnPlayBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("User selects the minimum bet for Crabbin for Christmas Jackpot King game")
    public void userSelectsTheMinimumBetForCrabbinForChristmasJackpotKingGame() {
        try {
            modules.CrabbingForChristmasJK.selectsMinBet(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("User clicks on spin button for Crabbin for Christmas Jackpot King game")
    public void userClicksOnSpinButtonForCrabbinForChristmasJackpotKingGame() {
        try {
            modules.CrabbingForChristmasJK.clickOnSpinBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

}
