package com.levenko;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Vilagra on 22.03.2016.
 */
/*You said me to change my method so that it accepts name of file and returns result,but I did not know how to do it,because my method is recursive.
And I have done with two methods*/

public class SearcCo_e2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Enter the path to the file");
        Scanner in = new Scanner(System.in);
        String pathFile = in.nextLine();
        long start = System.currentTimeMillis();
        System.out.println("Number of coincidence:"+countCo_eInFile(pathFile));
        long end = System.currentTimeMillis();
        System.out.println("Method work time:"+(end-start));
    }
    public static int countCo_eInFile(String filePath){
        String allText = "";
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)))) {
            String line;
            while((line=fileReader.readLine())!=null) {
                allText+=line;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return countCode(allText,0);

    }
    public static int countCode(String str,int index) {
        if (str.indexOf("co",index)==-1) return 0;
        index =str.indexOf("co",index);
        return str.substring(index+3,index+4).equals("e")?1+countCode(str,index+4):countCode(str,index+2);

    }
}
