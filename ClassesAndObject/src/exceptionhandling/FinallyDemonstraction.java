package exceptionhandling;
//Finally block will be executed whether it exception or not exception
public class FinallyDemonstraction {
    public static void main(String[] args) {
//        System.out.println(10/5);//it will print smoothly
        //we can write try and finally, if we want to catch the exception we can also use catch block to catch the exception
        try {
            //even if it's exception finally block will be executed
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println("Dinaminator shoudn't be zero");  //as well as finally block also execute
        }
        finally {

        System.out.println("Final Message");
        }
    }
}
