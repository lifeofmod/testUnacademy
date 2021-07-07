Feature: About us section

  Background: 
    Given User is on about us Unacademy page

  Scenario: Should be able to see all four live numerical values
    When Seek the numeric value for all four categories
    Then Live Numeric value found for all four categories
  
  Scenario: Should be able to apply to any posting successfully in open positions
    When Click on button open position
    Then Click on any one of the options
    And Able to apply successfully

  Scenario: Able to get names in text when hovered over picture
    Given User is redirected to the About Us page
    When Hovered over all of them indivisually
    Then Names are displayed

  Scenario: Able to visit external links and home page
    When Click on home button
    Then Redirected to home page
    And Click on facebook button
    Then Redirected to facebook page of Unacademy
    And Click on youtube button
    Then Redirected to youtube page of Unacademy
    And Click on twitter button
    Then Redirected to twitter page of Unacademy
    