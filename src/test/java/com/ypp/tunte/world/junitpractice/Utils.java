package com.ypp.tunte.world.junitpractice;

import java.util.stream.Stream;

public class Utils {
    static Stream<String> getStringStream() {
        return Stream.of("apple2", "banana2");
    }

}
