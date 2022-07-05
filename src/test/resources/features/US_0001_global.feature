@wip
Feature: Adding items to the cart and verify the cost

  Scenario:Add items to the cart and checkout and verify the cost

    Given User is on the home page
    When User clicks the T_shirts button
    And User selects the "M" and the "blue"
    And User hovers over and adds the "Faded Short Sleeve T-shirts" to the cart
    And User closes the opening window
    When User hovers over the Dresses button and clicks the Evening Dresses button
    And User selects the "S" and the "beige"
    And User hovers over and adds the "Printed Dress" to the cart
    Then User closes the opening window
    When User hovers over the Dresses button and clicks the Summer Dresses button
    And User selects the "M" and the "orange"
    And User hovers over and adds the "Printed Summer Dress" to the cart
    And User closes the opening window
    When User clicks the cart to checkout
    And User removes the "Printed Dress" from the cart
    And User adds a second the same "Faded Short Sleeve T-shirts"
    Then Assert the each line in cart
    Then Assert the cart total is "$65.53"
