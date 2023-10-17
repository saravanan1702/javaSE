package looping_statements;

import java.util.Scanner;

public class DisplayANumberWithWords {
    public static void main(String[] args) {
        //123 => in words, one two three
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number :");
        int number= sc.nextInt();
        //first we split the number then conver to string
        //first we convert decimal to words
        String str="";
        while(number>0){
            int rem=number%10;
            number/=10;
            str=str+rem;

        }
        System.out.println(str);
        //incex always start with zero so we need reduce the lenght =>5 -> 0 1 2 3 4 (5)



        for (int i=str.length()-1;i>=0;i--){
            char c=str.charAt(i);
            switch (c){
                case '0':


                    System.out.print("zero ");
                    break;
                case '1':
                    System.out.print("One ");
                    break;
                case '2':
                    System.out.print("two ");
                    break;
                case '3':
                    System.out.print("three ");
                    break;
                case '4':
                    System.out.print("Four ");
                    break;
                case '5':
                    System.out.print("Five ");
                    break;
                case '6':
                    System.out.print("Six ");
                    break;
                case '7':
                    System.out.print("Seven ");
                    break;
                case '8':
                    System.out.print("eight ");
                    break;
                case '9':
                    System.out.print("Nine ");
                    break;
            }
        }
    }
}
