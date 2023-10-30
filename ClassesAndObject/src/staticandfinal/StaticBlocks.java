package staticandfinal;
class My
{
    static int a;
    static int b;
    static  String name="saravanan";
    static  int age=23;

   //static blocks execute while class loaded it's useful for intialize static variable
    //and static methods whatever the we print in first but static block will execute first then execute norma methods
    static
    {
        a=10;
        b=20;
        System.out.println("Addition of two Number is :"+(a+b));
    }
    static int sub(int a,int b){
        return a-b;
    }
    static void info(){
        System.out.println("name :"+name);
        System.out.println("age :"+23);
    }
    static
    {
        System.out.println("sub of two number is :"+sub(14,2));//static method
        System.out.println("block 2");
        info();
    }
    static
    {

        System.out.println("block 3");
    }
}
public class StaticBlocks {
    public static void main(String[] args) {
        My o=new My();
        System.out.println("main block"); //it will print lastly when all the static blocks execute then only class inside files execute

    }
}
