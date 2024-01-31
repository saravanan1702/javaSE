package Awt;

import java.awt.*;

class Grid_layout extends Frame{
    Button b1,b2,b3,b4,b5,b6;
    Grid_layout(){
        super("Grid Layout ");
        b1=new Button("One");
        b2=new Button("two");
        b3=new Button("three");
        b4=new Button("four");
        b5=new Button("five");
        b6=new Button("six");
        setLayout(new GridLayout(3,3));//3 rows and 2 columns

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(new Button("seven"));


        setVisible(true);
        setSize(400,400);
    }
}
public class LayoutManager2 {
    public static void main(String[] args) {

        Grid_layout g=new Grid_layout();
    }
}
