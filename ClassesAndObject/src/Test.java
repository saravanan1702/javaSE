import java.util.Scanner;

public class Test {
    static int add(int x,int y){
        return x+y;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The value 1");
        int a=sc.nextByte();
        System.out.println("Enter the value 2");
        int b=sc.nextByte();
        System.out.println("total is :"+add(a,b));
    }
}
