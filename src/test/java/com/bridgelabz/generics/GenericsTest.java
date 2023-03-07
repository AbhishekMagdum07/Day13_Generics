package com.bridgelabz.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericsTest {
    @Test
    void IntegerTestCase1() {
        Generics runner = new Generics();
        int output = runner.maxInt(7,5,3); // max number at 1st position
        assertEquals(7,output);
    }
    @Test
    void IntegerTestCase2() {
        Generics runner = new Generics();
        int output = runner.maxInt(4,8,3); // max number at 2nd postion
        assertEquals(8,output);
    }
    @Test
    void IntegerTestCase3() {
        Generics runner = new Generics();
        int output = runner.maxInt(7,2,9); // max number at 3rd position
        assertEquals(9,output);
    }
}