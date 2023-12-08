package ioStream;

import java.io.*;

class  Student1{
    //************** 1st Approach**************
    //Store Everything in String then type casting it has some problem because we need to type casting manusally


    int rollNO;
    String name;
    String dept;
}
public class SerializationDemo {
    public static void main(String[] args)throws IOException {

//        **************WRITTING************************************

        //writing a class object into files

       /* FileOutputStream fos=new FileOutputStream("E:/Udemy/Java/my.txt");
        PrintStream ps=new PrintStream(fos);//fos is attach with printStream
        //printstram store only in String if we want to use read method to see the files we need to convert  or type casting to appropiate data types
        Student1 s1=new Student1();
        s1.rollNO=10;
        s1.name="Saravanan";
        s1.dept="Civil";
        ps.println(s1.rollNO);
        ps.println(s1.name);
        ps.println(s1.dept);

        ps.close();
        */

        //hints=>println=>this is belongs to sysout.out.println=>method

//        **************READING************************************

        //Reading class object that we wrote alrady

        FileInputStream fis=new FileInputStream("E:/Udemy/Java/my.txt");

        //                                   we need coverted for reading file
        BufferedReader br=new BufferedReader(new InputStreamReader(fis));//attach with fis

        //Create object for class
        Student1 s1=new Student1();
        //converting String into integer
        s1.rollNO=Integer.parseInt(br.readLine());//this is problem in this scanario we need to type casting manually
        //the reason printstream class stores everything in String format
        s1.name=br.readLine();
        s1.dept=br.readLine();
        System.out.println(s1.rollNO+" "+s1.name+" "+s1.dept);

        fis.close();




    }
}
