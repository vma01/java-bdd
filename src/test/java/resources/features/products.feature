Feature: Product page validation
  Scenario Outline: validate promo code alert is visible when is clicking on the special offers link
    Given user navigate to website and click on text "<textLink>"
    When user clicks on "<button>"
    Then user should be presented with promo alert

    Examples:
      |           textLink                                                             |         button           |
      |  http://www.webdriveruniversity.com/Page-Object-Model/products.html            | container-special-offers |

