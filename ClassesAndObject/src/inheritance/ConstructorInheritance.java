package inheritance;
class Parent{
    Parent(int a,int b){
        System.out.println("Total is :"+(a+b));
        System.out.println("Parent class Constructor");
    }
    void carry(){
        System.out.println("Carrying children");
    }
}
class Child extends Parent{
        Child(int a,int b){
           super(a,b);
            System.out.println("Total is :"+(a+b));
        System.out.println("Child class Constructor");
    }
    void playful(){
            super.carry();
        System.out.println("Playing Cricket");
    }
}
class Grandchild extends Child{
    Grandchild(int a,int b){
        super(a,b);
        System.out.println("Total is :"+(a*b));
        System.out.println("Grandchild constructor");
    }
    void play(){
        super.playful();
        System.out.println("Playing indoor and outdoor games");
    }
}
public class ConstructorInheritance {
    public static void main(String[] args) {
//        Child c=new Child(2,10);
        //1st called parent and second called child(always Priorty for parent class)
//        c.carry();
//        c.playful();
//        System.out.println();

        Grandchild child =new Grandchild(10,10);//1parent   //2nd child class 3//actual grand child class
        child.play();

    }
}
