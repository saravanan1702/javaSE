package RelationAndOperators;

import java.util.Scanner;

public class RadixNumber {
    public static void main(String[] args) {
        //find the number is radix or not
        //binaray number =01  2 byte
        //Octal number =0-7 // 8bytes
        // hexaDecimal =0-9 A-f //16 bytes
        //decimal number =0-9 //10 bytes

        System.out.println("Enter The Number to find radix Number :");
        Scanner sc=new Scanner(System.in);
        String number=sc.nextLine();
        if(number.matches("[01]+")){
            System.out.println("Binary Radix number =2");
        } else if (number.matches("[0-7]+")) {
            System.out.println("Octal radix number =8");

        } else if (number.matches("[0-9A-F]+")) {
            System.out.println("HexaDecimal radix =16");

        } else if (number.matches("[0-9]+")) {
            System.out.println("Decimal number Radix =10");
        }else {
            System.out.println("none of then radix");
        }
    }
}
