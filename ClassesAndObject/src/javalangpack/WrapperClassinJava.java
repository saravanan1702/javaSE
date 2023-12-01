package javalangpack;

import java.lang.foreign.ValueLayout;

public class WrapperClassinJava {
    public static void main(String[] args) {
//        Integer i=new Integer(10);// this one is deprecated we can't use contructor as assinging values
        Integer i=Integer.valueOf(10);
        Integer a=10;//we can give directly and this is proper method
        Byte b=15;
        //converting String into a number
        //we can give numeric value and string value also
        Byte b1= Byte.valueOf("15");
        //we can't directly given value in Byte method
        //but assgin values then pass the object into Byte method
        byte bb=15;
//        Byte b2=Byte.valueOf(20);//it will error we can't directly pass Byte method it's allows only integer values
        Byte b2=Byte.valueOf(bb);//it will error we can't directly pass Byte method it's allows only integer values
         //similary for short
        //can assing short values directly but we can assgin values then pass the value into method
        //ex
//        Short s=Short.valueOf(10);//error
        short s=15;
        Short ss=Short.valueOf(s);//now it's allows
        float f=12.4f;
        Float fff=Float.valueOf(f);
        Double d=Double.valueOf(1223.333);
        Character c=Character.valueOf('a');
        Boolean boo=Boolean.valueOf(true);


        //Unboxing or unWrapping
        //getting object as primitive values
        Float ff=Float.valueOf("1223.3");
        float fl=ff.floatValue();//unwrapping object into primitive data type
        //and we can directly assign

        //auto unboxing
        float ff1=ff;//(ff=>object of Float)//getting object values into primitive values//it will automatically called (.operator)floatvalue store as flaot primitive data types


        //boxing the primitive data types into object type
        int val=10;
        Integer in=Integer.valueOf(val);//converting primitive into object with .valueOf method

        //autoboxing
        Integer integer=val;//directly converted primitive into object
    }


}
