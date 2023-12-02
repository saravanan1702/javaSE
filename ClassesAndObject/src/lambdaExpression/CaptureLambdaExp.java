package lambdaExpression;
interface LambdaEx1{
    void display();
}
/*class Demo{
    void meth1(){
     final int count=0;//can't modify outside context
        //we can use this local variable in lambda and it must be final variable

        //Single statement so we don't need to enclose with bracket
        LambdaEx1 e=()->{
           *//* int count=0;//local variable of method
            //it allows to change the values also
            count++;*//*
            System.out.println("hello World!");
            System.out.println("Good Bye!"+count);
        };
        e.display();

    }

}*/

//Passing Lambda Expression as parameter
class UseLambda{
    public void callLambda(LambdaEx1 l){
        l.display();

    }

}
class MyDemo{
    void method1(){
        UseLambda ul=new UseLambda();
        ul.callLambda(()->{System.out.println("Hello");});
    }
}
public class CaptureLambdaExp {
    public static void main(String[] args) {
     MyDemo d=new MyDemo();
     d.method1();
    }
}
