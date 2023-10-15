package constructorinJava;

import java.util.Scanner;

class Subject {
    private String subID;
    private String subName;
    private int maxMark;
    private int markObtain;

    public Subject(String subid, String name, int max) {
        //this mean using for refer current object compiler get confuse if we give
        //constructor parameter values and class instant properties names both are same
        //we empazise that to tell compiler (this is current property of class)
        //sometimes we don't need to tell the compiler both are different if constructor parameter are different
        this.subID = subid;//refer current object of the class
        this.subName = name;
        setMaxMark(max);
    }

    //Read Only Properties definetly subid and subname because we can't change the id and name
    //getter method for SubId and SubName
    String getSubID() {
        return subID;
    }

    String getSubName() {
        return subName;
    }

    //read and write properties that we can change values often
    //getter->read
    int getMaxMark() {
        return maxMark;
    }

    // setter->write
    void setMaxMark(int maxmark) {
        maxMark = maxmark;

    }

    int getMarkObtain(int markobtn) {
        return markObtain;
    }

    void setMarkObtain(int markobtn) {
        markObtain = markobtn;


    }

    boolean isQualified(int mark) {
        return mark >= maxMark / 10 * 4;//(40%) of marks
        //             100/40;
    }

    //printing all the details using ToString
    public String toString() {
        return ("SubId :" + subID + "\n" + "SubName :" + subName + "\n" + "MaxMark :" + maxMark);
    }

}

class StudentArray {
    private int rollno;
    private String name;
    private String dept;
    private Subject[] subjects;

    StudentArray(int rollno, String name, String dept) {
        this.rollno = rollno;
        this.name = name;
        this.dept = dept;
        subjects = new Subject[0];
    }

    StudentArray(int rollno, String name, String dept, Subject[] subjects) {
        this.rollno = rollno;
        this.name = name;
        this.dept = dept;
        setSubjects(subjects);//subject class that we already created
    }

    //read only property like roll no ,names,departments
    int getRollno() {
        return rollno;
    }

    String getName() {
        return name;
    }

    String getDept() {
        return dept;
    }
    //read and write property like marks or subjects


    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject... s) {
        subjects = new Subject[s.length];
        for (int i = 0; i < s.length; i++) {
            subjects[i] = s[i];
        }
    }

    @Override
    public String toString() {
        System.out.println("Student Details :");
        System.out.println("Roll No:" + rollno + "\n" + "Name :" + name +"\n"+ "Department :" + dept);
        if (subjects.length == 0) {
            System.out.println("No Subjects");
        } else {
            for (Subject s : subjects) {
                System.out.println(s);
            }
        }
        return " ";
    }
}

public class ArrayOfObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* Subject subs[] =new Subject[3];
        subs[0]=new Subject("1023Ad","Java",100);
        System.out.println(subs[0].toString());
        System.out.println(subs[0].isQualified(35));
        subs[1]=new Subject("123FD","Python",100);
        System.out.println(subs[1].toString());
        System.out.println(subs[1].isQualified(20));
        subs[2]=new Subject("12HG3","JavaScript",100);
        System.out.println(subs[2].toString());
        System.out.println(subs[2].isQualified(40));*/


        //-------------SUBJECT--------------------
        //let's try in userinput
   /*     System.out.println("Enter The Number to create array of object :");
        int n = sc.nextInt();
        //create array of object
        Subject subs[] = new Subject[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter The subId :");
            String subid = sc.next();
            System.out.println("Enter The name :");
            String name = sc.next();
            System.out.println("Enter The Max Mark :");
            int max = sc.nextInt();
            subs[i] = new Subject(subid, name, max);


        }*/
//        System.out.println(subs[0].toString());
        //try to get all marks
        //using for loop is best choice for printing all the subs
//        for (int i = 0; i < n; i++) {
//            System.out.println(subs[i].toString());
//            System.out.println("--------------------------------");
//            System.out.println("Enter the Mark that Student Obtain :");
//            int markobtn = sc.nextInt();
//            System.out.println("is student Qualifed:" + subs[i].isQualified(markobtn));
//            System.out.println("------------------------------------");
//        }
        //just printing all the information throw for each loop
//        for (Subject x : subs) {
//            System.out.println(x);
//        }
        //---------------STUDENT-------------------
//        StudentArray sa=new StudentArray(1,"saravanan","Civil");
//        System.out.println(sa);
//        StudentArray sa1=new StudentArray(2,"Jasmine","ECE");
//        System.out.println(sa1);
        //to crete subject
        Subject[] subs1=new Subject[2];
        subs1[0]=new Subject("12","Python",100);
        subs1[1]=new Subject("13","Java",100);
        for(Subject x:subs1){
            System.out.println(x);
        }
        StudentArray sa2=new StudentArray(12,"Saravanan","civil",subs1);
        System.out.println(sa2);


    }
}
