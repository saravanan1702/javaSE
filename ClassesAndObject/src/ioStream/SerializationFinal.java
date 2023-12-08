package ioStream;

import java.io.*;

class Student3 implements Serializable {
    int rollNo;
    String name;
    String dept;
}

public class SerializationFinal {
    //Serialization mean process of Storing the state of object

    //if we want to store all the object itself, Instead of storing one by one
    //we can use ObjectOutputStream it's best  way to store entire object


    //*******************Writing*************************
    //********************Serialization******************
    public static void main(String[] args) throws IOException, ClassNotFoundException {
      /*  FileOutputStream fos=new FileOutputStream("E:/Udemy/Java/my2.txt");
        ObjectOutputStream obs=new ObjectOutputStream(fos);
        Student3 s=new Student3();
        s.rollNo=10;
        s.name="Saravanan";
        s.dept="cse";
        obs.writeObject(s);//passing entire object

        fos.close();
        obs.close();*/

        //*******************Reading*************************
        //********************De-Serialization***************
        FileInputStream fis=new FileInputStream("E:/Udemy/Java/my2.txt");
        ObjectInputStream obs=new ObjectInputStream(fis);

        //create class
        Student3 s=new Student3();
        //typecasting is must which class we need to read
        s=(Student3)obs.readObject();
        System.out.println("RollNo :"+s.rollNo);
        System.out.println("Name :"+s.name);
        System.out.println("Dept :"+s.dept);
        fis.close();
        obs.close();




    }
}
