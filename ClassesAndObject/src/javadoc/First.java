package javadoc;
/*class Anno{
    public void display(){
        System.out.println("Hello");
    }
}
class Tation extends Anno{

    //i give method name mistakely i did it intentionaly for example
    //the compiler think okei it not override method it's separate method but class parent class has been abstract it would give error tell them to override
    //but the parent class is normal class so we must override the method if override method has some minute changes in method name it will seprate method not parent class method name
    //in this suitvation we use @override annotation for get hint by compiler it will be tell them it's not parent class method name
    @Override//if we made any mistake while override it will tell us to what we made mistake while override
    public void display(){
        System.out.println("Hi");
    }
}*/
/*class DemoAnno{
    public  void display(){
        System.out.println("hello");
    }


    @Deprecated //this mean if we want to remove this method in future and tell them to don't use this method in our project it's going to be removed from project
    //just give hint to pragammer who wrote this method in own project
    //Deprecated annotation tell programmer to not use this method
    public void show(){
        System.out.println("hi");
    }
}*/

//generic
/*class My<T>{

    //Generic Type arguments ,variable arguments which is generic type
    //variable arguments which are generic it may not safe
    //it won't work for every type


    @SafeVarargs
    private void show(T... arg){
        for(T x:arg){
            System.out.println(x);
        }
    }
}*/
@FunctionalInterface //Functional interface =>interface have only one method ,if interface having only one single method
    //so it can be used for defining lambda expressions.
    //for Lambda expression interface must have only one single method in interface
    //if interface having only single method this called functional interface
    //If we use @functional interface it won't allow to write more than one method in interface
interface Myclass{
    public  void display();
//    public  void show();//show warning
}
public class First {

    @SuppressWarnings("deprication")//SuppressWarning if we are any deprecated method  and and tell compiler to  don't show any error
    //we don't want to those error in our compiler we know that it's error but i want to use it so don't show any error in my program
    public static void main(String[] args) {
     /*   DemoAnno d=new DemoAnno();
        d.display();
        d.show();//this will show strick in compiler while we call this method*/

    }
}
