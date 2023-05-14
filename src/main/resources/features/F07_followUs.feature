@smoke
Feature: F07_followUs | user should be able to follow us on 4 platforms
  Scenario: user follow us on facebook
    Given user clicks on facebook icon
    Then the facebook website appears

  Scenario: user follow us on twitter
    Given user clicks on twitter icon
    Then the twitter website appears

  Scenario: user opens rss link
    Given user clicks on rss icon
    Then the rss website appears

  Scenario: user follow us on youtube
    Given user clicks on youtube icon
    Then the youtube website appears