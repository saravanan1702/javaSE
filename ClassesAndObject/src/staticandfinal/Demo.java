package staticandfinal;




public class Demo {
    //we can't assign final values later on it will give error
    //either assign with single line or assign method block
    //ex
   /* final int PI;
    PI=3.14f;*/ //not allowed in class instance
    //but allowed in class instance block
    //ex
    final int x; //allowed  in instance block
    {
        x=20;
        System.out.println("instance block "+x);
    }
    static final float F;
    static
    {
        F=20.4f;
        System.out.println("Static block :"+F);
    }


    public static void main(String[] args) {
        //inside method block it will allow we can initialize final variable then later on assign the value
//        final float PI;
//        PI=3.14f;
        System.out.println();//allowed

    }
}
