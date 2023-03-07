package com.bridgelabz.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericsTest {
    @Test
    void IntegerTestCase1() {
        Generics runner = new Generics();
        int output = runner.maxInt(7,5,3);
        assertEquals(7,output);
    }
    @Test
    void IntegerTestCase2() {
        Generics runner = new Generics();
        int output = runner.maxInt(4,8,3);
        assertEquals(8,output);
    }
    @Test
    void IntegerTestCase3() {
        Generics runner = new Generics();
        int output = runner.maxInt(7,2,9);
        assertEquals(9,output);
    }
}