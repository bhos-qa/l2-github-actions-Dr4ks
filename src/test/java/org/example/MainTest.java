package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void testHw() {
        var expected = "hello world";
        var actual = Main.hw();
        assertEquals(expected, actual);
    }

}
