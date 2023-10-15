class Circle {
    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        //MATh.PI =>is inbuild  predefined constant values that's available in java.util.lang pacakge
        return 2 * Math.PI * radius;
    }

    public double circumference() {
        //same formula for circumference so we return perimeter function(method)
        return perimeter();
    }
}

public class Circle1 {
    public static void main(String[] args) {
        //1.create object for circle
        Circle c1 = new Circle();
        //2.Assign values for circle properites
        c1.radius = 5;
        //3.Call the method(function)
        System.out.println("Area :" + c1.area());
        System.out.println("perimeter :" + c1.perimeter());
        System.out.println("circumference :" + c1.circumference());
        System.out.println("------------------------");
        Circle c2 = new Circle();
        c2.radius = 3;
        System.out.println("Area :" + c2.area());
        System.out.println("perimeter :" + c2.perimeter());
        System.out.println("circumference :" + c2.circumference());

    }
}
