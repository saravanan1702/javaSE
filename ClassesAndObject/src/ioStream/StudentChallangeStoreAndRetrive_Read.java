package ioStream;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class StudentChallangeStoreAndRetrive_Read {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc=new Scanner(System.in);
        FileInputStream fis=new FileInputStream("E:/Udemy/Java/customer.txt");
        ObjectInputStream obs=new ObjectInputStream(fis);

        int lenth=obs.readInt();
        Customer[] list =new Customer[lenth];
        for(int i=0;i<lenth;i++){
            list[i]=(Customer) obs.readObject();
        }
        //searching particular customer name 
        System.out.println("Enter The Name of The Customer :");
        String name=sc.next();
        //if given name match with customer array list then print the details about that customer
        for(int i=0;i<lenth;i++){
            if(name.equalsIgnoreCase(list[i].name)){
                System.out.println(list[i]);
            }
        }
        obs.close();
        fis.close();
    }
}
