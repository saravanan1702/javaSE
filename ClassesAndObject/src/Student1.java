import java.util.Scanner;

class StudentTask {
    //properties
    int roll_no;
    String name;
    String course;
    int m1;
    int m2;
    int m3;

    //methods
    public int total() {
        return m1 + m2 + m3;
    }

    public float average() {
        return (float) (int) total() / 3;
    }

    public String grade() {
        if (total() >= 70) {
            return ("A Grade");
        } else if (total() > 60 && total() < 69) {
            return ("B Grade");

        } else if (total() > 50 && total() < 59) {
            return ("C grade");
        } else if (total() > 40 && total() < 40) {
            return ("D Grade");

        } else {
            return ("Fail ");
        }
    }

}

public class Student1 {
    public static void main(String[] args) {
        StudentTask st = new StudentTask();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Roll No :");
        st.roll_no = sc.nextInt();
        System.out.println("Enter The Name :");
        st.name = sc.next();
        System.out.println("Enter the Course :");
        st.course = sc.next();
        System.out.println("Enter 3 Marsk of the student :");
        st.m1 = sc.nextInt();
        st.m2 = sc.nextInt();
        st.m3 = sc.nextInt();
        System.out.println("Total Mark is :" + st.total());
        System.out.println("Average    is :" + st.average());
        System.out.println("Grade of the Student :" + st.grade());

    }
}
