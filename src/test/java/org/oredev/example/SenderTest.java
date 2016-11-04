package org.oredev.example;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by arcuri82 on 11/4/2016.
 */
public class SenderTest {

    @Test
    public void testSendIfPositiveTrue() throws Exception {
        new Sender();
        boolean res = Sender.sendIfPositive(10);
        assertTrue(res);
    }

    @Test
    public void testSendIfPositiveFalse() throws Exception {

        boolean res = Sender.sendIfPositive(-20);
        assertFalse(res);
    }

}