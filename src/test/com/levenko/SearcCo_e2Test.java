package com.levenko;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Suite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;

/**
 * Created by Vilagra on 22.03.2016.
 */
@Suite.SuiteClasses( { SearchCo_e.class })
public class SearcCo_e2Test {

    private String buildAbsoluteFilePath(String fileName){
        String workingDir = new File("").getAbsoluteFile().getAbsolutePath();
        return workingDir + File.separator + fileName;
    }

    @Test
    public void countAliceTest() throws IOException {
        String filePath = buildAbsoluteFilePath("alice30.txt");
        System.out.println(filePath);
        Assert.assertEquals(43,SearcCo_e2.countCo_eInFile(filePath));
    }

    @Test
    public void countEmptyTest() throws IOException {
        String filePath = buildAbsoluteFilePath("emptyFile.txt");
        Assert.assertEquals(0 ,SearcCo_e2.countCo_eInFile(filePath));

    }

    @Test(expected = FileNotFoundException.class)
    public void fakeFileExpectedExceptionTest() throws IOException {
        String filePath = buildAbsoluteFilePath("fsdgdgef.txt");
        SearcCo_e2.countCo_eInFile(filePath);
    }

}