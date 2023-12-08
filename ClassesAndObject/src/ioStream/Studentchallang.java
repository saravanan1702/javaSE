package ioStream;

import java.io.*;

public class Studentchallang {
    public static void main(String[] args) throws IOException {

        //******************Writing******************
       /* float[] list ={1.2f,2.6f,9.01f,2.35f};
        FileOutputStream fos=new FileOutputStream("E:/Udemy/Java/list.txt");
        DataOutputStream d=new DataOutputStream(fos);//data out put stream datas might have been in binary numbers we can't read that files but can read with datainput stream
        d.writeInt(list.length);//size of list
        //using for each loop for storing all the data
        for(float l:list){
            d.writeFloat(l);//writing datas one by one in files
        }
        d.close();
        fos.close();
        */

        //******************Reading******************
        FileInputStream fis=new FileInputStream("E:/Udemy/Java/list.txt");
        DataInputStream d=new DataInputStream(fis);
        int length=d.readInt();//initial length of the file how much data inside the file
        float data;
        for(int i=0;i<length;i++){
            data=d.readFloat();//store in data variable then print that data
            System.out.println(data);
        }
        d.close();
        fis.close();





    }
}
