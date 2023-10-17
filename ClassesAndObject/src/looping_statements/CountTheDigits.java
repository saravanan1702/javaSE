package looping_statements;

import java.util.Scanner;

public class CountTheDigits {
    public static void main(String[] args) {
        int count=0;
        System.out.println("Enter The Digits what you want to count :");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m=n;//because n become zero while dive so we store or stack in another variable for temperrary
    /*    while(n>0){
            n/=10;
            count++;
        }
        System.out.println("the total count of digits :"+count);*/
        do{
            n/=10;
            count++;

        }while (n!=0);
        System.out.println("Count of :"+m+" is "+count);
    }
}
