package com.demoga;

import org.junit.jupiter.api.*;

public class ExampleJUnit5Test {

    @BeforeAll
    static void configure() {
        System.out.println(" This is the @BeforeAll");
    }

    @AfterAll
    static void tearDown() {
        System.out.println(" This is the @AfterAll");
    }

    @BeforeEach
    void beforeTest() {
        System.out.println("    This is the @BeforeEach");
    }

    @AfterEach
    void afterTest() {
        System.out.printf("     This is the @AfterEach");
    }

    @Test
    void firstTest0() {
        System.out.println("        This is the @Test 0");
    }

    @Test
    void firstTest1() {
        System.out.println("        This is the @Test 1");
    }

}
