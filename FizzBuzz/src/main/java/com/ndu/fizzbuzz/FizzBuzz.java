package com.ndu.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "fizz";

    public String display(int number) {
        if (isMultipleOfThree(number)) {
            return FIZZ;
        }
        return String.valueOf(number);
    }

    private boolean isMultipleOfThree(int number) {
        return number % 3 == 0;
    }
}
