package lambdaExpression;
@FunctionalInterface //interface having only one method then it's called functional interface it can  help to Achieve lambda expression
interface LambdaExp{
//    void display(String str);
    //method can take multiple parameter
    int add(int x,int y);
}
public class Parameterlambda {
    public static void main(String[] args) {
        //lambda expression knwo what kind of parameter because there's only one method in interface
       /* LambdaExp e=(s)->{
            System.out.println(s);
        };*/
       /* LambdaExp e=(a,b)->{
            return a+b; //we don't need to tell return lambda return automatically
        };*/
        //we don't need to write return statement if interface is return method then lambda also automatically return the values wer don't need to write explicitely
        LambdaExp e=(a,b)->a+b;
//        e.display("Hello World!");
        int total=e.add(12,3);
        System.out.println("Total :"+total);
    }
}
