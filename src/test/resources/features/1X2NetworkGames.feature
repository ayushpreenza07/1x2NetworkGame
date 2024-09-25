@1X2Network
Feature: Games test

  @Web @GodOfOlympus
  Scenario Outline: Playing the Mega Fire game and place a bet for Valid Login Credentials
    When Navigate to the 1x2 network url
    And Enter game name "<GameName>"
    Then open game
    And scroll down and fit to screen
    Then play game
    Examples:
      | GameName        |
      | Gods of Olympus IV|