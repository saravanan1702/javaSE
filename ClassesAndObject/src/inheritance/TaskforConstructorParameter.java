package inheritance;

class School {
    String SchoolName;
    int BatchNo;

    School(String schoolName, int batchNo) {
        this.SchoolName = schoolName;
        this.BatchNo = batchNo;
    }


}
class Student extends School{
    int rollNo;
    String name;
    String Course;
    Student(String schoolName,int batchNo, int rollNo,String name,String course){
        super(schoolName,batchNo);//getting two values from School class(parent)
        this.rollNo=rollNo;
        this.name=name;
        this.Course=course;
    }
    //printing details
    String details(){
        System.out.println("School Name :"+SchoolName);
        System.out.println("Batch No :"+BatchNo);
        System.out.println("Student Name :"+name);
        System.out.println("Roll NO :"+rollNo);
        System.out.println("Courses :"+Course);
        return "";//bcas we print multiple line we can't return multiple line, so just return nothing but will return everything we print
    }

}

public class TaskforConstructorParameter {
    public static void main(String[] args) {
        //creating object for student
        Student std=new Student("Kajamiam",12,102565,"Saravanan","ComputerScience");
        std.details();//actually we put it on println method because it has return type
        //since we did everything details method so we don't need to put it on println
        //let's try in Array of Object
        //give little bit gap
        System.out.println("\n");
        Student[]st=new Student[3];
        st[0]=new Student("abcSchool",10,10045,"Jasmine","ComputerScience");
        st[1]=new Student("xyzSchool",25,102568,"Santhosh","PureScience");
        st[2]=new Student("zyxSchool",1,25864,"allwin","IT");
        st[0].details();
        System.out.println("\n");
        st[1].details();
        System.out.println("\n");
        st[2].details();
    }
}
