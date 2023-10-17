package RelationAndOperators;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //find the person is young or not in conditional statement
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=18 && age<=55){
            System.out.println("the person is young");
        }
        else {
            System.out.println("the person is not a  young");
        }
    }
}
