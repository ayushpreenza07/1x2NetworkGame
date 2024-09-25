package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.GlobalUtil;
import utilities.TestSetupUtil;

public class QOTPMegaCash {

    String gameFolderName = getClass().getSimpleName();
    String folderPath = "";

    @Before
    public void setUp() {
        folderPath = TestSetupUtil.determineFolderPathForResolution(gameFolderName);
    }

    @Then("Validate if QOTP Mega Cash game launched in new window")
    public void validateIfQOTPMegaCashGameLaunchedInNewWindow() {
        try {
            modules.QOTPMegaCash.validateIfGameLaunchedInNewWindow(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("User clicks on play button inside QOTP Mega Cash game")
    public void userClicksOnPlayButtonInsideQOTPMegaCashGame() {
        try {
            modules.QOTPMegaCash.clickOnPlayBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User selects the minimum bet for QOTP Mega Cash game")
    public void userSelectsTheMinimumBetForQOTPMegaCashGame() {
        try {
            modules.QOTPMegaCash.selectsMinBet(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("User clicks on spin button inside QOTP Mega Cash game")
    public void userClicksOnSpinButtonInsideQOTPMegaCashGame() {
        try {
            modules.QOTPMegaCash.clickOnSpinBtn(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("Validate if minimum bet is selected for QOTP Mega Cash game")
    public void validateIfMinimumBetIsSelectedForQOTPMegaCashGame() {
        try {
            modules.QOTPMegaCash.validateIfLowestBetIsSelected(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

}