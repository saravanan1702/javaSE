package exceptionhandling;

public class nestedTry {
    public static void main(String[] args) {
        //nested try and catch exception
        try {
            int[] a = {10, 0, 2, 4, 8};
            int r = a[0] / a[2];
            System.out.println("Result is :" + r);
            try {
                System.out.println(a[10]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid Index check array length :" + e);

            }
        } catch (ArithmeticException e) {
            System.out.println("denominator shouldn't be zero :" + e);
        }
        System.out.println("hello");//independent statement
    }
}
