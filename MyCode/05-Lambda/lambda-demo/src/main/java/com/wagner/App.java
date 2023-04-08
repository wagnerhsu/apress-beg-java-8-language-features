package com.wagner;

import lombok.extern.slf4j.Slf4j;

import java.util.function.Function;

/**
 * Hello world!
 */
@Slf4j
public class App {
    public static void main(String[] args) {
        Function<Integer, Integer> func1 = App::AddOne;
        assert func1.apply(2) == 3;
        log.info("Hello");
    }

    public static int AddOne(int i) {
        return i + 1;
    }
}
