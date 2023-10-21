package inheritance;
class Circle{
    public double radius;
    double area(){
        return Math.PI*radius*radius;
    }
    double perimeter(){
        return 2*Math.PI*radius;
    }
}
class Cylider extends Circle{
    public  double height;
    double volume(){
        return area()*height;//using circle method
    }
}
public class circleTask {
    public static void main(String[] args) {
        Cylider c=new Cylider();
        c.height=12;
        c.radius=10;
        System.out.printf("The volume is : %.2f \n", c.volume());
        System.out.printf("The Area of Cylinder :%.3f \n",c.area());
        System.out.printf("The Perimeter of Cylinder :%.3f \n",c.perimeter());

    }
}
