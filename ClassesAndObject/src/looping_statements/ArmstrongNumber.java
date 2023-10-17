package looping_statements;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        //Armstrong the number
        int armstrong=0;
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int m=n;//as we know while divive or modulo the given number is become zero to avoid this suitvation we stroe in another variable
        while(n!=0){
            int rem=n%10;
            armstrong=armstrong+(rem*rem*rem);//square the number andd add with this whereas assign the number to armstong to compare the numbere
            n/=10;
        }
        if(armstrong==m){
            System.out.println(m +" is armstrong number ");
        }else {
            System.out.println(m +"is Not a armstrong Number");
        }
    }
}
