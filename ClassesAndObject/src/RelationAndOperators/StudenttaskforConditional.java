package RelationAndOperators;

import java.util.Scanner;

public class StudenttaskforConditional {
    public static void main(String[] args) {
        //find the number is odd or even
        //find the personn is young or not
        //find the student avg and grades
        // find the number is odd or even method
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number%2==0){
            System.out.println("the Number is Even");
        }
        else {
            System.out.println("the Number is Odd");
        }
    }
}
