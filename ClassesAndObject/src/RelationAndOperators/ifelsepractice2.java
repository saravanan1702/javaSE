package RelationAndOperators;

import java.util.Scanner;

public class ifelsepractice2 {
    public static void main(String[] args) {
        //check eligible for vote
        System.out.println("Enter Your age  :");
        Scanner sc = new Scanner(System.in);
//        char gender=sc.next().charAt(0);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Enter Your Gender :");
            char gender = sc.next().charAt(0);
            if (gender == 'm' || gender == 'M') {
                System.out.println("Go to room NO  -6");

            } else if (gender == 'f' || gender == 'F') {
                System.out.println("Go to  room no -5");
            } else {
                System.out.println("Invalid Selection");
            }
        } else {
            System.out.println("You are not eligible for vote...");
        }
    }
}
