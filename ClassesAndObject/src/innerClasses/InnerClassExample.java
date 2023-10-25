package innerClasses;
class Outer{
    int x=10;
    class Inner{
        //we can access directly member of outer class
        int y=20;
        void innerMethod(){
            System.out.println("x is :"+x);
            System.out.println("y is :"+y);
        }
    }
    void outerMethod(){
        //we can't access directly member of inner class unless object create
        Inner i=new Inner();
        i.innerMethod();
        System.out.println("Inner class Member Y is :"+i.y);
    }
}
public class InnerClassExample {
    public static void main(String[] args) {
        //create object for outer class
        Outer o=new Outer();
        o.outerMethod();//it will call inner class method and member
        System.out.println("Outer class member x is :"+o.x);
       //if we want to access outer class with inncer class
        Outer.Inner i=new Outer().new Inner();
        i.innerMethod();//inner class method
        System.out.println("Inner class member y is :"+i.y);

    }
}
