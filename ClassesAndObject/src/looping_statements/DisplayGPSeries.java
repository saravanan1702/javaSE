package looping_statements;

import java.util.Scanner;

public class DisplayGPSeries {
    public static void main(String[] args) {
        //Gp=> Geomantrical Progession
        //2 4 8 16 ...
        //5 10 20 40
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number :");
        int a= sc.nextInt();
        int d= sc.nextInt();
        int n= sc.nextInt();
        int term=a;
        for(int i=0;i<n;i++){
            System.out.print(term+",");
            term*=a;
        }
    }
}
