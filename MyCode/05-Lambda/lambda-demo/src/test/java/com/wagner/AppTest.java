package com.wagner;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.function.Function;
import java.util.function.ToIntFunction;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit test for simple App.
 */
@Slf4j
public class AppTest {

    @Test
    public void toIntFunctionTest() {
        ToIntFunction<String> func = s -> s.length();
        assertTrue(func.applyAsInt("Hello") == 5);
        // Method Reference: 实例方法
        func = String::length;
        assertTrue(func.applyAsInt("Hello") == 5);
    }

    @Test
    public void toBinaryStringTest() {
        String v = Integer.toBinaryString(4);
        assertTrue(v.equals("100"));
        // == 用于对象引用是否相同的实例
        // equals 用于比较对象内容是否相同
        assertFalse(v == "100");

        Function<Integer, String> func = x -> Integer.toBinaryString(x);
        assertTrue(func.apply(4).equals("100"));
        func = Integer::toBinaryString;
        assertTrue(func.apply(4).equals("100"));
    }
}
