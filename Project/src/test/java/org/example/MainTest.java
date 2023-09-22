package org.example;

import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testApp() {
        String expectedOutput = "Hello, World!";
        String actualOutput = Main.main(null);

        assertEquals(expectedOutput, actualOutput);
    }
}
a