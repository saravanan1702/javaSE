package looping_statements;

import java.util.Scanner;

public class FactorialOfTheNumber {
    public static void main(String[] args) {
        //factorial of the number 5!=120;
        //how it comes 120 of factorial
        //5!=>1*2*3*4*5=120;
        System.out.println("Enter the Number :");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i,fact=1;
        for(i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("the Factorial of the given number is :"+fact);
    }
}
