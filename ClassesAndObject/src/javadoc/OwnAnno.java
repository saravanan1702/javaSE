package javadoc;
import  java.lang.annotation.Annotation;
@interface MyAnno{
    /*inside annotation we can define elements are members.
    * so those members are define just like method because it's interface
    * interface can have abstract method,similar to that we can define only abstract method but they aren't absract method
    * they are called elements of annotation*/

    //if annotation have any elements we must give the value

    //THIS IS INFORMATION ABOUT THE DATA ,META DATA
    String name();//who wrote this project
    String project();//which project
    String data();//on which data it's started

    //one more think it's mandatory write all the elements we can give default values once we give it no need to write it annotation
    String version() default "13";//which version it's written




}

//Annotation used for class level
//Myanno is since empty empty annotation so i can use it everywhere
//if it's has meta data i can use it for specific one

@MyAnno(name="saravanan",project = "Demo",data = "12-11-2012",version = "12.1")
public class OwnAnno {
    //instace varialble also we can give annotation
    //instace variable =>a variable belong to class

    int data=10;

    //also used for method

    public static void main( String[] args) {//annotatin also retur a parameter
        //we can give annotatin for local variable also

      int x=5;
    }
}
