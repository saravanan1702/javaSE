package operators_and_expersion.udemy;

import java.util.Scanner;

public class StringMethod1 {
    //simple to memorize trim mean remove unwanted white spaces in string
    public static void main(String[] args) {
        /*
           Scanner sc=new Scanner(System.in);
         System.out.println("Enter the String :");
         String str=sc.nextLine();
         int l=str.length();
         System.out.println("Before Trim :"+l);
         str.trim();
         int l1=str.length();
         System.out.println("After Trim :"+l1);
        */
        String str="Java";
        String str2=str.toLowerCase();
        System.out.println(str==str2);
    }
}
