package RelationAndOperators;

import java.util.Scanner;

public class Task3Studentmark {
    public static void main(String[] args) {
        //find the student mark and avg with grades
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 marks student :");
        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();
        int total=mark1+mark2+mark3;
        float avg = (float) (mark1 + mark2 + mark1)/3;
        System.out.println("total marks :"+total);
        System.out.println("Average of mark :" + avg);
        if (avg >= 75 && avg <= 80) {
            System.out.println("the grade is A");
        } else if (avg >= 65 && avg <= 60) {
            System.out.println("the grade is B");
        } else if (avg >= 50 && avg <= 55) {
            System.out.println("the grade is c");

        } else if (avg>=40 && avg<=45) {
            System.out.println("the grade is d");

        }else {
            System.out.println("Fail ..No grade");
        }

    }
}
