package exceptionhandling;

public class FinalDemoInMethod {
    static void meth1()throws Exception{
        try{
            throw  new Exception();
        }finally {
            System.out.println("Final Message");
        }
    }
    public static void main(String[] args)throws Exception {//jvm will handle this exception
      /* try {
           meth1();
       }catch (Exception e){
           System.out.println(e);
       }*/
        meth1();//finally block will be execute
    }
}
