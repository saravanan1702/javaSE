package exceptionhandling;

import jdk.jshell.SourceCodeAnalysis;

import java.io.*;
import java.util.*;

public class TryWithResourceDemo {
    static FileInputStream fi;
    static Scanner sc;

    static void divie() throws IOException {
        try {


            fi = new FileInputStream("E:\\Udemy\\Java\\test.txt");
//        Scanner sc=new Scanner(fi);
            sc = new Scanner(fi);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
//        System.out.println(a/b);
            //50/0=>zero division error
            System.out.println(a / c);//if there any error i am able to read the file because resourse aren't closed
        } finally {
            fi.close();//file close
            sc.close();//as well as reader also close, can't outside the method
        }
    }

    public static void main(String[] args) throws IOException {
        try {

            divie();
        } catch (Exception e) {
            System.out.println("division by zero" + e);
        }

        //read onemore element from divide method

        int x = sc.nextInt();//can't acces thta file because everything was closed
        //we can access that file incase reader class wouldn't close the reasonn reader class attached with file
        System.out.println(x);//if there is any error in method then next part of the statement that's file closer won't be execute that's why we can read the values from file
        //if close method inside the finally block we can't access that values from files
    }
}
