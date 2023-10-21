package inheritance;
class OldTv{
    public void switchON(){
        System.out.println("Switch is on ");
    }
    void switchOFF(){
        System.out.println("Switch is off");
    }
}
class ModernTv extends OldTv{
    public void switchON(){
        System.out.println("you can swith on the tv with remote");
    }
    void switchOFF(){
        System.out.println("you can Switch off the tv with remote");
    }
}
public class MethodOverridingExample1 {
    public static void main(String[] args) {
//        METHOD OVERRIDING
      /*Though the derived class methods name also as same as super class methods's name,
      * but the functionality is totaly different super class method will override if we give same methods name
      * in derived class*/
        ModernTv mtv=new ModernTv();
        mtv.switchON();
        mtv.switchOFF();
        //moderntv object both of them will be called only object of the class created not parent class,parent
        //class object would override while we called derived class's methods
    }
}
