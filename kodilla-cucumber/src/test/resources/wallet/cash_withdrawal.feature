Feature:  Cash Withdrawal

  Scenario: Successful withdrawal from a wallet in credit

    Given I have deposited $200 in my wallet
    When  I request $30
    Then  $30 should be dispensed
    And the balance of my wallet should be $170

  Scenario: Attempt to withdraw more than the available balance
    Given I have deposited $100 in my wallet
    When  I request $150
    Then  $0 should be dispensed
    And the balance of my wallet should be $100
    And I should see an error message "Insufficient funds"

  Scenario: Withdraw exact available balance
    Given I have deposited $50 in my wallet
    When  I request $50
    Then  $50 should be dispensed
    And the balance of my wallet should be $0