package com.bridgelabz.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericsTest {

    @Test
    void stringTestCase1() {
        Generics runner = new Generics();
        String output = runner.maximum("pqr","abc","lmn"); // maximum String at position1.
        assertEquals("pqr",output);
    }
    @Test
    void stringTestCase2() {
        Generics runner = new Generics();
        String output = runner.maximum("cat","dog","mouse");// maximum String at position2.
        assertEquals("dog",output);
    }
    @Test
    void stringTestCase3() {
        Generics runner = new Generics();
        String output = runner.maximum("bike","Scooter","car");// maximum String at position3.
        assertEquals("car",output);

    }
}