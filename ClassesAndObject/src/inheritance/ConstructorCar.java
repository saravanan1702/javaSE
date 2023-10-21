package inheritance;

class Car {
    Car(String engine) {
        System.out.println( "engine type is :"+engine );
    }

    public void varient() {
        System.out.println("this is hatchbag design");
    }

    void drive() {
        System.out.println("rear wheel drive");
    }

    void gearbox() {
        System.out.println("Manual Gear with 5 speed");
    }
}

class Swift extends Car {
    String color;
    String model_name;

    Swift(String engine, String color, String md) {
        super(engine);
        this.color = color;
        this.model_name = md;
        System.out.println("model :"+md);
        System.out.println("Model color :"+color);

    }
    void overview(){
        super.varient();
        super.gearbox();
        super.drive();
        System.out.println("new Iconic Aeromatic design with chrome finish");
    }
    void features(){
        System.out.println("360 degree Camera ");
        System.out.println("auto parking Censor");
        System.out.println("Safety alaram");
        System.out.println("increase fuel capacity and high milage");
    }
}
class Dezire extends Swift{
    String gear_model;
    Dezire(String engine,String col,String model,String gear){
        super(engine,model,col);
        this.gear_model=gear;
        System.out.println("Gear Type :"+gear);

    }
    void feature1(){
        super.features();
        super.overview();
        System.out.println("Long body with comfort ");
    }
}
public class ConstructorCar {
    public static void main(String[] args) {
     Dezire d=new Dezire("v4","sedan","black","automatic");
     d.feature1();
    }
}
