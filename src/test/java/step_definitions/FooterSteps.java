package step_definitions;

import commons.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import modules.FooterPage;
import modules.HeaderPage;
import org.testng.Assert;
import utilities.GlobalUtil;

public class FooterSteps {
    @Then("user clicks on About Us in Quick Links section")
    public void user_clicks_on_about_us_in_quick_links_section() {
        try {
            FooterPage.clickAboutUsLink();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the About Us url")
    public void user_validates_the_about_us_url() {
        try {
            Assert.assertTrue(HeaderPage.getPageUrl().contains(Constants.FOOTER_ABOUT_US_PAGE_URL));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks on Shop Locator in Quick Links section")
    public void user_clicks_on_shop_locator_in_quick_links_section() {
        try {
            FooterPage.clickShopLocatorLink();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Shop Locator url")
    public void user_validates_the_shop_locator_url() {
        try {
            Assert.assertTrue(HeaderPage.getPageUrl().contains(Constants.FOOTER_SHOP_LOCATOR_PAGE_URL));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks on Jobs in Quick Links section")
    public void user_clicks_on_jobs_in_quick_links_section() {
        try {
            FooterPage.clickJobsLink();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Jobs url")
    public void user_validates_the_jobs_url() {
        try {
            Assert.assertTrue(HeaderPage.getPageUrl().contains(Constants.FOOTER_JOBS_PAGE_URL));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks on Rule Book in Quick Links section")
    public void user_clicks_on_rule_book_in_quick_links_section() {
        try {
            FooterPage.clickRuleBookLink();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Rule Book url")
    public void user_validates_the_rule_book_url() {
        try {
            Assert.assertTrue(HeaderPage.getPageUrl().contains(Constants.FOOTER_RULE_BOOK_PAGE_URL));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks on Affiliates in Quick Links section")
    public void user_clicks_on_affiliates_in_quick_links_section() {
        try {
            FooterPage.clickAffiliatesLink();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Affiliates url")
    public void user_validates_the_affiliates_url() {
        try {
            Assert.assertTrue(HeaderPage.getPageUrl().contains(Constants.FOOTER_AFFILIATES_PAGE_URL));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks on Be Responsible in Quick Links section")
    public void user_clicks_on_be_responsible_in_quick_links_section() {
        try {
            FooterPage.clickBeResponsibleLink();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Be Responsible url")
    public void user_validates_the_be_responsible_url() {
        try {
            Assert.assertTrue(HeaderPage.getPageUrl().contains(Constants.FOOTER_BE_RESPONSIBLE_PAGE_URL));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks on Privacy and Cookie Policy in Quick Links section")
    public void user_clicks_on_privacy_and_cookie_policy_in_quick_links_section() {
        try {
            FooterPage.clickPrivacyPolicyLink();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Privacy and Cookie Policy url")
    public void user_validates_the_privacy_and_cookie_policy_url() {
        try {
            Assert.assertTrue(HeaderPage.getPageUrl().contains(Constants.FOOTER_PRIVACY_POLICY_PAGE_URL));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks on Fon-A-Bet in Quick Links section")
    public void user_clicks_on_fon_a_bet_in_quick_links_section() {
        try {
            FooterPage.clickFonABetLink();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Fon-A-Bet url")
    public void user_validates_the_fon_a_bet_url() {
        try {
            Assert.assertTrue(HeaderPage.getPageUrl().contains(Constants.FOOTER_FON_A_BET_PAGE_URL));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks on Terms and Conditions in Quick Links section")
    public void user_clicks_on_terms_and_conditions_in_quick_links_section() {
        try {
            FooterPage.clickTermsConditionLink();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Terms and Conditions url")
    public void user_validates_the_terms_and_conditions_url() {
        try {
            Assert.assertTrue(HeaderPage.getPageUrl().contains(Constants.FOOTER_TERMS_CONDITION_PAGE_URL));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks on Manage Cookies in Quick Links section")
    public void user_clicks_on_manage_cookies_in_quick_links_section() {
        try {
            FooterPage.clickManageCookiesLink();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Manage Cookies contents")
    public void user_validates_the_manage_cookies_contents() {
        try {
            Assert.assertTrue(FooterPage.manageCookiesLogoIsPresent());
            Assert.assertTrue(FooterPage.manageTitleIsPresent());
            Assert.assertTrue(FooterPage.manageDescriptionIsPresent());
            Assert.assertTrue(FooterPage.managePrivacyPolicyIsPresent());
            Assert.assertTrue(FooterPage.manageButtonContainerIsPresent());
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks on Help in Customer Service section")
    public void user_clicks_on_help_in_customer_service_section() {
        try {
            FooterPage.clickCustomerServiceHelpLink();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Help url")
    public void user_validates_the_help_url() {
        try {
            Assert.assertTrue(HeaderPage.getPageUrl().contains(Constants.FOOTER_HELP_PAGE_URL));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks on Facebook in Follow Us section")
    public void user_clicks_on_facebook_in_follow_us_section() {
        try {
            FooterPage.clickFacebookIcon();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks on Twitter in Follow Us section")
    public void user_clicks_on_twitter_in_follow_us_section() {
        try {
            FooterPage.clickTwitterIcon();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks on Youtube in Follow Us section")
    public void user_clicks_on_youtube_in_follow_us_section() {
        try {
            FooterPage.clickYoutubeIcon();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks on License Number link in Responsible Gambling section")
    public void user_clicks_on_license_number_link_in_responsible_gambling_section() {
        try {
            FooterPage.clickLicenseLink();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Gambling Commission page url")
    public void user_validates_the_gambling_commission_page_url() {
        try {
            Assert.assertTrue(HeaderPage.getPageUrl().contains(Constants.FOOTER_GAMBLING_COMMISSION_PAGE_URL));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks on Gibraltar Gambling Commission link in Responsible Gambling section")
    public void user_clicks_on_gibraltar_gambling_commission_link_in_responsible_gambling_section() {
        try {
            FooterPage.clickGibGamCommLink();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Gibraltar Gambling Commission page url")
    public void user_validates_the_gibraltar_gambling_commission_page_url() {
        try {
            Assert.assertTrue(HeaderPage.getPageUrl().contains(Constants.FOOTER_GIBRALTAR_GAMBLING_COMMISSIONER_URL));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks on Online Dispute Resolution Platform link in Responsible Gambling section")
    public void user_clicks_on_online_dispute_resolution_platform_link_in_responsible_gambling_section() {
        try {
            FooterPage.clickOnlineDisputeLink();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Online Dispute Resolution Platform page url")
    public void user_validates_the_online_dispute_resolution_platform_page_url() {
        try {
            Assert.assertTrue(HeaderPage.getPageUrl().contains(Constants.FOOTER_ONLINE_DISPUTE_RESOLUTION_URL));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks on Game Fairness link in Responsible Gambling section")
    public void user_clicks_on_game_fairness_link_in_responsible_gambling_section() {
        try {
            FooterPage.clickGameFairnessLink();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Game Fairness page url")
    public void user_validates_the_game_fairness_page_url() {
        try {
            Assert.assertTrue(HeaderPage.getPageUrl().contains(Constants.FOOTER_GAME_FAIRNESS_PAGE_URL));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks on Gibraltar Icon in Responsible Gambling section")
    public void user_clicks_on_gibraltar_icon_in_responsible_gambling_section() {
        try {
            FooterPage.clickGibraltarIcon();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks on Underage Icon in Responsible Gambling section")
    public void user_clicks_on_underage_Icon_in_responsible_gambling_section() {
        try {
            FooterPage.clickUnderageIcon();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Underage page url")
    public void user_validates_the_underage_page_url() {
        try {
            Assert.assertTrue(HeaderPage.getPageUrl().contains(Constants.FOOTER_UNDERAGE_PAGE_URL));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks on IBAS Icon in Responsible Gambling section")
    public void user_clicks_on_ibas_Icon_in_responsible_gambling_section() {
        try {
            FooterPage.clickIBASIcon();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the IBAS page url")
    public void user_validates_the_ibas_page_url() {
        try {
            Assert.assertTrue(HeaderPage.getPageUrl().contains(Constants.FOOTER_IBAS_PAGE_URL));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks on GamCare Icon in Responsible Gambling section")
    public void user_clicks_on_gamcare_Icon_in_responsible_gambling_section() {
        try {
            FooterPage.clickGamCareIcon();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the GamCare page url")
    public void user_validates_the_gamcare_page_url() {
        try {
            Assert.assertTrue(HeaderPage.getPageUrl().contains(Constants.FOOTER_GAMCARE_PAGE_URL));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks on GamblingCare Icon in Responsible Gambling section")
    public void user_clicks_on_gamblingcare_icon_in_responsible_gambling_section() {
        try {
            FooterPage.clickGamblingCareIcon();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the GamblingCare page url")
    public void user_validates_the_gamblingcare_page_url() {
        try {
            Assert.assertTrue(HeaderPage.getPageUrl().contains(Constants.FOOTER_GAMBLING_CARE_PAGE_URL));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks on BeGambleAware Icon in Responsible Gambling section")
    public void user_clicks_on_begambleaware_icon_in_responsible_gambling_section() {
        try {
            FooterPage.clickBeGambleAwareIcon();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        } 
    }

    @Then("user validates the BeGambleAware page url")
    public void user_validates_the_begambleaware_page_url() {
        try {
            Assert.assertTrue(HeaderPage.getPageUrl().contains(Constants.FOOTER_BE_GAMBLE_AWARE_URL));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks on Gambling Commission Icon in Responsible Gambling section")
    public void user_clicks_on_gambling_commission_Icon_in_responsible_gambling_section() {
        try {
            FooterPage.clickGamblingCommissionIcon();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks on GamStop Icon in Responsible Gambling section")
    public void user_clicks_on_gamstop_Icon_in_responsible_gambling_section() {
        try {
            FooterPage.clickGamStopIcon();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the GamStop page url")
    public void user_validates_the_gamstop_page_url() {
        try {
            Assert.assertTrue(HeaderPage.getPageUrl().contains(Constants.FOOTER_GAMSTOP_PAGE_URL));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks on Sports Link in Footer Sports Menu section")
    public void user_clicks_on_sports_Link_in_footer_sports_menu_section() {
        try {
            FooterPage.clickSportsLink();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks on Casino Link in Footer Sports Menu section")
    public void user_clicks_on_casino_link_in_footer_sports_menu_section() {
        try {
            FooterPage.clickCasinoLink();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }
    @Then("user clicks on Live Casino Link in Footer Sports Menu section")
    public void user_clicks_on_live_casino_link_in_footer_sports_menu_section() {
        try {
            FooterPage.clickLiveCasinoLink();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }
    @Then("user clicks on Games Link in Footer Sports Menu section")
    public void user_clicks_on_games_link_in_footer_sports_menu_section() {
        try {
            FooterPage.clickGamesLink();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }
    @Then("user clicks on Bingo Link in Footer Sports Menu section")
    public void user_clicks_on_bingo_link_in_footer_sports_menu_section() {
        try {
            FooterPage.clickBingoLink();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }
    @Then("user clicks on Lotto Link in Footer Sports Menu section")
    public void user_clicks_on_lotto_link_in_footer_sports_menu_section() {
        try {
            FooterPage.clickLottoLink();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }
    @Then("user clicks on Poker Link in Footer Sports Menu section")
    public void user_clicks_on_poker_link_in_footer_sports_menu_section() {
        try {
            FooterPage.clickPokerLink();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }
}
