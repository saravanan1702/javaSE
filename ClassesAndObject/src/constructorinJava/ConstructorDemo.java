package constructorinJava;

import java.util.Scanner;

class  Rectangle{
    private double length;
    private double breadth;
    //why we can access this private values in construtor
    //because this won't exist fields of object these are local variable for constructor

    //constructor(non-parameterized)
   public Rectangle(){
        length=10;
        breadth=20;
    }
    //parameterized constructor
    public Rectangle(double l,double b){
//       length=l;
//       breadth=b;
        //passing parameter to setter method
        setLength(l); //double l
        setBreadth(b);//double b
    }
    //validation to avoid negative values
    public double getLength(){
       return length;
    }
    public double getBreadth(){
       return breadth;
    }
    public void setLength(double l){
       if(l>0)
       length=l;
       else
           length=0;
    }
    public void setBreadth(double b){
        if(b>0)
            breadth=b;
        else
            breadth=0;

    }

    //Constructor overloaded
    public Rectangle(double s){
       length=breadth=s;
    }
    double area(){
       return length*breadth;
    }
    double perimeter(){
       return 2*(length+breadth);
    }
    boolean isSqure(){
       if(length==breadth){
           return true;
       }
       else {
           return false;
       }
    }


}
public class ConstructorDemo {
    public static void main(String[] args) {
        //NON-PARAMETERIZED CONSTRUCTOR
        Rectangle r=new Rectangle();
        System.out.println("Area :"+r.area());
        System.out.println("perimeter :"+r.perimeter());
        System.out.println("Is it Rectangle :"+r.isSqure());

        //PARAMETERIZED CONSTRUCTOR
        Rectangle r1=new Rectangle(12,3);
        System.out.println(r1.area());
        System.out.println(r1.isSqure());
        System.out.println(r1.perimeter());

        //CONSTRUCTOR OVERLOADING METHOD
        // if we assign S=>3
        //length=breadth=s=3
        Rectangle r2=new Rectangle(3);
        System.out.println(r2.area());//3*3=>9.0
        System.out.println(r2.isSqure());//true



        /*------------GETTING CONSTRUCTOR VALUES FROM USERS---------------*/

        //can we assign values from user
        //let's try
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The length :");
        double length=sc.nextDouble();
        System.out.println("Enter The Breadth :");
        double breadth=sc.nextDouble();
        Rectangle r3=new Rectangle(length,breadth);
        System.out.println("Area :"+r3.area());
        System.out.println("Is Square :"+r3.isSqure());
        /*-------------------------------------------------------------------*/


    }
}
