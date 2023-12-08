package ioStream;

import java.io.*;

class Customer implements Serializable{
    String CustID;
    String name;
    String phNO;

    static int count=1; //generate customer id automatically

    //Default constructor
    public Customer(){

    }

    //parameterized Constructor
    Customer(String n,String p){
        CustID="C"+count;
        count++;
        this.name=n;
        this.phNO=p;

    }
    public String toString(){
        System.out.println("Customer Id :"+CustID);
        System.out.println("Customer Name :"+name);
        System.out.println("Customer Phone No :"+phNO);
        return " ";
    }
}
public class StudentChallangeStoreandRetrive {
    public static void main(String[] args) throws IOException {
        //Array of Customer class
        Customer list[]={new Customer("Saravanan","90956688"),new Customer("Jasmine","67433993"),new Customer("Allwin","908762258")};
        FileOutputStream fos=new FileOutputStream("E:/Udemy/Java/customer.txt");
        ObjectOutputStream obs=new ObjectOutputStream(fos);

        obs.writeInt(list.length);//getting array size //finding how many objects are in there array list

        for(Customer c:list){
            obs.writeObject(c);
        }
        obs.close();
        fos.close();


    }
}
