package looping_statements;

import java.util.Scanner;

public class DaysPrintUsingswitchStatement {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Day you want to print");
        String days=sc.nextLine();

        switch (days){
            case "Monday":
                System.out.println("Today is monday");
                break;//if don't give break it will print next statement aswell it mean fall throw
            case "Thusday":
                System.out.println("Today is Thusday ");
                break;
            case "Wednesday":
                System.out.println("Today is WednesDay");
                break;
            case "Thursday":
                System.out.println("Today is Thurday");
                break;
            case "Friday":
                System.out.println("Today is Friday");
                break;
            case "Saturday":
                System.out.println("Today is Saturday");
                break;
            case "Sunday":
                System.out.println("Today is sunday");
                break;
            default:
                System.out.println("Neither of them Not valid out put");
        }
    }
}
