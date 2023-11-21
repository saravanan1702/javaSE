package exceptionhandling;

public class ThrowAndThrowsExceptionDemo {
    static int area(int l,int b)throws Exception{//define the Exception
        if(l<0||b<0){
            throw new Exception();//we must throws this action which is called
        }
        return l*b;
    }
    static void meth1()throws Exception{//if not handle this we can throws this exception to which method called this meth1 method
       //handle with try and catch, if not throws to next one which is called this method
        int a=area(-10,3);
        System.out.println("Area is :"+a);
    }

    public static void main(String[] args) {//throws Exception{//again if not handle this error in main method then jvm will handle it
        //handling in main method
        try {

      meth1();
        }catch (Exception e){
            System.out.println("Dimention shouldn't be negative ");
        }
    }
}
