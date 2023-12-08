package ioStream;
import java.io.*;
public class ByteDemo {
    public static void main(String[] args)throws IOException {


        //**********************ByteInputStream *********************
        //source of data
//        byte b[]={'a','b','c','d','e','f','g','h','i','j'};
        //we can print all thea byte array with for loop or for each loop
        //but another way of getting all the bytes array print
        //using byteStream method
        //HINTS ;
        //SAME BYTE ARRAY TREATED LIKE A STREAM WITH THE HELP OF BYTE ARRAY INPUT STREAM

       /* ByteArrayInputStream bis=new ByteArrayInputStream(b);
      *//*  int x;
        while((x=bis.read())!=-1){
            System.out.print((char)x);
        }*//*

        //another inbuild method to print all the array bytes
        String str=new String(bis.readAllBytes());
        System.out.println(str);
        //cheking weahter it's support mark or not
        System.out.println(bis.markSupported());
        bis.close();*/

        //********************ByteOutPutStream************************
        ByteArrayOutputStream bos=new ByteArrayOutputStream(20);//it's have own byte array where it will store data
        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');

        //store in byte array
     /*   byte[]b=bos.toByteArray();//getting all the letters
        //for each loop
        for(byte x:b){
            System.out.print((char)x);//we must type cast it or it will print ASCII Values
        }*/

        //if i want to store the byte array values inot a file
        //i want to write all the letters inside the file

        bos.writeTo(new FileOutputStream("E:/Udemy/Java/demo1.txt"));

        bos.close();


    }
}
