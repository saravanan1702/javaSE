package constructorinJava;

import java.util.Scanner;

class Product {
    private String item_no;
    private String name;
    private double price;
    private short qty;

    //constructor
    Product(String itemno, String nameofbrand) {
        item_no = itemno;
        name = nameofbrand;

    }

    //write only property
    String getItem_no() {
        return item_no;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

    short getQty() {
        return qty;
    }

    void setPrice(double prc) {
        price = prc;
    }

    void setQty(short qt) {
        qty = qt;
    }
    void total(){
        double total=price*qty;
        System.out.println("----------------------");
        System.out.println("total Amount :"+total);
        System.out.println("Welcome Back...");
        System.out.println("------THANK YOU-------");

    }



    @Override
    public String toString() {
        return ("Item No :" + item_no + "\n" + "Brand Name :" + name + "\n" + "Price :" + price + "\n" + "Quantity :" + qty + "\n");
    }
}
class Customer{
    String customer_id;
    String name;
    String address;
    String Phone_no;

    //read only method
    //id must be read only method
    String getCustomer_id(){
        return customer_id;
    }
    //constructor class
    Customer(String cusID){
        customer_id=cusID;
    }
    String getName(){
        return name;
    }
    void setName(String n){
        name=n;
    }
    String getAddress(){
        return address;
    }
    void setAddress(String add){
        address=add;
    }
    String getPhone_no(){
        return Phone_no;
    }
    void setPhone_no(String phno){
        Phone_no=phno;
    }
    public String toString(){
        return ("Customer ID :"+customer_id+"\n"+"Name :"+name+"\n"+"Address :"+address+"\n"+"Phone No :"+Phone_no+"\n");
    }
}
public class ProductandConsumer {
    public static void main(String[] args) {
        Product p = new Product("10a23","Pepsi");
        p.setPrice(120.0f);
        p.setQty((short) 12);
        System.out.println(p);

        p.total();

        Product p1=new Product("10PA231","Bavanto");
        //give input from keyboard
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The price of thing :");
        int price=sc.nextInt();
        System.out.println("Enter The Quantity :");
        short qty=sc.nextShort();
        p1.setPrice(price);
        p1.setQty(qty);
        System.out.println(p);//calling toString method to print details
        p1.total();

        //Customer class
        Customer c=new Customer("1001JS");
        c.setName("Jasmine");
        System.out.println("customer ID:"+c.getCustomer_id());
        c.setAddress("42,MurugavelNagar");
        c.setPhone_no("91+ 9095791516");
        System.out.println(c);
    }
}
