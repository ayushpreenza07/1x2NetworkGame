package step_definitions;

import commons.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import modules.HeaderPage;
import org.testng.Assert;
import utilities.GlobalUtil;

public class HeaderSteps {
    @Then("User clicks on Games link from Sportsbook Header")
    public void user_clicks_on_games_link_from_sportsbook_header() {
        try {
            HeaderPage.clickAcceptCookies();
            HeaderPage.clickGamesLink();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Boyle Games logo")
    public void user_validates_the_boyle_games_logo()
    {
        try {
            Assert.assertTrue(HeaderPage.headerGamesLogoIsPresent());
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("User clicks on Sports link from Header")
    public void user_clicks_on_sports_link_from_header() {
        try {
            HeaderPage.clickHeaderSportsLink();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Sports url")
    public void user_validates_the_sports_url() {
        try {
            Assert.assertTrue(HeaderPage.getPageUrl().contains(Constants.HEADER_SPORTS_URL));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks the Login button")
    public void user_clicks_the_login_button() {
        try {
            HeaderPage.clickHeaderLoginButton();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("User clicks on Casino link from Header")
    public void user_clicks_on_casino_link_from_header() {
        try {
            HeaderPage.clickHeaderCasinoLink();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Casino url")
    public void user_validates_the_casino_url() {
        try {
            Assert.assertTrue(HeaderPage.getPageUrl().contains(Constants.HEADER_CASINO_URL));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("User clicks on Live Casino link from Header")
    public void user_clicks_on_live_casino_link_from_header() {
        try {
            HeaderPage.clickHeaderLiveCasinoLink();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Live Casino url")
    public void user_validates_the_live_casino_url() {
        try {
            Assert.assertTrue(HeaderPage.getPageUrl().contains(Constants.HEADER_LIVE_CASINO_URL));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("User clicks on Games link from Header")
    public void user_clicks_on_games_link_from_header() {
        try {
            HeaderPage.clickHeaderGamesLink();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Games url")
    public void user_validates_the_games_url() {
        try {
            Assert.assertTrue(HeaderPage.getPageUrl().contains(Constants.HEADER_GAMES_URL));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("User clicks on Bingo link from Header")
    public void user_clicks_on_bingo_link_from_header() {
        try {
            HeaderPage.clickHeaderBingoLink();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Bingo url")
    public void user_validates_the_bingo_url() {
        try {
            Assert.assertTrue(HeaderPage.getPageUrl().contains(Constants.HEADER_BINGO_URL));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("User clicks on Poker link from Header")
    public void user_clicks_on_poker_link_from_header() {
        try {
            HeaderPage.clickHeaderPokerLink();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Poker url")
    public void user_validates_the_poker_url() {
        try {
            Assert.assertTrue(HeaderPage.getPageUrl().contains(Constants.HEADER_POKER_URL));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @And("User clicks on Lotto link from Header")
    public void user_clicks_on_lotto_link_from_header() {
        try {
            HeaderPage.clickHeaderLottoLink();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Lotto url")
    public void user_validates_the_lotto_url() {
        try {
            Assert.assertTrue(HeaderPage.getPageUrl().contains(Constants.HEADER_LOTTO_URL));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Date and Time on header")
    public void user_validates_the_date_and_time_on_header() {
        try {
            Assert.assertTrue(HeaderPage.headerDateTimeIsPresent());
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks on Facebook icon in Header section")
    public void user_clicks_on_facebook_icon_in_header_section() {
        try {
            HeaderPage.clickHeaderFacebookIcon();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Facebook url")
    public void user_validates_the_facebook_url() {
        try {
            Assert.assertTrue(HeaderPage.getPageUrl().contains(Constants.FACEBOOK_PAGE_URL));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks on Twitter icon in Header section")
    public void user_clicks_on_twitter_icon_in_header_section() {
        try {
            HeaderPage.clickHeaderTwitterIcon();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Twitter url")
    public void user_validates_the_twitter_url() {
        try {
            Assert.assertTrue(HeaderPage.getPageUrl().contains(Constants.TWITTER_PAGE_URL));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks on Youtube icon in Header section")
    public void user_clicks_on_youtube_icon_in_header_section() {
        try {
            HeaderPage.clickHeaderYoutubeIcon();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Youtube url")
    public void user_validates_the_youtube_url() {
        try {
            Assert.assertTrue(HeaderPage.getPageUrl().contains(Constants.YOUTUBE_PAGE_URL));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks on Mobile link in Header section")
    public void user_clicks_on_mobile_link_in_header_section() {
        try {
            HeaderPage.clickHeaderMobileLink();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Google Play Store url")
    public void user_validates_the_google_play_store_url() {
        try {
            Assert.assertTrue(HeaderPage.getPageUrl().contains(Constants.GOOGLE_PLAY_STORE_PAGE_URL));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks on Help icon in Header section")
    public void user_clicks_on_help_icon_in_header_section() {
        try {
            HeaderPage.clickHeaderHelpLink();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Help page url")
    public void user_validates_the_help_page_url() {
        try {
            Assert.assertTrue(HeaderPage.getPageUrl().contains(Constants.BOYLE_HELP_PAGE_HEADER));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the My Account section")
    public void user_validates_the_my_account_section() {
        try {
            Assert.assertTrue(HeaderPage.headerMyAccountLinkIsPresent());
            Assert.assertTrue(HeaderPage.headerInboxLinkIsPresent());
            Assert.assertTrue(HeaderPage.headerLogoutLinkIsPresent());
            Assert.assertTrue(HeaderPage.headerMyAccountIconIsPresent());
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Carousel in header")
    public void user_validates_the_carousel_in_header() {
        try {
            Assert.assertTrue(HeaderPage.headerCarouselIsPresent());
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Featured tab is selected by default")
    public void user_validates_the_featured_tab_is_selected_by_default() {
        try {
            Assert.assertTrue(HeaderPage.featuredSelectedByDefault());
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks on the Recent tab in main menu")
    public void user_clicks_on_the_recent_tab_in_main_menu() {
        try {
            HeaderPage.clickRecentTab();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Recent page title")
    public void user_validates_the_recent_page_title() {
        try {
            Assert.assertEquals("RECENT", HeaderPage.getHeaderPageTitle());
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }
    @Then("user clicks on the New Games tab in main menu")
    public void user_clicks_on_the_new_games_tab_in_main_menu() {
        try {
            HeaderPage.clickNewGamesTab();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the New Games page title")
    public void user_validates_the_new_games_page_title() {
        try {
            Assert.assertEquals("NEW GAMES", HeaderPage.getHeaderPageTitle());
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }
    @Then("user clicks on the Exclusive tab in main menu")
    public void user_clicks_on_the_exclusive_tab_in_main_menu() {
        try {
            HeaderPage.clickExclusiveTab();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Exclusive page title")
    public void user_validates_the_exclusive_page_title() {
        try {
            Assert.assertEquals("EXCLUSIVE", HeaderPage.getHeaderPageTitle());
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks on the Promotion tab in main menu")
    public void user_clicks_on_the_promotion_tab_in_main_menu() {
        try {
            HeaderPage.clickPromotionTab();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Promotion page url")
    public void user_validates_the_promotion_page_url() {
        try {
            Assert.assertEquals(Constants.GAMES_PROMOTION_URL, HeaderPage.getPageUrl());
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks on the Live Casino tab in main menu")
    public void user_clicks_on_the_live_casino_tab_in_main_menu() {
        try {
            HeaderPage.clickLiveCasinoTab();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Live Casino page title")
    public void user_validates_the_live_casino_page_title() {
        try {
            Assert.assertEquals("LIVE CASINO", HeaderPage.getHeaderPageTitle());
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks on the Our Picks tab in main menu")
    public void user_clicks_on_the_our_picks_tab_in_main_menu() {
        try {
            HeaderPage.clickOurPicksTab();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Our Picks page title")
    public void user_validates_the_our_picks_page_title() {
        try {
            Assert.assertEquals("OUR PICKS", HeaderPage.getHeaderPageTitle());
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks on the Premiere tab in main menu")
    public void user_clicks_on_the_premiere_tab_in_main_menu() {
        try {
            HeaderPage.clickPremiereTab();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Premiere page title")
    public void user_validates_the_premiere_page_title() {
        try {
            Assert.assertEquals("PREMIERE", HeaderPage.getHeaderPageTitle());
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }
    @Then("user clicks on the Classic Slots tab in main menu")
    public void user_clicks_on_the_classic_slots_tab_in_main_menu() {
        try {
            HeaderPage.clickClassicSlotsTab();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Classic Slots page title")
    public void user_validates_the_classic_slots_page_title() {
        try {
            Assert.assertEquals("CLASSIC SLOTS", HeaderPage.getHeaderPageTitle());
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }
    @Then("user clicks on the Blackjack tab in main menu")
    public void user_clicks_on_the_blackjack_tab_in_main_menu() {
        try {
            HeaderPage.clickBlackjackTab();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Blackjack page title")
    public void user_validates_the_blackjack_page_title() {
        try {
            Assert.assertEquals("BLACKJACK", HeaderPage.getHeaderPageTitle());
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }
    @Then("user clicks on the Roulette tab in main menu")
    public void user_clicks_on_the_roulette_tab_in_main_menu() {
        try {
            HeaderPage.clickRouletteTab();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Roulette page title")
    public void user_validates_the_roulette_page_title() {
        try {
            Assert.assertEquals("ROULETTE", HeaderPage.getHeaderPageTitle());
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }
    @Then("user clicks on the In Shop tab in main menu")
    public void user_clicks_on_the_in_shop_tab_in_main_menu() {
        try {
            HeaderPage.clickInShopTab();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the In Shop page title")
    public void user_validates_the_in_shop_page_title() {
        try {
            Assert.assertEquals("IN SHOP", HeaderPage.getHeaderPageTitle());
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }
    @Then("user clicks on the Jackpots tab in main menu")
    public void user_clicks_on_the_jackpots_tab_in_main_menu() {
        try {
            HeaderPage.clickJackpotsTab();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Jackpots page title")
    public void user_validates_the_jackpots_page_title() {
        try {
            Assert.assertEquals("JACKPOTS", HeaderPage.getHeaderPageTitle());
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }
    @Then("user clicks on the Slingo tab in main menu")
    public void user_clicks_on_the_slingo_tab_in_main_menu() {
        try {
            HeaderPage.clickSlingoTab();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Slingo page title")
    public void user_validates_the_slingo_page_title() {
        try {
            Assert.assertEquals("SLINGO", HeaderPage.getHeaderPageTitle());
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }
    @Then("user clicks on the Megaways tab in main menu")
    public void user_clicks_on_the_megaways_tab_in_main_menu() {
        try {
            HeaderPage.clickMegawaysTab();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Megaways page title")
    public void user_validates_the_megaways_page_title() {
        try {
            Assert.assertEquals("MEGAWAYS", HeaderPage.getHeaderPageTitle());
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }
    @Then("user clicks on the Instant Win tab in main menu")
    public void user_clicks_on_the_instant_win_tab_in_main_menu() {
        try {
            HeaderPage.clickInstantWinTab();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Instant Win page title")
    public void user_validates_the_instant_win_page_title() {
        try {
            Assert.assertEquals("INSTANT WIN", HeaderPage.getHeaderPageTitle());
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }
    @Then("user clicks on the All Games tab in main menu")
    public void user_clicks_on_the_all_games_tab_in_main_menu() {
        try {
            HeaderPage.clickAllGamesTab();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the All Games page title")
    public void user_validates_the_all_games_page_title() {
        try {
            Assert.assertTrue(HeaderPage.getHeaderPageTitle().contains("ALL"));
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }
    @Then("user clicks on the Slots tab in main menu")
    public void user_clicks_on_the_slots_tab_in_main_menu() {
        try {
            HeaderPage.clickSlotsTab();
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Slots page title")
    public void user_validates_the_slots_page_title() {
        try {
            Assert.assertEquals("SLOTS", HeaderPage.getHeaderPageTitle());
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user validates the Search input")
    public void user_validates_the_search_input() {
        try {
            Assert.assertTrue(HeaderPage.headerSearchInputIsPresent());
        } catch (Throwable e) {
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }

    @Then("user clicks on the next button in main menu")
    public void userClicksOnTheNextButtonInMainMenu() {
        try {
            HeaderPage.clickNavNextButton();
        } catch (Throwable e){
            GlobalUtil.e = e;
            GlobalUtil.errorMsg = e.getMessage();
            Assert.fail(e.getMessage());
        }
    }
}
