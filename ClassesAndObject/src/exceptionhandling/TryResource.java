package exceptionhandling;

import java.io.FileInputStream;
import java.util.Scanner;
import java.util.Stack;

//try with resourse new feature in java that was introduced in java 1.7 version
//try with resource feature we don't need to close the file it will take care everything
//instead of writing Finally block
public class TryResource {

    static void meth1()throws Exception{
        //try with resourse try block ("resources")
        try (FileInputStream fi=new FileInputStream("E:\\Udemy\\Java\\test.txt");Scanner sc=new Scanner(fi)){

             int a=sc.nextInt();
             int b=sc.nextInt();
             int c=sc.nextInt();
            System.out.println(a/c);
            //fi.close
            //sc.close =>We don't need do write those things

        }
    }
    public static void main(String[] args) {
         try {
             meth1();
         }catch (Exception e){
             System.out.println(e);
         }
         //we can't access that files inside the values

    }
}
