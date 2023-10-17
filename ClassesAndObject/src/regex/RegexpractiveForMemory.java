package regex.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Mobile Number Validation
public class RegexpractiveForMemory {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("E:\\Udemy course Sourse for java\\DemoRegex\\RegexDemo.txt");
        Scanner sc=new Scanner(file);
        boolean linepresent= sc.hasNext();//it gives true or false when the given string available or not read line by line
        while(linepresent){
            String word= sc.next();
            int i=  word.indexOf(":");
           String mobileNo= word.substring(i+1);
            Pattern p=Pattern.compile("(0|90)?[6-9][0-9]{9}");//? mean one or less
            Matcher m=p.matcher(mobileNo);
            if(m.find()){
                System.out.println(m.group() +" is Valid Number ");
            }
            else {
                System.out.println( mobileNo+" it's not a valid Number");
            }
            linepresent= sc.hasNext();
        }
//    String MobileNo="09095791516";//09894181516 //919095791516
//        Pattern p=Pattern.compile("[0-9]{10}");//mobile number must be and number and with 10 digit limit if all these have it's mobile Number

    }
}
