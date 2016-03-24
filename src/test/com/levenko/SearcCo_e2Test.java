package com.levenko;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;

/**
 * Created by Vilagra on 22.03.2016.
 */
public class SearcCo_e2Test {

    private String buildAbsoluteFilePath(String fileName){
        String workingDir = new File("").getAbsoluteFile().getParent();
        return workingDir + File.separator + fileName;
    }

    @Test
    public void countAliceTest() {
        String filePath = buildAbsoluteFilePath("alice300.txt");
        Assert.assertEquals(43,SearcCo_e2.countCo_eInFile(filePath));
    }

    @Test
    public void countEmptyTest(){
        String filePath = buildAbsoluteFilePath("emptyFile.txt");
        Assert.assertEquals(0 ,SearcCo_e2.countCo_eInFile(filePath));

    }

    @Test(expected = FileNotFoundException.class)
    public void fakeFileExpectedExceptionTest(){
        String filePath = buildAbsoluteFilePath("fsdgdgef.txt");
        SearcCo_e2.countCo_eInFile(filePath);
    }

}