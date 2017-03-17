package com.ndu.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    // Given
    private FizzBuzz fizzbuzz = new FizzBuzz();

    @Test
    public void should_display_1_when_1() {
        // When
        String result = fizzbuzz.display(1);

        // Then
        assertEquals("1", result);
    }

    @Test
    public void should_display_n_when_n() {
        // When
        String result = fizzbuzz.display(2);

        // Then
        assertEquals("2", result);
    }


    @Test
    public void should_display_fizz_when_multiple_of_3() {
        // When
        String result = fizzbuzz.display(9);

        // Then
        assertEquals("fizz", result);
    }

    @Test
    public void should_display_buzz_when_multiple_of_5() {
        // When
        String result = fizzbuzz.display(25);

        // Then
        assertEquals("buzz", result);
    }

    @Test
    public void should_display_fizzbuzz_when_multiple_of_3_and_5() {
        // When
        String result = fizzbuzz.display(15);

        // Then
        assertEquals("fizzbuzz", result);
    }


}
