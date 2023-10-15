import java.util.Scanner;

class Bank {
    //properties
    String acc_holder_name;
    long acc_no;
    double balance;
    long ph_no;
    String email;


    //method
    public void withdraw(double amnt) {
        if (balance >= amnt) {
            balance -= amnt;
            System.out.println("Withdraw Successfull,your current balance is :" + balance);

        } else {
            System.out.println("Insufficent balance .can't withdraw money");
        }


    }

    public void deposite(double amt) {
        balance += amt;
        System.out.println("Deposite successfull,Your current balance is :" + balance);
    }

    //    public void acc_details(){
//        System.out.println("Holder Name :"+acc_holder_name);
//        System.out.println("Accound No  :"+acc_no);
//        System.out.println("Phone No    :"+ph_no);
//        System.out.println("Email ID    :"+email);
//        System.out.println("Bank Balance:"+balance);
//    }
    //if we want to print object itself, then we use tostring method
    //we want to implement toString method to print the details that we given
    public String toString() {
        return ("Account Holder Name :" + acc_holder_name + "\n" + "Account No :" + acc_no + "\n" + "Phone No :" + ph_no + "\n" + "Email Id :" + email + "\n" + "Account Balance :" + balance);
    }
}

public class BankTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank b = new Bank();
        System.out.println("Enter The Name :");
        b.acc_holder_name = sc.next();
        System.out.println("Enter The Accound Number :");
        b.acc_no = sc.nextLong();
        System.out.println("Enter The Phone No :");
        b.ph_no = sc.nextLong();
        System.out.println("Enter The Bal :");
        b.balance = sc.nextDouble();
        System.out.println("Enter The Email ID :");
        b.email = sc.next();
        System.out.println("Enter The Depasite amt :");
        double depasite = sc.nextDouble();
        b.deposite(depasite);
        System.out.println("Enter The Withdraw amt :");
        double withdraw = sc.nextDouble();
        b.withdraw(withdraw);
        //calling toString method to print Details
        //printing object itself we don't need create any object
        //like b.email b.balance
        System.out.println("details:\n"+b);


    }
}
