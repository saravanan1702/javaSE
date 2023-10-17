package operators_and_expersion.udemy;
import  java.util.*;
import java.util.Scanner;

//find area of Triangle
public class Challange_1 {
    public static void main(String[] args) {
    //what we do now to find the area of triangle first input keyword to base and height form user
        //lets go
        Scanner sc=new Scanner(System.in);
//        float base;
//        System.out.println("Enter the Base :");
//        base=sc.nextFloat();
//        System.out.println("Enter the Height :");
//        float height= sc.nextFloat();
//        float area=(1f/2f)*base*height;
//        System.out.println("The Area of Trianlge :"+area);
         //now see area of triangle using all sides
        int a,b,c;
        float sum;
        System.out.println("Enter the 3 side of triangle :");
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        sum=(1f/2f)*a*b*c;
        System.out.println("Sum of Triangle :"+sum);
        float area= (float) Math.sqrt(sum*(sum-a)*(sum-b)*(sum-c));
        System.out.println("Area of Triangle both sides :"+area);
    }
}
