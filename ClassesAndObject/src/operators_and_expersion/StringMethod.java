package operators_and_expersion.udemy;
import java.util.*;
public class StringMethod {
    public static void main(String[] args) {
        String str="Java";// this litrals stores in String pool
//        String str2="Java";
//        String str3=new String("Java"); // -> This elements stores in separate heap memory
//        System.out.println(str==str);
//        System.out.println(str==str3);
        char[] c={'h','e','l','l','o'};
        String str4=new String(c);
        System.out.println(str4);
        char []ch= str.toCharArray();//to convert String to char Array
        for(char charactor :ch){
            System.out.print(" "+charactor);
        }
        System.out.println();
        byte[] b={66,67,68,69,70};
        String str5=new String(b);
        System.out.print(str5);
        System.out.println();
       String name="Saravanan";
       name.toLowerCase();
        System.out.println(name);


    }
}
