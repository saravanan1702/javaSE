package ioStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws Exception {

        //NORMAL APPROACH


/*        try {
        FileOutputStream fos=new FileOutputStream("E:/Udemy/Java/test.txt");
        String str="Learn Java Programming";

        //String converted into Array of Bytes

            //1st method
//        fos.write(str.getBytes());//it returns array of bytes
            //2nd method
//        byte b[]=str.getBytes();
         //2nd method getting byte by byte using for each loop
        //taking byte by byte
       *//* for(byte x:b){
            fos.write(x);
        }*//*

            //3rd method
        byte b[]=str.getBytes();
        fos.write(b,6,13);//giving offset and giving length of the byte array
            //where we want to start and where we want to end

        fos.close();//after using this resources, it'd better close the file
        }catch (FileNotFoundException e){
            System.out.println(e);
        }catch (IOException e){
            System.out.println(e);
        }*/


        // TRY WITH RESOURCE APPROACH


        try (FileOutputStream fos = new FileOutputStream("E:/Udemy/Java/test.txt");) {
            String str = "Learn Java Programming";
            byte b[] = str.getBytes();
            fos.write(str.getBytes());
            //in try with resourse method we don't need to close the file it will close the file automaticaly once file used
            //instead of using finally block
        }


    }
}
