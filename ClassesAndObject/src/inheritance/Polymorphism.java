package inheritance;
//method overloading methods names are sames but inside the parameter differents
class MethodOverloading{
    public  int max(int x,int y){
        return x>y?x:y;
    }
    public int max(int a,int b,int c){
        if(a>b && a>c){
            return a;
        }
        else if(b>c && b>a){
            return b;
        }
        return c;
    }

}
//method overriding
//base class methods names must be derived class methods then only it's override or it will overloading

class A{
    void  display(){
        System.out.println("parent class method");
    }

}
class  B extends A{
    void display(){
        System.out.println("Child class method");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
       //we can achieve this polymorphism with help of Method overloading and method overriding
       //poly=>means many
       //morphism=>mean farms,
       //same name .but different actions
        MethodOverloading m=new MethodOverloading();
        //compiler will decide which method would be called that why method overloading called compile time polymorphism
        //if we pass two paramter methods it will call two paramter methods called
        //if we pass three paramter arguments method the compiler will call three arguments method called
        System.out.println("Max Number is :"+m.max(12,3));
        System.out.println("Max number is :"+m.max(12,3,50));
        System.out.println("\n");


        //though the methods names are same, but it will override from parent class
        //the functionality are different,when we re-define parant methods inside child class
        //parent methods will be shadowed

        A a=new B();//new mean the object will be created in RUN TIME
        //it has decided to be in run time,compiler can't decide that 
        a.display();
        //why child class method called,we know methods always deponds on object not for reference
        //though the reference denoting parent class but object called only in subclass
        //the object call only know in running time which object is calling
        //that's why it's runtime polymorphism

    }
}
