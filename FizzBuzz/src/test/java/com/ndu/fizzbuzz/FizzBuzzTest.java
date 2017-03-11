package com.ndu.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void should_display_1_when_1() {
        // Given
        FizzBuzz fizzbuzz = new FizzBuzz();

        // When
        String result = fizzbuzz.display(1);

        // Then
        assertEquals("1", result);
    }

    @Test
    public void should_display_n_when_n() {
        // Given
        FizzBuzz fizzbuzz = new FizzBuzz();

        // When
        String result = fizzbuzz.display(2);

        // Then
        assertEquals("2", result);
    }


    @Test
    public void should_display_fizz_when_multiple_of_3() {
        // Given
        FizzBuzz fizzbuzz = new FizzBuzz();

        // When
        String result = fizzbuzz.display(9);

        // Then
        assertEquals("fizz", result);
    }


}
