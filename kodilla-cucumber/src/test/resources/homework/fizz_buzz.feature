Feature: This is a FizzBuzz game

  Scenario Outline: Answer the right word as a reaction to a given number
    Given given number is <number>
    When Checking if number is divisible by 3 and 5
    Then You should say <answer>
    Examples:
      | number | answer     |
      | 3      | "Fizz"     |
      | 6      | "Fizz"     |
      | 9      | "Fizz"     |
      | 5      | "Buzz"     |
      | 10     | "Buzz"     |
      | 20     | "Buzz"     |
      | 15     | "FizzBuzz" |
      | 30     | "FizzBuzz" |
      | 1      | "None"     |
      | 4      | "None"     |
      | 7      | "None"     |