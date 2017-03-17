package com.ndu.fizzbuzz;

public class FizzBuzz {

    public String display(int i) {
        if (i%3 == 0) {
            return "fizz";
        }
        return String.valueOf(i);
    }
}
