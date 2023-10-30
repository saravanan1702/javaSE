package staticandfinal;

import java.util.Scanner;
class Test{
    static int a=10;
    int b=20;
    void show(){
        System.out.println(a+" "+b);
    }
    static void display(){ //static method only acces static member
        System.out.println(a);
    }
}
public class StaticMember {
    public static void main(String[] args) {
        Test t=new Test();
        System.out.println("static variable a is :"+Test.a);
        t.show();//non static method
        System.out.println("non static varible b :"+t.b);
        Test.display();//we can call this static method with class name
        //static member shared it's member for all the object
        Test t1=new Test();
        t1.a=15;//also call this member with object
        t1.show();//15 20
        t1.b=25;
        t1.show();
        //15 25 //only change for this object not for entire object
        Test t2=new Test();
        t2.show();//the static value will will be changed but the b value remains the old value 20
        //15 20

        Test t3=new Test();
        t3.a=100;
        t3.b=50;
        t3.show(); //output 100 50 //change 50 for this object not for all the object but static a=100 will be change all the object which is created with class name (Test)
        t.show();//output 100 20


    }
}
