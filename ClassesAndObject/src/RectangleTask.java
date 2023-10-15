import java.util.Scanner;

class Rectangle {
    public int length;
    public int breadth;

    public void area() {
        //int=>if we give method type in int it would be return method
        //so we assign method type in void =>void mean just nothing it return nothing
        /* trying something new with no return type*/
//        return length * breadth;
        int areaofRectangle=length*breadth;
        System.out.println("Area of Rectangle :"+areaofRectangle);
    }

    public void perimeter() {
           //int
        int perimeter_rec=2*(length*breadth);
        System.out.println("Area of Perimter :"+perimeter_rec);
    }

    //whenever we return anymethod we need to print it on main method or it wont' show any result
    //we can see result only in printing
    public boolean isRectangle(){
        //squre=all the sides are equal then only it's squre
      /*  if(length==breadth){
            return true;
        }
        else {
           return false;
        }*/
        //we can use ternory operator
               //conditon       true or false
        return (length==breadth)?true:false;
    }
}

public class RectangleTask {
    public static void main(String[] args) {
        //1.create object for rectangle
        Rectangle r = new Rectangle();
      //2.Assign values for class propertites
        /*r.length = 10;
        r.breadth = 10;*/

//        now we get values from user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The length :");
        r.length= sc.nextInt();
        System.out.println("Enter The Breadth :");
        r.breadth= sc.nextInt();
        //3.call class methods
        //we comment it because we use  no return method
//        System.out.println("Area of Rectangle :" + r.area());
//        System.out.println("Area of Perimeter :" + r.perimeter());
        //one more thing we can create multiple object with one class
        r.area();
        r.perimeter();
        System.out.println(r.isRectangle());
//        Rectangle r1 = new Rectangle();
//        r1.length = 5;
//        r1.breadth = 3;
//        System.out.println("Area of Rectangle 2: " + r1.area());
//        System.out.println("Area of Perimeter 2: " + r1.perimeter());
    }
}
