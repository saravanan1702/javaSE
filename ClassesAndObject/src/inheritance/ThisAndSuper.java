package inheritance;

class RectangelforConstructor {
    int length;
    int breadth;
    int x=10;

    RectangelforConstructor(int l, int b) {
        //to avoid name conflict we can use this keyword tell the java this is current clas object not constructor parameter
        this.length = l;
        this.breadth = b;
    }

    void display() {
        System.out.println("length is :" + this.length);
        System.out.println("Breadth is :" + this.breadth);
    }
}
//super
class Cuboidforsuper extends RectangelforConstructor{
    //for cuboid we would get length and breadth from parent class or super class
    //all we just need height of cuboid we don't need to create object for length and breadth
    int  height;
    int x=20;


    //super class constructor
    Cuboidforsuper(int l,int b,int h){
        //super() =>it is just like this keyword but it reference super class properties or methods
        super(l,b);//getting length and breath from super class
        this.height=h;//height for itself
    }
    void  dis(){
        System.out.println("Super class X value is :"+super.x);//10
        System.out.println("Current class(derived class) X values is :"+x);//20
    }
}
public class ThisAndSuper {
    public static void main(String[] args) {
        RectangelforConstructor r = new RectangelforConstructor(12, 2);
        r.display();
        System.out.println("\n");
        Cuboidforsuper cp=new Cuboidforsuper(12,3,3);
        cp.dis();
    }
}
