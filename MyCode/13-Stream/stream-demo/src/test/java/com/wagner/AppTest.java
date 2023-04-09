package com.wagner;

import lombok.var;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {


    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp() {
        assertTrue(true);
    }

    @Test
    public void reduceTest() {
        var numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .filter(n -> n % 2 == 1)
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        assertTrue(sum == 35);
        sum = numbers.stream()
                .filter(n -> n % 2 == 1)
                .map(n -> n * n)
                .reduce(0, (n1, n2) -> Integer.sum(n1, n2));
        assertTrue(sum == 35);
    }

}
