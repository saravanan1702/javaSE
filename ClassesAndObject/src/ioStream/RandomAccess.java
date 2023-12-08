package ioStream;
import  java.io.*;
public class RandomAccess {
    public static void main(String[] args) throws IOException{
        RandomAccessFile rai=new RandomAccessFile("E:/Udemy/Java/demo3.txt","rw"); //after path we must give which mode we want read and write
//        byte b[]={'a','b','c'.'d','e'.'f','g','h','i'};

        System.out.println((char)rai.read());//we can read our file with file own method
        System.out.println((char)rai.read());
        System.out.println((char)rai.read());
        System.out.println((char)rai.read());//pointing on (d)
        rai.write('D');//now pointer is pointing on d now i want to override with D
        //after writing this file the file pointer move to another location
        System.out.println((char) rai.read());//now it will move onto another point (f)


        //we can skip some location of the file  previous point(f) skip g and h now point on i
        rai.skipBytes(2);
        System.out.println((char)rai.read()); //(i)
        rai.seek(3);// (d)
        System.out.println((char)rai.read());
        System.out.println(rai.getFilePointer());//current file position  (d) 4th position
        rai.seek(rai.getFilePointer()+2);//current position with move forward (+)if we want to backword give (-)
        System.out.println((char)rai.read());
    }
}
