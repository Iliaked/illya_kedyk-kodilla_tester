package homework;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static homework.FizzBuzz.checkNumber;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzSteps {
    private int number;
    private String result;

    @Given("given number is {int}")
    public void given_number_is(int number) {
        this.number = number;
    }

    @When("Checking if number is divisible by 3 and 5")
    public void checking_if_number_is_divisible_by_3_and_5() {
        result = checkNumber(number);
    }

    @Then("You should say {string}")
    public void you_should_say(String expected) {
        assertEquals(expected, result);
    }
}
