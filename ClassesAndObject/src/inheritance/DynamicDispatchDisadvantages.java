package inheritance;
class BaseClass{
    public  void swicthON(){
        System.out.println("Tv is on  base class");
    }
   public void  switchoff(){
        System.out.println("tv is off base class");
    }
}
class DerivedClass extends BaseClass{
    public  void switchon(){
        System.out.println("Tv is on ");
    }
    public void swtichoff(){
        System.out.println("Tv is off");
    }
    public void broswer(){
        System.out.println("you can browser");
    }
}
public class DynamicDispatchDisadvantages {
    public static void main(String[] args) {
       //creating base class reference with derived class object
      /* BaseClass b=new DerivedClass();
       b.swicthON();
       b.switchoff();*/
//       b.broser(); it won't show you method because there's no method for in this name in baseclass
        //when we create reference for baseclass it assume that derived class also have feauture for derived class
        //that's why we can't create object for derived classs

        DerivedClass d=new DerivedClass();
        d.broswer();
        d.switchon();
        d.swtichoff();
    }
}
