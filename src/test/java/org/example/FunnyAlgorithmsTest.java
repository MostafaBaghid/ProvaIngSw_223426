package org.example;

import org.joda.time.LocalTime;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FunnyAlgorithmsTest {

    private static FunnyAlgorithms funnyAlgorithms;

    @BeforeClass
    public static void prepareAll(){
        funnyAlgorithms = new FunnyAlgorithms();
    }

    @Before
    public void testInizio() {
        LocalTime starTime = LocalTime.now();
        System.out.println("data e ora all'inizio di ogni classe:" + starTime);
    }

    //dovrebbe ritornare true se lo ha trovato in una qualsiasi posizione
    @Test
    public void binarySearchTest1() {
        int[] sorted = new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16 };

        for (int i = 0; i < sorted.length; i++) {
            assertEquals(true, funnyAlgorithms.binarySearch(sorted,sorted[i]));
        }
    }

    

    @Test
    public void stringToIntConverterTest(String number) {
        assertEquals(Arrays.asList(-3,500,-10,32767),funnyAlgorithms.stringToIntConverter(number));
        assertNotEquals(Arrays.asList("2 3","32768","A3","2.3"),funnyAlgorithms.stringToIntConverter(number));
    }

    @Test
    public void stringToIntConverterTest(){

    }
}
