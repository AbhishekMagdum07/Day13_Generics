package com.bridgelabz.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericsTest {
    @Test
    void IntegerTestCase1() {
        Generics runner = new Generics();
        int output = runner.maximum(7,5,3,1); // max number at 1st position
        assertEquals(7,output);
    }
    @Test
    void IntegerTestCase2() {
        Generics runner = new Generics();
        int output = runner.maximum(4,8,3,2); // max number at 2nd postion
        assertEquals(8,output);
    }
    @Test
    void IntegerTestCase3() {
        Generics runner = new Generics();
        int output = runner.maximum(7,2,9,5); // max number at 3rd position
        assertEquals(9,output);
    }


    @Test
    void testCase2_1() {
        Generics runner = new Generics();
        float output = runner.maximum(12.3f,2.1f,9.3f,3.9f);// max float at 1st position
        assertEquals(12.3f,output);
    }
    @Test
    void testCase2_2() {
        Generics runner = new Generics();
        float output = runner.maximum(14.2f,27.9f,7.2f,6.3f);// max float at 2nd position
        assertEquals(27.9f,output);
    }
    @Test
    void testCase2_3() {
        Generics runner = new Generics();
        float output = runner.maximum(11.7f,4.2f,18.5f,7.2f);// max float at 3rd position.
        assertEquals(18.5f,output);
    }

    @Test
    void stringTestCase1() {
        Generics runner = new Generics();
        String output = runner.maximum("pqr","abc","lmn","ab"); // maximum String at position1.
        assertEquals("pqr",output);
    }
    @Test
    void stringTestCase2() {
        Generics runner = new Generics();
        String output = runner.maximum("cat","dog","mouse","cd");// maximum String at position2.
        assertEquals("dog",output);
    }
    @Test
    void stringTestCase3() {
        Generics runner = new Generics();
        String output = runner.maximum("bike","Scooter","car","lm");// maximum String at position3.
        assertEquals("car",output);

    }
}