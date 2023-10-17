package operators_and_expersion.udemy;

import java.util.Scanner;

public class Area_of_cubid {
    public static void main(String[] args) {
        int length,breadth,width;
        int totalArea,volume;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Length,breadth,height :");
        length= sc.nextInt();
        breadth= sc.nextInt();
        width= sc.nextInt();
        totalArea=2*(length*breadth+breadth*length*breadth+breadth*length);
        volume=length*breadth*width;
        System.out.println("total area :"+totalArea);
        System.out.println("Area of Cubid :"+volume);
    }
}
