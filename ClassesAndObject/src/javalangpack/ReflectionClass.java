package javalangpack;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class My{
    public int a;
    private int b;
    protected  int c;
    int d;

    //default Constructor
    public  My(){

    }
    //parameter constructor
    public  My(String s1,String s2){

    }
    //method non parameter
    public  void display(){

    }
    public  int show(int x,int y){
        return 0;
    }
}
public class ReflectionClass {
    public static void main(String[] args) {
//      Class c;//definition of any other class
    Class c= My.class;
  /*  My m=new My();
    //this is also definition of class
    Class c1=m.getClass();*/
        Field fi[]=c.getDeclaredFields();//field means datas ,datas of class
        for(Field x:fi){
            System.out.println(x);
        }
        //getting constructors
        //array of contructor
        Constructor con[]=c.getConstructors();
        for(Constructor ct:con){
            System.out.println(ct);
        }
        Method m[]=c.getMethods();
        for(Method md:m){
            System.out.println(md);
        }

//        System.out.println(c.getName());

    }
}
