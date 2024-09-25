package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utilities.*;

import java.util.HashMap;

public class BoylesportsPOC extends KeywordUtil {

    String gameFolderName = "Mega_Fire_Blaze";
    String folderPath = "";

    @Before
    public void setUp() {
        folderPath = TestSetupUtil.determineFolderPathForResolution(gameFolderName);
    }

//----------------------------------------------------------------------------------------------->

    @Given("^Navigate to the boyle url$")
    public void navigate_to_the_boyle_url() {
        try {
            navigateToUrl(ConfigReader.getValue("PROD_URL"));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Given("Navigate to the \"([^\"]*)\" boylesports url$")
    public void navigateToTheBoylesportsUrl(String env) {
        try {
            if (env.equalsIgnoreCase("prod"))
                navigateToUrl(ConfigReader.getValue("PROD_URL"));
            else if (env.equalsIgnoreCase("staging"))
                navigateToUrl(ConfigReader.getValue("M1_URL"));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("User accepts the cookies")
    public void userAcceptsTheCookies() {
        try {
            modules.BoyleLogin.acceptAllCookies();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User clicks on Games tab from header")
    public void userClicksOnGamesTabFromHeader() {
        try {
            modules.BoyleLogin.clickOnGamesTabHeader();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User navigates to game window")
    public void userNavigatesToGameWindow() {
        try {
            commons.CommonMethods.navigateToGameWindow();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

//----------------------------------------------------------------------------------------------->

    @When("^Choose casino option$")
    public void choose_casino_option() {
        try {
            modules.BoyleLogin.chooseCasinoOption();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("^Enter the Boyle login credentials$")
    public void enter_the_Boyle_login_credentials() {
        try {
            modules.BoyleLogin.login();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("Enter the Boyle Games login credentials")
    public void enter_the_boyle_games_login_credentials() {
        try {
            modules.BoyleLogin.gamesLogin();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @When("^User choose the mega fire blaze game$")
    public void user_choose_the_mega_fire_blaze_game() {
        try {
            modules.BoylePlayCasinoGame.chooseMegaFireBlazeGame();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("^User click on play icon for mfb$")
    public void user_click_on_play_icon_for_mfb() {
        try {
            setUp();
            modules.BoylePlayCasinoGame.playMegaFireBlazeGame(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("^User place the minimum bet for mfb$")
    public void user_place_the_minimum_bet_for_mfb() {
        try {
            modules.BoylePlayCasinoGame.placeBetForMegaFireBlazeGame(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("^User spin and try his luck in mfb$")
    public void user_spin_and_try_his_luck_in_mfb() {
        try {
            modules.BoylePlayCasinoGame.spinMegaFireBlazeGame(folderPath);
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

}
