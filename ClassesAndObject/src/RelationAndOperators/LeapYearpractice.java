package RelationAndOperators;

import java.util.Scanner;

public class LeapYearpractice {
    public static void main(String[] args) {
        System.out.println("Enter The year to check whether the year is  leap or not :");
        Scanner sc=new Scanner(System.in);
        int year= sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("this  leap year");
                }else {
                    System.out.println("not a leap year");
                }
            }
            else {
                System.out.println("this  a leap year");
            }
        }
        else {
            System.out.println("NOt a leap year");
        }
    }
}
