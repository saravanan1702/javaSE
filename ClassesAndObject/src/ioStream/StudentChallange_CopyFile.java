package ioStream;

import java.io.*;

public class StudentChallange_CopyFile {
    public static void main(String[] args)throws IOException {
     /*   try(FileReader fr=new FileReader("E:/Udemy/Java/sources.txt")) {
            char []c=new char[fr.read()];
            int x;
            while ((x=fr.read())!=-1){
                System.out.print((char) x);
            }

        }*/
        //copying file inot another one
        //converting capital into small case

        //hints
        // 65 - 90 Capital letters
        // 97 -122 Small letters

       /* FileReader fr=new FileReader("E:/Udemy/Java/sources.txt");
        FileReader fr1=new FileReader("E:/Udemy/Java/sources2.txt");*/
//        FileWriter fw=new FileWriter("E:/Udemy/Java/sources2.txt");

        FileInputStream fr=new FileInputStream("E:/Udemy/Java/sources.txt");
        FileInputStream fr1=new FileInputStream("E:/Udemy/Java/sources2.txt");
        FileOutputStream fos=new FileOutputStream("E:/Udemy/Java/sources3.txt");
        //copying these two files into another file

        //there's another class for getting two files simultinouesly and it will get one file after another file
        SequenceInputStream sis=new SequenceInputStream(fr,fr1);

        int x;
        while((x=sis.read())!=-1){
            fos.write(x);
        }
        fr.close();
        fr1.close();
        fos.close();


      /*  int x;
        while ((x=fr.read())!=-1){
            if(x>=65 && x<=90)fw.write(x+32);
            else fw.write(x);

        fr.close();
        fw.close();
        }*/

    }
}
