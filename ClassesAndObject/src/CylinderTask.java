import java.util.Scanner;

class Cylinder {
    //properties
    public double radius;
    public double height;

    //methods
    public double lidarea() {
        //lid area mean=>top and bottom circle
        return Math.PI * radius * radius;
    }

    public double total_surface() {
        //total_surface mean=>entire drum (circle and height)
//        return 2*Math.PI*radius*(radius+height);
        return 2 * lidarea() + circumference() * height;

    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public double volume() {
        return lidarea() * height;

    }
}

public class CylinderTask {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Radius :");
        cy.radius = sc.nextDouble();
        System.out.println("Enter The Height :");
        cy.height = sc.nextDouble();

        //to reduce extra values from after . in double use this trick(method)
        //use printf statement then "give content then (%.2f)=> we can give not only 2  we can give how many values want
        // we want after .3 or 4 anything you want in order to look neat and understand"
        System.out.printf("lid area : %.2f",cy.lidarea());
        System.out.println();
        System.out.printf("Total Area  :%.2f", cy.total_surface());
        System.out.println();
        System.out.printf("Circumference :%.4f", cy.circumference());
        System.out.println();
        System.out.printf("Volume :%.4f" , cy.volume());


    }
}
