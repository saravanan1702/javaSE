package lambdaExpression;
//if interface have only one single method it's called functional Interface
interface Mylambda{
    void display();
}
public class Ilambda {
    public static void main(String[] args) {
        Mylambda m=()->{
            System.out.println("Hello World!");
        };
        m.display();


    }
}
