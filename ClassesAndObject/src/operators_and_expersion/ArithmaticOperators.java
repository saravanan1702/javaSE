package operators_and_expersion.udemy;

import java.util.Scanner;

public class ArithmaticOperators {
    public static void main(String[] args) {
        /*
        * Arith matic oprators applicable for all the data types except boolean
        * + -addition
        * - -> subtraction
        * / -> division
        * * -> Multiplication
        * % -> and modulo
        * Hint :->
        * MOdulos opeators used for to get remimder
        * divison operators used for to get quosint*/
        // int,float,double ,char all of these applicalbe
        int a=10;
        int b=2;
        int number=10;
        float number2=20;
        long n1=10;
        double n2=20;
        double n3=3.0d;
        int n4= (int) n3;
        System.out.println(n4);
        System.out.println(n1+n2);
        System.out.println(number+number2);
        Scanner sc=new Scanner(System.in);
        System.out.println(a+b);
        System.out.println("Enter The NUmber 1:");
        int num1=sc.nextInt();
        System.out.println("Enter the Number 2:");
        int num2=sc.nextInt();
        System.out.println("Addition :"+(num1+num2));
        System.out.println("Subtractin :"+(num1-num2));//in these scaniro why we use double paranthese when we use + symbol to concate two thing its confusing itselt jvm that's why we use these method to solve the problem
        System.out.println("Multiplication :"+(num1*num2));
        System.out.println("Division :"+(num1/num2));
        System.out.println("Modulos :"+(num1%num2));

        //hint :
        //mod operators are also work on float and double
        //but division doesn't work on float or double
    }
}
