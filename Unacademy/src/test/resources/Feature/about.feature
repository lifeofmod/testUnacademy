Feature: About us section

  Background: 
    Given User is on about us Unacademy page

  Scenario: Should be able to see all four live numerical values
    When Seek the numeric value for all four categories
    Then Live Numeric value found for all four categories

  Scenario Outline: Should be able to apply to any posting successfully in open positions
    When User clicks on button open position
    And User clicks on any one of the options
    And User enters firstname as "<firstname>"
    And User enters lastname as "<lastname>"
    And User enters email as "<mail>"
    And User enters phone number as "<phnno>"
    And User enters location as "<city>"
    And User selects value from dropdown
    And User uploads Resume as a pdf
    And User enters most recent salary as "<recentsalary>"
    Then User clicks on Submit Application button

    Examples: 
      | firstname | lastname |  mail                  | phnno      | city    | recentsalary |
      | monsieur  | mod      | mod.monsieur@gmail.com | 9876543210 | Alabama |     31.42    |

  Scenario: Able to get names in text when hovered over picture
    When Hovered over all of them indivisually
    Then Names are displayed

  Scenario: Able to visit external links and home page
    When Click on instagram button
    Then Redirected to instagram page
    And Click on LinkedIn button
    Then Redirected to LinkedIn page of Unacademy