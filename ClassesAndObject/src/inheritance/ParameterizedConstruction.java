package inheritance;
class Super{
    Super(){
        System.out.println("Non - parameterized Constructor from super");
    }
    Super(int x){
        //assume value is 10;
        System.out.println("Parameterized Constructor from super :"+x);
    }
}
class Sub extends Super{
    Sub(){
        System.out.println("Non - paarameterized constructor from sub");
    }
    Sub(int y){
        System.out.println("Parameterized Constructor from Sub");
    }Sub(int x,int y){
        super(x);//we get value 10 with help of super keyword
        System.out.println("2 param of Constructor :"+y);
    }
}
//another example for deep understand use of parameterized construtor
class Rectable{
    int length;
    int breadth;
    Rectable(){
        length=breadth=1;
    }
    Rectable(int l,int b){
        this.length=l;
        this.breadth=b;
    }
}
class Cuboid extends Rectable{
    int height;
    Cuboid(){
        height=1;
    }
    Cuboid(int h){
        this.height=h;
    }
    Cuboid(int l,int b ,int h){
        //take length and breadth values from parent class
        super(l,b);//two values from parent
        this.height=h;//and one values from itself ,we give more values not only give one values
    }
    public  int volume(){
        return length*breadth*height;
    }
}
public class ParameterizedConstruction {
    public static void main(String[] args) {
//        Sub s=new Sub(12);
//        Sub s=new Sub(10,60);
        //10 from parent and 60 from child

        //create object for Rectangle
        Cuboid r=new Cuboid();//non paramterized called
        System.out.println("Volume of Cuboid is :"+r.volume()); //1
        Cuboid r2=new Cuboid(20); //length=breadth=1 * height=20=>20
        System.out.println("Volume of Cuboid is :"+r2.volume()); //20
        Cuboid c=new Cuboid(12,2,20);// for understanding (l=12)*(b=2)*(h=20)=>480
        System.out.println("Volume of Cuboid is :"+c.volume());//480

//        Rectable r1=new Cuboid(1);
    }
}
