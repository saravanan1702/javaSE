package constructorinJava;

class Cylinder {
    private double radius;
    private double height;

    //getter and setter method to assign priavate values
    double getRadius() {
        return radius;
    }

    double getHeight() {
        return height;
    }

    public void setRadius(double r) {
        //validation check
        if (r > 0) {
            radius = r;
        } else {
            radius = 0;
        }
    }

    public void setHeight(double h) {
        if (h > 0) {
            height = h;
        } else {
            height = 0;
        }

    }

    //creating constructor for class
    Cylinder(double x, double y) {
        setRadius(x); //x for length
        setHeight(y);//y for breadth
    }

    public double lidarea() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public double total_surface() {
        return 2 * lidarea() + circumference() * height;
    }

    public double volume() {
        return lidarea() * height;
    }
}

public class StudentChallange_CylinderTask {
    public static void main(String[] args) {
        //create object for class
        Cylinder c=new Cylinder(12,3);//give values in while creaate object
        System.out.printf("Lid Area :%.2f \n",c.lidarea());
        System.out.printf("Total surface :%.2f \n",c.total_surface());
        System.out.printf("Circumference :%.4f \n",c.circumference());
        System.out.printf("Volume :%.4f \n",c.volume());

    }
}
