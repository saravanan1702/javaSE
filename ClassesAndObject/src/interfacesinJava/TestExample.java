package interfacesinJava;

import java.util.Scanner;

//interfaces like abstract classes but we can use interface in order to achieve 100% polymorphism
//but abstact class we forced to override the method and abstract classes may have abstract method and non abstract method
//moreover we can only one class to extend
//but intefaces we can implement(extend) multiple interfaces(class)
interface Test1 {
    //why we didn't give abstract prefix,Interface only have abstract method
    //that's why we don't need to give any prefix
    void add();

    void mul();
}

class Test2 implements Test1 {

    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The a and b :");
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int total = a + b;
        System.out.println("total is :" + total);
    }

    public void mul() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The a and b :");
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int mul = a * b;
        System.out.println("multiple :" + mul);
    }

    public void div() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The a and b :");
        float a, b;
        a = sc.nextFloat();
        b = sc.nextFloat();
        float div = a / b;
        System.out.println("division :" + div);
    }
}

class Test3 extends Test2 {
    @Override
    public void mul() {
        System.out.println("this is division");
    }

    public void add() {
        System.out.println("this is add"
        );
    }

    public void div() {
        System.out.println("this is mul");
    }
}

public class TestExample {
    public static void main(String[] args) {
        Test2 t = new Test2();
        t.add();
        t.div();
        t.mul();
        Test3 test=new Test3();
        test.add();
        test.div();
        test.div();
    }
}
