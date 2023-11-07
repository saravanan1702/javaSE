//Package : package is a collection of classes and interfaces and other packages,
//packages just behave like a folder we can group them into single folder for related to the class and interfaces
//and there are many build in pacakages also available in java
//packages are used to organize java projects

package packagesdemo;

//import java.lang.String;
public class Demo {
    public static void main(String[] args) {
//        String str=new String("hello");
        //we can import them directly also
        java.lang.String str=new java.lang.String("hello");
        System.out.println(str);
    }
}
