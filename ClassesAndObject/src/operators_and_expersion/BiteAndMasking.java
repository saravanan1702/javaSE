package operators_and_expersion.udemy;

public class BiteAndMasking {
    public static void main(String[] args) {
        int a=10;
        int b=12;
        System.out.print("Before Swaping :"+" A :"+a +" B :"+ b);
        System.out.println();

        a=a^b;
        b=a^b;
        a=a^b;

//        System.out.println(a);
//        System.out.println(b);
        System.out.println("After Swaping :"+" A :"+a+" B :"+b);
        System.out.println("A :"+a+" and "+"B :"+b+" is :"+(a+b));
    }
}
