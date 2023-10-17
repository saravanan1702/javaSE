package looping_statements;

import java.util.Scanner;

public class SumOfN_Numbers {
    public static void main(String[] args) {
        int i=0, sum = 0;
     /*   for (i = 1; i <= 5; i++) {
            sum=sum+i;

        }
        System.out.println("the sum of 5 is :"+ sum);*/
        //same thing doing in while loop and do while loop
        System.out.println("Enter The Number :");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
     /*   while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println("the sum of "+n+" is :"+sum);*/
        //same thing doing in do while loop
        do{
            i+=1;
            sum+=i;
        }while (i==n);
        System.out.println("the sum of n number is :"+sum);
    }
}