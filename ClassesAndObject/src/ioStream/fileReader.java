package ioStream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileReader {
    public static void main(String[] args) throws IOException {

        // READER CLASS


        //File Reader => The difference is taking a charactor array or it's reading character
        //file input Stream => taking byte array
     /*   try (FileReader fr=new FileReader("E:/Udemy/Java/test.txt")){
            int x;
            while ((x= fr.read())!=-1){
                System.out.print((char)x);

            }

        }*/

        // WRITER CLASS

        try(FileWriter fw=new FileWriter("E:/Udemy/Java/demo.txt")){
            String str=new String("Hello Welcome!");
            char[] c=str.toCharArray();
            fw.write(c);
            fw.flush();
            fw.append("Java is easy program");
        }
    }
}
