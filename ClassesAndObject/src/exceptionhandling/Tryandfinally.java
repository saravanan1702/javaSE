package exceptionhandling;

public class Tryandfinally {
    public static void main(String[] args) {
        try {
            int[] a = {10, 0, 2, 3, 4, 5};
            //    a[0]/a[2];10/2=>it will execute smoothly
            int r = a[0] / a[1];//10/0=>anything divide by zero it will be zero infinity but program doesn't know it infinity it's an error
            System.out.println("Result is " + r);
            System.out.println(a[10]);//there's no index at a[10]

            //make sure that the catch block must be sub class if it is super class it will shadowed another catch block
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        //finally block definetly executed whether it's error or not
        finally {
            int[] a = {10, 0, 2, 3, 4, 5};
            int r = a[0] / a[2];
            System.out.println("Result is " + r);
        }
    }
}

