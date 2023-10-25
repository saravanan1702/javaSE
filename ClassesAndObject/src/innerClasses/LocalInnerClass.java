package innerClasses;
/*why we use it local inner classs:
* if we want any class to inherited to some exiting class or implementing an interfaces then this local inner class will be usefull
* we don't need for entire class we need some part of the methods ,that's why we use it*/
class OuterExample{
    void method(){
        //this inncer class belongs to only in this method we can't access anything from outer class
        class InnerEx{
            int val=10;
            void method(){
                System.out.println("Local inner class");
                System.out.println("local Innver class member :"+val);
            }

        }
        //proper way to call the method --> object creation with refernce
        InnerEx i=new InnerEx();
        i.method();//local inner class method wil be called if create object for outer class
        //we can creat annoymous object
        new InnerEx().method();//this object doesn't have reference of class so this is annoymous object
    }
}
public class LocalInnerClass {
    public static void main(String[] args) {
        OuterExample o=new OuterExample();
        o.method();

    }
}
