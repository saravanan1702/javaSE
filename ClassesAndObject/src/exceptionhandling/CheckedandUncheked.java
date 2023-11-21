package exceptionhandling;


//creating own exception
class OwnException extends Exception{
    public String toString(){
        return "File is not there please Check it before we get";
    }
}
public class CheckedandUncheked  {
    static void meth1(){
        //handling Error

        //-----UNCHECKED EXCEPTION-----
       /* try {

        int []arr={1,2,3,4,5};//array length is just 5
        System.out.println(arr[10]);//arrray 10th index value
        }catch (Exception e){
            System.out.println(e.getMessage());
//            e.printStackTrace();//if we want to know in which method the exception was raised and what's the sequnce of metho cause that has exception. it will show all the exception

        }
        //unchecked exception
//        System.out.println(10/0);//intentionaly do that compiler won't force to do handle exceptin
        //compiler won't give any restriction while program it will show error once it called*/
        //------CHECKED EXCEPTION-----
        //compiler will incest us to handle exception unless it won't execute
        //we must handle with exception
//        FileInputStream fi=new FileInputStream("my.txt");
        try {
            //there is no statement is here,we just test it our own exception

        throw  new OwnExceptionClassDemo();
        }catch (OwnExceptionClassDemo oe){
            System.out.println(oe);
        }

    }
    static void meth2(){
        meth1();
    }
    static void meth3(){
        meth2();
    }
    public static void main(String[] args) {
       meth3();
    }
}
