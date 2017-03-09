package com.ndu.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void should_display_1_when_1() {
        // Given
        FizzBuzz fizzbuzz = new FizzBuzz();

        // When
        String result = fizzbuzz.display(1);

        // Then
        Assertions.assertEquals("1", result);
    }


}
