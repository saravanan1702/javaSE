package abstractClass;

import static abstractClass.Test.*;

interface Test{
    int x=10;//this is final, static we can't change  this as a normal variable
    final int y=30;
    static int X=50;//why it's shadowed bydefult interface properties values are static or final we don't need to asssign them
    void meth1();//we can't create body of method in interface
    //but we can use if the method is static
    public static void meth2(){
        System.out.println("Meth 2 from Interface");
    }

    //we can also have default method
    default void meth4() { //in java 8 interface have default melthod to avoid conflict in programming
        System.out.println("meth 4 default methods");
    }
    //In java 9 we have private methods also but we can access internaly within the classes
    private void meth5(){
        System.out.println("private method 5");
    }
    //we can access this private method within the class
    default void meth6(){
        meth5();//accessing private method
        System.out.println("meth6 ");
    }
}
class Test2 implements Test{
    @Override
    public void meth1() {
        System.out.println("meth 1 is overiride");
    }
    public void meth5(){
        System.out.println("meth 5 from concrete class");
    }
}
public class Do_sAND_Dont_s {
    public static void main(String []args){
        System.out.println("hello");
        meth2();//static method we don't need to create object
        //we can acces with interface name and dot(.) operator and method or variable
        System.out.println(Test.x);
        System.out.println(Test.X);
        System.out.println(y);
        Test2 t2=new Test2();
        t2.meth4();//default method from interface
        t2.meth1();//override method
        t2.meth5();
        t2.meth6();//since default method also have private method so we can access private method also
        //but we can't access priavte method directly but can access method which is contain private methods

    }
}
