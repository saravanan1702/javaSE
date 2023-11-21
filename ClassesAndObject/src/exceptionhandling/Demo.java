package exceptionhandling;

public class Demo {
    public static void main(String[] args) {
        //Multiple try and catch block
        //try block can have one or more catch block
        try{
            int[] a ={10,0,2,3,4,5};
            //    a[0]/a[2];10/2=>it will execute smoothly
            int r=a[0]/a[1];//10/0=>anything divide by zero it will be zero infinity but program doesn't know it infinity it's an error
            System.out.println("Result is "+r);

            System.out.println(a[10]);//there's no index at a[10]

        }
        //make sure that the catch block must be sub class if it is super class it will shadowed another catch block
        catch(ArithmeticException e){
            System.out.println("Denominator shouldn't be zero "+e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Please check Array length "+e);
        }
        System.out.println("hello");//this is independent statement not belong to try block
    }
}
