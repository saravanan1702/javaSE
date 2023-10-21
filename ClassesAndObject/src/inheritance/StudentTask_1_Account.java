package inheritance;

import java.util.Scanner;

class Account {
    private String name;
    private String AccNo;
    private String PhoneNo;
    private String Address;
    private String email;
    private String dob;
    private double balance;

    Account(String n, String accno, String ph, String dob, String add, String email, double bal) {
        this.AccNo = accno;
        this.name = n;
        setDob(dob);
        setEmail(email);
        setPhoneNo(ph);
        setAddress(add);
        setBalance(bal);
        this.balance=bal;


    }

    //read only properties
    String getName() {
        return name;
    }

    String getAccNo() {
        return AccNo;
    }

    //read and write properties
    String getAddress() {
        return Address;
    }

    void setAddress(String address) {
        Address = address;
    }

    String getPhoneNo() {
        return PhoneNo;
    }

    void setPhoneNo(String ph) {
        PhoneNo = ph;
    }

    String getEmail() {
        return email;
    }

    void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void Details() {
        System.out.println("Account No :" + AccNo);
        System.out.println("Name of Holder :" + name);
        System.out.println("Address :" + Address);
        System.out.println("Phone No :" + PhoneNo);
        System.out.println("Dob :" + dob);
        System.out.println("Balance :" + balance);
    }

    public void closeAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Reason For Closing :");
        String reason = sc.next();
        System.out.println("Reason :" + reason);
        System.out.println("Account will be closed....thank you :)");
    }


}

class SavingAccount extends Account {
    SavingAccount(String n, String accno, String ph, String dob, String add, String email, double bal) {
        super(n, accno, ph, dob, add, email, bal);
    }

    //method
    void depasite() {
        Scanner sc = new Scanner(System.in);
        double amt = sc.nextDouble();
        double total_amt = getBalance()+ amt;
        System.out.println("balance is :" + total_amt);
    }

    void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Amount You want to Withdraw (Note : you want withdraw only 100 and 500 )");
        double bal = sc.nextDouble();
        double amt = getBalance() - bal;

        System.out.println("Balance is :" + amt);
    }

    void fixedDepasite() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Amount :");
        double amt = sc.nextDouble();
        System.out.println("Enter The Interest of your Bank :");
        float interest = sc.nextFloat();
        System.out.println("Enter The Duration :");
        int duration = sc.nextInt();
        double FD = (amt * interest * duration) / 100;
        System.out.println("Interest is :" + FD);
    }

}

class LoanAcc extends Account {


    LoanAcc(String n, String accno, String ph, String dob, String add, String email, double bal) {
        super(n, accno, ph, dob, add, email, bal);
    }

    void payemi() {
        System.out.println("emi paying");
    }

    void topUPLoan() {
        System.out.println("topupLoan");
    }

    void rapayment() {
        System.out.println("repayment");
    }
}

public class StudentTask_1_Account {
    public static void main(String[] args) {
        SavingAccount saving = new SavingAccount("Jasmine", "102545834", "9095791516", "02/3/200", "Trichy", "jas@gamil.com", 10000);
        saving.Details();
        saving.depasite();
        saving.withdraw();
        saving.fixedDepasite();
        LoanAcc la=new LoanAcc("Saravanan","1004875","9894092200","17/12/2001","Chennai","saravanan@gami.in",40000);
        la.Details();

    }
}
