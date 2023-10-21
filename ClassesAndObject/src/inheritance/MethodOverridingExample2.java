package inheritance;
class BasicCarBlueprint{
   public void enginetype(){
        System.out.println("v4 engine");
    }
    void breakingSystem(){
        System.out.println("Disc Break ");
    }
    void fuelCapacity(){
        System.out.println("100liter");
    }
    void gearSystem(){
        System.out.println("manual Gear ");
    }

}
class Basiccar extends BasicCarBlueprint{

   public void enginetype(){
        System.out.println("v4 engine");
    }
    void breakingSystem() {
        System.out.println("Disc break");
    }
    void fuelCapacity(){
        System.out.println("100 liter");
    }
    void gearSystem(){
        System.out.println("Manual gear");
    }
}
class AdvanceCarBlueprint extends BasicCarBlueprint{
    @Override
    void breakingSystem() {
        System.out.println("ABS Break");
    }
    void gearSystem(){
        System.out.println("Automatic gear");
    }
    void fuelCapacity(){
        System.out.println("120 liter");
    }
    void autioSystem(){
        System.out.println("JBL Advance sound system");
    }
    void feature(){
        System.out.println("6 airbag");
    }
}
class LuxuryCar extends AdvanceCarBlueprint{
    @Override
    void autioSystem() {
        System.out.println("Jbl audio system");
    }
    void gearSystem(){
        System.out.println("Amt gear box");
    }
    void feature(){
        System.out.println("6 air bags");
    }
}
public class MethodOverridingExample2 {
    public static void main(String[] args) {
      Basiccar b=new Basiccar();
      b.breakingSystem();
      b.enginetype();
      b.fuelCapacity();
      b.gearSystem();
        System.out.println("\n");
      LuxuryCar c=new LuxuryCar();
      c.autioSystem();
      c.feature();
      c.gearSystem();
      c.breakingSystem();

    }
}
