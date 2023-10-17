package looping_statements;

import java.util.Scanner;

public class ForLoopStatement {
    public static void main(String[] args) {
        System.out.println("Enter The Number You Want to Multiple :");
        //forLoop -> we know we give all the three statement in single statements mostly
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(i+" x "+n+" = "+(i*n));
        }
    }
}
