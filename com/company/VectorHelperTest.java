package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by mac on 10/20/17.
 */
class VectorHelperTest {
    @Test
    void triVector() {
        ArrayList<Integer> expected = new ArrayList<Integer>();
        ArrayList<Integer> actual = new ArrayList<Integer>();
        expected.add(1);
        expected.add(4);
        expected.add(7);
        actual.add(4);
        actual.add(1);
        actual.add(7);
        VectorHelper V = new VectorHelper();
        Assertions.assertEquals(expected,V.TriVector(actual));
    }

    @Test
    void sommeVector() throws ExceptionTailleDif {
        ArrayList<Integer> expected = new ArrayList<Integer>();
        ArrayList<Integer> actual1 = new ArrayList<Integer>();
        ArrayList<Integer> actual2 = new ArrayList<Integer>();
        expected.add(5);
        expected.add(8);
        expected.add(12);
        actual1.add(4); actual2.add(1);
        actual1.add(1); actual2.add(7);
        actual1.add(7); actual2.add(5);
        VectorHelper V = new VectorHelper();
        Assertions.assertEquals(expected,V.SommeVector(actual1,actual2));

    }

    @Test
    void inversVector() {
        ArrayList<Integer> expected = new ArrayList<Integer>();
        ArrayList<Integer> actual = new ArrayList<Integer>();
        expected.add(1);
        expected.add(8);
        expected.add(7);
        actual.add(7);
        actual.add(8);
        actual.add(1);
        VectorHelper V = new VectorHelper();
        Assertions.assertEquals(expected,V.InversVector(actual));
    }

    @Test
    void maxMinVector() {
        int [] expected = {1,6};
        ArrayList<Integer> actual = new ArrayList<Integer>();
        actual.add(5);
        actual.add(2);
        actual.add(1);
        actual.add(6);
        VectorHelper V = new VectorHelper();
        Assertions.assertArrayEquals(expected,V.MaxMinVector(actual));
    }

    @Test
    void applyFormul() {
        ArrayList<Integer> expected = new ArrayList<Integer>();
        ArrayList<Integer> actual = new ArrayList<Integer>();
        expected.add(49);
        expected.add(64);
        expected.add(16);
        actual.add(7);
        actual.add(8);
        actual.add(4);
        VectorHelper V = new VectorHelper();
        Assertions.assertEquals(expected,V.ApplyFormul(actual));
    }

}