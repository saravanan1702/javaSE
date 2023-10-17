package looping_statements;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        int rem=0;
        int rev=0;
        System.out.println("Enter The Number :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        while(n!=0){
            rem=n%10;//we get last digit
            rev=(rev*10)+rem; // 0*10=>0+last digit=>example 123=>0+3=>3
            n/=10;//we get rest of the last digit 123/10=> 12
        }
        if(m==rev){
            System.out.println(m+" is palidrome Number ");
        }else {
            System.out.println(m+" is Not a palindrome Number");
        }
    }
}
