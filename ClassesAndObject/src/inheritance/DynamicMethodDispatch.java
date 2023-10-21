package inheritance;
class SuperClassExample{
    void method1(){
        System.out.println("Method 1 from super class ");
    }
    void method2(){
        System.out.println("Method 2 from super class");
    }
}
class SubClassExample extends SuperClassExample{
    void method2(){
        System.out.println("Method 2 from Subclass");
    }
    void method3(){
        System.out.println("Method 3 from subclass");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        //dynamic dispatch
        SuperClassExample s=new SubClassExample();
        s.method1();//it will call superclass method 1
        s.method2();//it will call subclass overriding method2
        //s.method3();//we can't create new define object with superclass reference
        //methods always depends on object not for reference and superclass doesn't have any method3
        //so we can't create but can call overrideing method which is also have same name of the method in super class
        System.out.println("\n");

        //now we can acces all the methods extened of superclass
        SubClassExample s1=new SubClassExample();
        s1.method1();//this one come from super class
        s1.method2();//this is redefine method that's overrided version
        s1.method3();//this own method of subclass object

    }
}
