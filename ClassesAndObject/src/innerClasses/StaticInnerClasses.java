package innerClasses;
class OuterNonStatic{
    static int x=20;
    int y=20;
    static class StaticClss{
        void display(){
            System.out.println("display from static method");
            System.out.println("x is :"+x);
//            System.out.println("y is :"+y);
            //the reason why we can't acces y because it's non-static member
            //static class only access static method or static member
            //and we don't need to create separate object for this class unlike nested inner class
            //we can call this method with outer side class

        }

    }
}
public class StaticInnerClasses {
    public static void main(String[] args) {
        //we don't need to create object for outer class
        OuterNonStatic.StaticClss o=new OuterNonStatic.StaticClss();
        o.display();



    }
}
