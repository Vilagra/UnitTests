package com.levenko;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Vilagra on 17.03.2016.
 */
public class SearchCo_e {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Enter the path to the file");
        Scanner in = new Scanner(System.in);
        String pathFile = in.nextLine();
        String allText = "";

        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(pathFile)))) {
            String line;
            while((line=fileReader.readLine())!=null) {
                allText+=line;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(1);
        long start = System.currentTimeMillis();
        System.out.println("Number of coincidence:"+countCode(allText,0));
        long end = System.currentTimeMillis();
        System.out.println("Algoritm worktime:" + (end-start));


    }
    public static int countCode(String str,int index) {
        if (str.indexOf("co",index)==-1) return 0;
        index =str.indexOf("co",index);
        return str.substring(index+3,index+4).equals("e")?1+countCode(str,index+4):countCode(str,index+2);

    }
}
