package org.oredev.example.mutation;

import org.junit.Test;
import org.oredev.example.mutation.Numbers;

/**
 * Created by arcuri82 on 11/4/2016.
 */
public class NumbersTest {

    //What is there is no assertion?

    @Test
    public void testIsPositiveTrue() throws Exception {

        boolean res = Numbers.isPositive(10);
        //assertTrue(res);
    }

    @Test
    public void testIsPositiveFalse() throws Exception {

        boolean res = Numbers.isPositive(-20);
        //assertFalse(res);
    }

    @Test
    public void testEmptyConstructor(){
        new Numbers();
    }
}