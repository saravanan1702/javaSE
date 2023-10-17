package RelationAndOperators;

import java.util.Scanner;
//what is different between if else and switch case
//if else usually used for conditinal operators
//switch cases usually used for user pereference
//conpare to if else switch cases is very fast

public class SwitchCasesDemo {
    public static void main(String[] args) {
        String option;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Menu ");
        option=sc.nextLine();
        switch (option){
            case "Dosa":
                System.out.println("Morning Breakfast");
                break;
            case "Biriyani":
                System.out.println("AfterNoon Lunch");
                break;
            case "Chappathi":
                System.out.println("Night Dinner");
                break;
            default:
                System.out.println("invalid ");
        }
    }
}
