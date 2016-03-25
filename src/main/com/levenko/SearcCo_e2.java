package com.levenko;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Vilagra on 22.03.2016.
 */
/*You said me to change my method so that it accepts name of file and returns result,but I did not know how to do it,because my method is recursive.
And I have done with two methods*/

public class SearcCo_e2 {
    public static void main(String[] args) throws IOException {
        long freeMemoryAtBeginning = Runtime.getRuntime().freeMemory();
        System.out.println("Enter the path to the file");
        Scanner in = new Scanner(System.in);
        String pathFile = in.nextLine();
        long start = System.currentTimeMillis();
        System.out.println("Number of coincidence:"+countCo_eInFile(pathFile));
        long end = System.currentTimeMillis();
        System.out.println("Method work time:"+(end-start));
        long freeMemoryAtEnd = Runtime.getRuntime().freeMemory();
        System.out.println("Memory:"+ (freeMemoryAtBeginning-freeMemoryAtEnd));
    }
    public static int countCo_eInFile(String filePath) throws IOException {
        StringBuilder allText = new StringBuilder();
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)))) {
            String line;
            Pattern co_e = Pattern.compile("^(.*)?co.e(.*)?");
            while((line=fileReader.readLine())!=null) {
                Matcher matcher = co_e.matcher(line);
                if(matcher.matches()) {
                    allText.append(line);
               }
            }
        }
        return countCode(allText.toString().trim());

    }
    public static int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if((i=str.indexOf("co",i))==-1) break;
            if (str.substring(i+3,i+4).equals("e")){
                count++;
            }
        }
        return count;
    }
}
