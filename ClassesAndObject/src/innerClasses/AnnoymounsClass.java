package innerClasses;

//annoymous class:
/*Annoymous inner class define the time of object creation itself
 * we can define class as well as we can create object .
 * usually, it's useful for abstract class and interface ,
 * in abstract class and interfaces we can't create object but define that methods, that methods become nameless that's called annonymous*/
abstract class MyExample {
    abstract void dis();
//    abstract void dis1();
}

class TestAnnoymous {
    //create reference as well as define the abstract but this is nameless
    //note that we didn't finish this with (;) to the object we define with {define the method}
    public void meth() {
        MyExample my = new MyExample() {//create reference for interface
            public void dis() {//defining the class
                System.out.println("Hello ");
            }
        };
        my.dis();//calling inside interface method


        //we can create it single line
        //annoymous object as well as annoymous class
        new MyExample() {
            void dis() {
                System.out.println("Hello ");
            }
        }.dis();

    }


}

public class AnnoymounsClass {
    public static void main(String[] args) {
        TestAnnoymous t = new TestAnnoymous();
        t.meth();//it will calling annonymous class


    }
}
