package com.levenko;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;

import static org.junit.Assert.*;

/**
 * Created by Vilagra on 21.03.2016.
 */
public class SearchCo_eTest extends Runner{

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testCountCode() throws Exception {
        String s = "codecode";
        int i = 2;

        assertEquals(2,SearchCo_e.countCode(s,0));
    }

    @Test
    public void testCountCode1() throws Exception {
        String s = "";
        int i = 0;

        assertEquals(i,SearchCo_e.countCode(s,0));
    }

    @Test
    public void testCountCode2() throws Exception {
        String s = "codcode";
        int i = 1;

        assertEquals(i,SearchCo_e.countCode(s,0));

    }

    @Test(expected = NullPointerException.class)
    public void testCountCode3() throws Exception {

        SearchCo_e.countCode(null,5);

    }


    @Override
    public Description getDescription() {
        return null;
    }

    @Override
    public void run(RunNotifier runNotifier) {


    }
}