package org.example;

import org.joda.time.LocalTime;
import org.junit.Before;
import org.junit.BeforeClass;

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
}
