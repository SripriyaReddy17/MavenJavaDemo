package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloWorldTest {

    @Test
    void testMessage() {
        String message = "Hello from Jenkins Maven Build!";
        assertEquals("Hello from Jenkins Maven Build!", message);
    }
}