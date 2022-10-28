package org.example;

import org.joda.time.LocalTime;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FunnyAlgorithmsTest {

    private static FunnyAlgorithms funnyAlgorithms;

    @BeforeClass
    public static void prepareAll(){
        LocalTime localTime = new LocalTime();
        System.out.println("Local time all' inzio della classe:"+localTime);
        funnyAlgorithms = new FunnyAlgorithms();
    }
    @AfterClass
    public static void afterAll() {
        LocalTime localTime = new LocalTime();
        System.out.println("Local time alla fine della classe:" + localTime);
    }

    @Before
    public void testInizio() {
        LocalTime starTime = LocalTime.now();
        System.out.println("data e ora all'inizio di ogni classe:" + starTime);
    }
    

    @Test
    public void binarySearchTest1() {
        int[] sorted = new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16 };

        for (int i = 0; i < sorted.length; i++) {
            assertEquals(-1, funnyAlgorithms.binarySearch(sorted,sorted[i]));
        }
    }

    @Test
    public void stringToIntConverterTest() {
        String number = "-5";
        assertEquals(-5,funnyAlgorithms.stringToIntConverter(number));

        assertNotEquals(2,funnyAlgorithms.stringToIntConverter(number));
    }
    
}
