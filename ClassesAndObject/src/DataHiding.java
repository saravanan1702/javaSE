import java.util.Scanner;

class RectangleDataHide {
    private int length;
    private int breadth;

    int getLength(){
        return length;
    }
    void setLength(int l){
        //length can't be zero so we give validation part for setter
        //validation in order to give positive values
        if(l>0){
            length=l;
        }
        else {
            length=0;
        }
    }
    int getBreadth(){
        return breadth;
    }
    void setBreadth(int b){
        if(b>0){
            breadth=b;
        }else {
            breadth=0;
        }
    }
    public  int area(){
//        return length*breadth;
        //we can directly acces properties
        return getLength()*getLength();
    }
    public int perimeter(){
//        return 2*(length+breadth);
        return  2*(getLength()+getBreadth());
    }
    public boolean isSqure(){
        if(length==breadth){
            return true;
        }
        else {
            return false;
        }
    }
}

public class DataHiding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        RectangleDataHide r=new RectangleDataHide();
        //set values for private properties
       /* r.setLength(10);
        r.setBreadth(12);*/
        //get values for private properties
       /* System.out.println(r.getLength());
        System.out.println(r.getBreadth());*/

        //now try to set values in user from keyboard
        System.out.println("Enter The value of length :");
        int l=sc.nextInt();
        r.setLength(l);//set length
        System.out.println("Enter The value fo Breadth :");
        int b=sc.nextInt();
        r.setBreadth(b);//set breadth
        System.out.println("Area of rectangle :"+r.area());
        System.out.println("area of perimeter :"+r.perimeter());
        System.out.println("is Squre :"+r.isSqure());

    }
}
