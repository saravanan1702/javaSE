package ioStream;

import java.io.*;

public class CharDemo {
    //Character Array Reader

    public static void main(String[] args) throws IOException {

        //**********charArrayReader**************
    /*    char c[]={'a','b','c','d','e','f','g','h','i','j'};
        CharArrayReader cr=new CharArrayReader(c);
        int x;
        while((x=cr.read())!=-1){
            System.out.print((char) x);
        }
        //must close the file
        cr.close();*/

        //CharArrayWriter*************************
        CharArrayWriter cw=new CharArrayWriter(30);
        cw.write('h');
        cw.write('e');
        cw.write('l');
        cw.write('l');
        cw.write('o');
     /*   char c[]=cw.toCharArray();
        for(char x:c){
            System.out.print(x);
        }*/
        //store it into a file
        cw.writeTo(new FileWriter("E:/Udemy/Java/test.txt"));
        cw.close();
    }
}
