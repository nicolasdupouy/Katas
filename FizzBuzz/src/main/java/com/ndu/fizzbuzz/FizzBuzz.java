package com.ndu.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";

    public String display(int number) {
        if (isMultipleOfThree(number)
                && ismultipleOfFive(number)) {
            return "fizzbuzz";
        }
        if (isMultipleOfThree(number)) {
            return FIZZ;
        }
        if (ismultipleOfFive(number)) {
            return BUZZ;
        }
        return String.valueOf(number);
    }

    private boolean ismultipleOfFive(int number) {
        return number % 5 == 0;
    }

    private boolean isMultipleOfThree(int number) {
        return number % 3 == 0;
    }
}
