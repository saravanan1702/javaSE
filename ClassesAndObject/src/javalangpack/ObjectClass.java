package javalangpack;
class  Myclass{
    @Override
    public String toString() {//override toString
        return "hello";
    }
    //we can override hascode method
    public  int hascode(){
        return 100;
    }
    public boolean equals(Object o){
        return this.hashCode()==o.hashCode();
    }
}
class Demo extends Myclass{

}
public class ObjectClass {
    public static void main(String[] args) {
        //Object is parent class for every classes in java
        //Object is directly or indirectly inherite every classes from the Object class
        Object o1=new Object();
        Object o2=new Object();
        Object o3=o2;//o3 object hold o2 object
        Myclass m= new Myclass();
        Myclass mc=new Myclass();
        Demo m1=new Demo();
        //example for every object directly or indirectly inherite from object
//        m1.toString();
//        m1.equals()
//        m.equals();
//        m.hashCode();

        System.out.println(o1);//this is called toString method
        System.out.println(o1.equals(o2));//false object is same but reference are different
        System.out.println(o3.equals(o2));//true both are refer same object
        //every object has unique object code if we want to print use hashcode method,we can change the code but we are responsible for the code it will change all the object as same code if we modify
        System.out.println(o1.hashCode());//give address of the object
        //note java provide unique address for every objectd
        System.out.println(m.hascode());//100
        System.out.println(m.equals(mc));//false

    }
}
