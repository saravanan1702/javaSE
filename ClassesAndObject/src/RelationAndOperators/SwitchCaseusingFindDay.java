package RelationAndOperators;

import java.util.Scanner;

public class SwitchCaseusingFindDay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Day :");
        byte day= sc.nextByte();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Thusday");
                break;
            case 3:
                System.out.println("WednesDay");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday ");
                break;
            case 7:
                System.out.println("SundaY");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
}
