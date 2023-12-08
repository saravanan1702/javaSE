package ioStream;
import java.io.*;
public class BufferedDemo {
    public static void main(String[] args) throws IOException {


        //**************BufferInputStream*********************

   /*  FileInputStream fis=new FileInputStream("E:/Udemy/Java/test.txt");
     BufferedInputStream bis=new BufferedInputStream(fis);//attach file in buffered stream
        //now file input is connected with buffered input stream


      *//*  int x;
        while((x=fis.read())!=-1){
            System.out.print((char)x);
        }
        fis.close();*//*

        //befits of connected buffered stream
       *//* System.out.println("File :"+fis.markSupported());//false
        System.out.println("Buffered File :"+bis.markSupported());*//*

        System.out.print((char)bis.read());//one by one read l
        System.out.print((char)bis.read());//e
        System.out.print((char)bis.read());//a

        bis.mark(10);//upto 10 letter
        //mark is set on (r)
        System.out.print((char)bis.read());//r
        System.out.print((char)bis.read());//n
        bis.reset();
        //again print r because we reset it
        System.out.print((char)bis.read());//r
        System.out.print((char)bis.read());//n

        //the output like this =>learnrn*/



//     ********************BufferReader******************

        //Working same as BufferedInputStream
        //the difference is bufferedreader working with char and buffered input stream working with byte


        FileReader fr=new FileReader("E:/Udemy/Java/test.txt");
        BufferedReader br=new BufferedReader(fr);//attach file in buffered stream
        System.out.print((char)br.read());//one by one read l
        System.out.print((char)br.read());//e
        System.out.print((char)br.read());//a

        br.mark(10);//upto 10 letter
        //mark is set on (r)
        System.out.print((char)br.read());//r
        System.out.print((char)br.read());//n
        br.reset();
        //again print r because we reset it
        System.out.print((char)br.read());//r
        System.out.print((char)br.read());//n


        System.out.println();//for next line

        //another important method avaialbe only in buffered reader not available in Buffered Input Stream
        //it will print rest of the character that's available in file

        System.out.println("String :"+br.readLine());

    }
}
