package staticandfinal;
class CoffeeMachine{
    private int coffeQty;
    private int waterQty;
    private int sugarQty;
    private int milkQty;

    //to create reference for coffee machine
    //hint
    //if we assign static we don't need to create reference of class
//    static private CoffeeMachine our=null;//can't accessble directly but indirectly accessble with static method
    //a private reference of coffe machine
    //now try to set limit usage
    static int count=0;
    private CoffeeMachine(){
        coffeQty=1;
        waterQty=1;
        sugarQty=1;
        milkQty=1;

    }

    void display(){
        System.out.println("coffe is making");
    }
    void fillcopy(int qty){
        coffeQty=qty;
    }
    void fillwater(int qty){
        waterQty=qty;
    }
     int getCoffee(){
        return 2;
    }
    static public CoffeeMachine getInstance(){
        if(count<5){
            count++;
            //create new  object only if coffe machine didn't already existing
//            our=new CoffeeMachine();
           return new CoffeeMachine();
        }else {

//        return our;
            return null;
        }
    }

}
public class SingletoneClass {
    public static void main(String[] args) {
        //we use static method so don'e need to create object
     CoffeeMachine c= CoffeeMachine.getInstance(),c1=CoffeeMachine.getInstance(),c3=CoffeeMachine.getInstance(),c4=CoffeeMachine.getInstance(),c5=CoffeeMachine.getInstance();
     c.display();
     c1.display();
//     c.fillcopy(12);
//     c.fillwater(10);
        System.out.println("Coffe "+c.getCoffee());
        if(c==c1 && c==c4){
            System.out.println("same"); //the reason all these three are refering to the same object
        }
        else {
            System.out.println("not same object");
        }
        CoffeeMachine c6=CoffeeMachine.getInstance();
    }
}
