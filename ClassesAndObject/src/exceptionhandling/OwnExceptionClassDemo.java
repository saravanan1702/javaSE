package exceptionhandling;
//creating class for own exception and this class must be extends from Exception class
class DimentionException extends Exception{
   public String toString(){
       return "Dimention Shouldn't be Negative ,please give Positive Numbers";
   }
}
public class OwnExceptionClassDemo extends Throwable {
    static int area(int l,int b)throws DimentionException{
        if(l<0||b<0){
            throw new DimentionException();
        }
        return l*b;
    }
    static void meth1()throws DimentionException{//throws this exception to who called this method(Example :main method called this method so we can handle it on main method)
//        System.out.println(area(10,5));
        System.out.println(area(-10,5));
    }
    public static void main(String[] args) {
        //handle this exception in main method if not then it will move to jvm then jvm will handle this Exception
        try {
            meth1();
        }catch (DimentionException d){
            System.out.println(d);
        }
    }
}
