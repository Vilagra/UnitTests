package com.levenko;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Vilagra on 22.03.2016.
 */
public class SearcCo_e2Test {

    @Test
    public void testCountAlice() throws Exception {
        String fileName="Alice30.txt";
        int result=43;

        Assert.assertEquals(result,SearcCo_e2.countCo_eInFile(fileName));

    }

    @Test
    public void testCountEmpty() throws Exception {
        String fileName="emptyFile.txt";
        int result=0;

        Assert.assertEquals(result,SearcCo_e2.countCo_eInFile(fileName));

    }

    @Test(expected = FileNotFoundException.class)
    public void testFileMissing() throws Exception {
        String fileName="fsdgdgef.txt";
        SearcCo_e2.countCo_eInFile(fileName);
    }

}