package ioStream;

import java.io.*;

class Student2 {
    int rollNo;
    String name;
    String dept;
}

public class SerializationDemo2 {
    //if we want to store data type with own data types whatever it be
    //store only in own data types then we approach 2nd method

    //****************writing**********************
    public static void main(String[] args) throws IOException {
        /*
        FileOutputStream fos=new FileOutputStream("E:/Udemy/Java/my1.txt");
        DataOutputStream d=new DataOutputStream(fos);
        Student2 s=new Student2();
        s.rollNo=10;
        s.name="Jasmine";
        s.dept="ECE";
        d.writeInt(s.rollNo);
        d.writeUTF(s.name);//utf=>unicode transformation format
        d.writeUTF(s.dept);

        d.close();
        fos.close();*/


        //****************writing**********************
        FileInputStream fis = new FileInputStream("E:/Udemy/Java/my1.txt");
        DataInputStream d = new DataInputStream(fis);

        //getting every data's on their own format if integer it will return integer ,if data is String it will retunr String formate only
        Student2 s = new Student2();
        s.rollNo=d.readInt();
        s.name=d.readUTF();
        s.dept=d.readUTF();

        System.out.println("Roll No :"+s.rollNo);
        System.out.println("Name :"+s.name);
        System.out.println("Dept :"+s.dept);
        fis.close();
        d.close();



    }
}
