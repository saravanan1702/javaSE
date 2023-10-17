package looping_statements;

import java.util.Scanner;

public class Multipletable_inwhileandDowhileLoop {
    public static void main(String[] args) {
        System.out.println("Enter The Number What You want to multiple :");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
      /*  //using three step formula
        //1 intital
        int i=1;
        //2 give condition
        while(i<=10){
            System.out.println(i+" X "+n+" = "+(i*n));//statement print what we need
            //3 step Updatation parts
            //increment three ways
            //i+=1; ->i=i+1;
            i++;

        }*/
        int i=1;
        do{
            System.out.println(i+ " X "+n+" = "+(i*n));
            i++;
        }
        while (i<=10);
    }
}
