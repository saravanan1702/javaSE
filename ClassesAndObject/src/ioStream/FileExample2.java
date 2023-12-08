package ioStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileExample2 {
    public static void main(String[] args)throws IOException {
        try (FileInputStream fis=new FileInputStream("E:/Udemy/Java/test.txt")){
            /*byte[]b=new byte[fis.available()];//available of byte array we don't know how bytes there in file and we can't count that also
            fis.read(b);
            //now converting byte into String
            String str=new String(b);
            System.out.println(str);*/

            //Another Method
            //i will read file letter by letter
            int x;
        /*    do{
                x=fis.read();
                  if(x!=-1)//to avoid -1 include or otherwise it will show box in end of the statement
                      System.out.print((char) x);//type cast into charactor otherwise it will print ascii values
            }while (x!=-1);//-1 mean there is no remaining resources available in file
            //OR -1 mean end of the resources or file*/

            //another method
            while ((x= fis.read())!=-1){
                System.out.print((char)x);

            }

        }
    }
}
