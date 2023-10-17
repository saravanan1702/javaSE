package looping_statements;

import java.util.Scanner;

public class DisplayAPSeries {
    public static void main(String[] args) {
        //Arithmatic progression
        //1 3 4 6 8 10 12 14 16
        //3 8 13 18 23 28
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number  a and d and Nth times:");
        int a= sc.nextInt();
        int d= sc.nextInt();
        int n= sc.nextInt();
        int term=a;/**///how many terms /**/we print this arithmatic
        for(int i=0;i<n;i++){
            System.out.print(term+", ");
            term=term+d;
        }
    }
}
