package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

//polączyłem zadania 14.3 i 14.4 w jedno, bo dotyczą tych samych klas

public class WalletSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();
    private String errorMessage;
    private int checkedBalance;

    @Given("I have deposited ${int} in my wallet")
    public void i_have_deposited_in_my_wallet(int amount) {
        wallet.deposit(amount);
        Assertions.assertEquals(amount, wallet.getBalance(), "Incorrect wallet balance");
    }

    @When("I request ${int}")
    public void i_request(int amount) {
        Cashier cashier = new Cashier(cashSlot);
        try {
            cashier.withdraw(wallet, amount);
            errorMessage = null;
        } catch (InsufficientFundsException e) {
            errorMessage = e.getMessage();
        }
    }

    @Then("${int} should be dispensed")
    public void should_be_dispensed(int amount) {
        Assertions.assertEquals(amount, cashSlot.getContents());
    }

    @Then("the balance of my wallet should be ${int}")
    public void the_balance_of_my_wallet_should_be(int balance) {
        Assertions.assertEquals(balance, wallet.getBalance(), "Incorrect wallet balance");
    }

    @Then("I should see an error message {string}")
    public void i_should_see_an_error_message(String message) {
        Assertions.assertEquals(message, errorMessage);
    }

    @Given("there is {int} in my wallet")
    public void there_is_in_my_wallet(int amount) {
        wallet.deposit(amount);
        Assertions.assertEquals(amount, wallet.getBalance(), "Incorrect wallet balance");
    }

    @When("I check the balance of my wallet")
    public void i_check_the_balance_of_my_wallet() {
        checkedBalance = wallet.getBalance();
    }

    @Then("I should see that the balance is {int}")
    public void i_should_see_that_the_balance_is(int expectedBalance) {
        Assertions.assertEquals(expectedBalance, checkedBalance, "Displayed balance is incorrect");
    }
}
