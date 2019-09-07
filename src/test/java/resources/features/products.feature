Feature: Product page validation
  Scenario Outline: validate promo code alert is visible when is clicking on the special offers link
    Given user navigate to "<url>" website
    When user clicks on "<button>"
    Then user should be presented with promo alert

    Examples:
    |           url          |         button           |
    |  webdriverunuversity   | container-special-offers |

