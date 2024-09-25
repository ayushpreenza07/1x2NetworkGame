package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.GlobalUtil;
import utilities.TestSetupUtil;

import java.util.HashMap;

public class HalloweenFortune {

    public static HashMap<String, String> dataMap = new HashMap<>();
    String gameFolderName = getClass().getSimpleName();
    String folderPath = "";

    @Before
    public void setUp() {
        folderPath = TestSetupUtil.determineFolderPathForResolution(gameFolderName);
    }

    @Then("Validate if Halloween Fortune game launched in new window")
    public void validateIfHalloweenFortuneGameLaunchedInNewWindow() {
        try {
            setUp();
            modules.HalloweenFortune.validateIfGameLaunchedInNewWindow(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User selects minimum bet on Halloween Fortune game")
    public void userSelectsMinimumBetOnHalloweenFortuneGame() {
        try {
            modules.HalloweenFortune.selectsMinBet(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("Validate if minimum bet is selected for Halloween Fortune game")
    public void validateIfMinimumBetIsSelectedForHalloweenFortuneGame() {
        try {
            modules.HalloweenFortune.validateIfLowestBetIsSelected(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("User clicks on spin button in Halloween Fortune game")
    public void userClicksOnSpinButtonInHalloweenFortuneGame() {
        try {
            modules.HalloweenFortune.clickOnSpinBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

}
