package javadoc;
//In build othr annotion
/*1.targer
* 2.document
* 3.retention
* 4.inherited
* 5.repeatable*/

import java.lang.annotation.*;

/*1 @Target(value = ElementType.CONSTRUCTOR)//contsrutor only targeting our annotation for specificly
@Target(value = ElementType.CONSTRUCTOR,ElementType.CLASS)//we can give multiple target also
    //we mention where we want to use it*/
//if we say class it will work only for class ,if say local variable then it will work only for local variable

//2.@ Documented   over annoation available in doucment
//java util tool will use this annotation description


/*3.@ Retention(RetentionPolicy.CLASS)// this will be available in withinn the class
    //some other polciy SOURCE AND RUNTIME*/


//4.@Inherited//this annotation available on inherited child class also
// it will work on current class as well as child class(Inherited class)




//5. @Repeatable(Anno2.class) use for multiple times
//if we are using Repeatable annotation then interface must be public
@interface Anno2{
    String name();
    String project();
    String data() default "today";
    String version() default "13.2";
}

@Anno2(name = "saravanan",project = "Bank")
public class OwnAnno2 {
    int data=10;
    public static void main(String[] args) {
       int x=5;
    }
}
