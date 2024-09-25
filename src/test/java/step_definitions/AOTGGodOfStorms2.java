package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.GlobalUtil;
import utilities.KeywordUtil;
import utilities.TestSetupUtil;

public class AOTGGodOfStorms2 extends KeywordUtil {

    String gameFolderName = "AOTG_God_Of_Storms";
    String folderPath = "";

    @Before
    public void setUp() {
        folderPath = TestSetupUtil.determineFolderPathForResolution(gameFolderName);
    }

    @When("^User choose the AOTG god of storms 2 game$")
    public void user_choose_the_AOTG_game() {
        try {
            modules.AOTGGodOfStorms.chooseGodOfStormsLuckGame();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("^User click on play icon for AOTG$")
    public void user_click_on_play_icon_for_aotg() {
        try {
            modules.AOTGGodOfStorms.playAotgLuckGame(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("^User place the minimum bet for AOTG$")
    public void user_place_the_minimum_bet_for_aotg() {
        try {
            modules.AOTGGodOfStorms.placeBetForAOTGGame(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("^User spin and try his luck in AOTG$")
    public void user_spin_and_try_his_luck_in_ll() {
        try {
            modules.AOTGGodOfStorms.spinAOTGGame(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

}
