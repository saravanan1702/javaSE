package staticandfinal;

import java.util.Date;

class Student{
    //rollno generated itself
    private String RollNo;
    private String name;
    private String Department;
    private static int count=1;
    private String assignRollNo(){
        Date d=new Date();
        String aro="Univ-"+(d.getYear()+1900)+"-"+count;
        count++;
        return aro;
    }
    Student(){
        RollNo=assignRollNo();
    }
    String getRollNo(){
        return RollNo;
    }
    String getName(){
        return name;
    }
    void setName(String n){
        name=n;
    }
    String getDepartment(){
        return Department;
    }
    void setDepartment(String dpt){
        Department=dpt;
    }
    void studentDetails(){
        System.out.println("name :"+name);
        System.out.println("Department :"+Department);
        System.out.println("RollNo :"+RollNo);
    }

}
class Account{
    private String Accno;
    private String name;
    private  static int count=1;
    private String assignAccno(){
        Date d=new Date();
        String ac="IOB"+(d.getYear()+1900)+count;
        count++;
        return ac;
    }
    Account(){
        Accno=assignAccno();
    }
    String getName(){
        return name;
    }
    void setName(String name){
        this.name=name;
    }
    void display(){
        System.out.println("Name :"+name);
        System.out.println("AccountNO :"+Accno);
    }
}
public class StudentChallange {
    public static void main(String[] args) {
     Student s1=new Student(),s2=new Student(),s3=new Student();
     s1.setName("saravanan");
     s1.setDepartment("civil");
     s1.studentDetails();
     s2.setName("Jasmine");
     s2.setDepartment("Ece");
     s2.studentDetails();
//     Accounts
        Account ac=new Account(),ac1=new Account(),a3=new Account();
        ac.setName("Jasmine");
        ac.display();
        a3.setName("saravanan");
        a3.display();
        ac.display();
        ac1.display();




    }
}
