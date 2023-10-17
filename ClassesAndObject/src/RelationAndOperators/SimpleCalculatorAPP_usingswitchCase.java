package RelationAndOperators;

import java.util.Scanner;

public class SimpleCalculatorAPP_usingswitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Operation what you need :");
        String opt=sc.nextLine();
        System.out.println("Enter  the two number :");
        int number_1=sc.nextInt();
        int number_2= sc.nextInt();
        System.out.println();
        switch (opt){
            case "Add" :
                System.out.println("Sum of :"+(number_1+number_2));
                break;
            case "Sub":
                System.out.println("Sum of :"+(number_1-number_2));
                break;
            case "Mul":
                System.out.println("sum of  :"+(number_1*number_2));
                break;
            case "Div":
                System.out.println("Sum of :"+number_1+number_2);
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
