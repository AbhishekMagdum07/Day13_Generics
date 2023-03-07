package com.bridgelabz.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericsTest {

    @Test
    void floatTestCase1() {
        Generics runner = new Generics();
        float output = runner.maximum(12.3f,2.1f,9.3f); // max float at first position.
        assertEquals(12.3f,output);
    }
    @Test
    void floatTestCase2() {
        Generics runner = new Generics();
        float output = runner.maximum(14.2f,27.9f,7.2f); // max float at second position.
        assertEquals(27.9f,output);
    }
    @Test
    void floatTestCase3() {
        Generics runner = new Generics();
        float output = runner.maximum(11.7f,4.2f,18.5f); // max float at third positon.
        assertEquals(18.5f,output);
    }
}