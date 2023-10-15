import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    String course;
    int year;
    int marks;

    Student(int rollNo, String name, String course, int year, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
        this.year = year;
        System.out.println("Name is :"+name+" RollNo is :"+rollNo+" courses is :"+course+" year is :"+year+" marsk is :"+marks);
    }

    public void total() {
        int mar1, mar2, mar3;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter The Marks :");
        mar1 = sc.nextInt();
        mar2 = sc.nextInt();
        mar3 = sc.nextInt();
        int total_marks = mar1 + mar2 + mar3;
        System.out.println("total Marks of the Student :" + total_marks);
        float avg = (float) total_marks / 3;
        System.out.println("Average :" + avg);

    }

}

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student(12, "Saravanan", "java", 2023, 98);
        s.total();


    }
}
