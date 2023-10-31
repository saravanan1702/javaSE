package inheritance;
class  A1{

}
class B1 extends A1{};
class SuperClass{

    void display(){
        System.out.println("Hello i m super class ");
    }
    A1 display1(){//this is parent class
        System.out.println("hello super class ");
        return new A1();
    }
}
class SubClass extends SuperClass{
    void display(){
//        super.display();//getting super class method
        System.out.println("Hello i'm Sub class ");
    }

    //though the return types are differnet then how it's overriding the reason it's inherited from super class b is subclass
    B1 display1(){
        System.out.println("Hello i'm sub class");
        return new B1();
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        SuperClass sp=new SuperClass();
        sp.display();//calling superclass method
        System.out.println("\n");
        SubClass sc=new SubClass();
//        sc.display();//now caling subclass method, but it will print superclass method also because we redefine super class method also
        sc.display();//print own class method because we didn't call any super
        System.out.println("\n");
        //Dynamic Dispatch (very importat to know)
        SuperClass sup=new SubClass();
        sup.display();//called by subclass method
        //how it happen
        //we create reference for super class,but object created by subclass so it will print only object of the method
        //though the reference denote superclass

        //HINTS(*)
        //The Method will be called always depends on an objects NOT Upon Reference
        //that's why subclass method called


        //The Superclass Reference holding on subclass method and override(redefine) method is called
        //method of object will be called not a method of reference,THIS IS DYNAMIC DISPATCH METHOD
        /*B1 b=new B1();
        A1 a=new A1();*/

    }
}
