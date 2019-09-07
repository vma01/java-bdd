Feature: Submit data to webdriverUniversity web site using contact us form
  Scenario: Submit valid date via contact form
    Given I access webdriverUniversity contact us form
    When I enter a valid firstName
    And I enter a valid lastName
    | woods | jackson | jones |
    And I enter a valid email address
    And I enter comments
    | example comment one | example comment two | example comment three |
    When I click on submit button
    Then information should successfully be submitted via contact us form
