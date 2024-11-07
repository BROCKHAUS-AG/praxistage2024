package de.brockhausag;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OddOrEvenTest {
    OddOrEvenGame oddOrEven; //TODO: Initialisiert hier eure Logik Klasse



    @Test
    public void testEvenNumber() {
        int input = 4;
        String expected = "Die Zahl 4 ist gerade.";
        String actual = oddOrEven.oddOrEven(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testOddNumber() {
        int input = 7;
        String expected = "Die Zahl 7 ist ungerade.";
        String actual = oddOrEven.oddOrEven(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testZero() {
        int input = 0;
        String expected = "Die Zahl 0 ist gerade.";
        String actual = oddOrEven.oddOrEven(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testNegativeEvenNumber() {
        int input = -6;
        String expected = "Die Zahl -6 ist gerade.";
        String actual = oddOrEven.oddOrEven(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testNegativeOddNumber() {
        int input = -9;
        String expected = "Die Zahl -9 ist ungerade.";
        String actual = oddOrEven.oddOrEven(input);
        assertEquals(expected, actual);
    }
}