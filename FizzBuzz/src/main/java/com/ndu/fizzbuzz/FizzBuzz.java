package com.ndu.fizzbuzz;

public class FizzBuzz {

    public static final String EMPTY_STRING = "";
    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";

    public String display(int number) {
        String resultDisplayed = EMPTY_STRING;
        if (isMultipleOfThree(number)) {
            resultDisplayed += FIZZ;
        }
        if (ismultipleOfFive(number)) {
            resultDisplayed += BUZZ;
        }
        return resultDisplayed == EMPTY_STRING
                ? String.valueOf(number)
                : resultDisplayed;
    }

    private boolean ismultipleOfFive(int number) {
        return number % 5 == 0;
    }

    private boolean isMultipleOfThree(int number) {
        return number % 3 == 0;
    }
}
