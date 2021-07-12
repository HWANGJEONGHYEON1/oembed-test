package com.example.pupleio.oembed;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BasicTest {

    private static int counter = 0;

    @BeforeClass
    public static void suiteSetup() {
        assertEquals(0, counter);
        System.out.println("BasicTest.suiteSetup");
        System.out.println("counter = " + counter);
        counter++;
    }

    @Before
    public void prepareTest() {

        assertTrue(Arrays.asList(2, 6).contains(counter));
        System.out.println("counter = " + counter);
        counter++;
    }

    @Test
    public void peformFirstTest() {
        assertTrue(Arrays.asList(3, 7).contains(counter));
        System.out.println("counter = " + counter);
        counter++;
    }

    @Test
    public void performSecondTest() {
        System.out.println(counter);
        assertTrue(Arrays.asList(2, 7).contains(counter));
        System.out.println("counter = " + counter);
        counter++;
    }

    @After
    public void cleanupTest() {
        assertTrue(Arrays.asList(4, 8).contains(counter));
        counter++;
    }

    @AfterClass
    public static void suiteFinished() {
        assertEquals(9, counter);
    }
}
