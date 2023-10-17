package RelationAndOperators;

import java.util.Scanner;

public class ifelsePractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marital Status :");
        char marital = sc.next().charAt(0);
        if (marital == 'u' || marital == 'U') {
            System.out.println("Enter Your Gender :");
            char gender = sc.next().charAt(0);
            System.out.println("Enter Your Age :");
            int age = sc.nextInt();
            if ((gender == 'm' || gender == 'M') && age >= 30) {
                System.out.println("You are eligible for License");
            } else if ((gender == 'f' || gender == 'F') && age >= 25) {
                System.out.println("you are eligible for license");
            } else {
                System.out.println("You are not eligible for license");
            }

        } else if (marital == 'm' || marital == 'M') {
            System.out.println("You're Eligible for License");

        } else {
            System.out.println("Invalid input");
        }

    }
}
