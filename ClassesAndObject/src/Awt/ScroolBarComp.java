package Awt;

import java.awt.*;
import java.awt.event.*;

class Myframe extends Frame{
    Scrollbar red,green,blue;//references
    TextField tf;
    Myframe(){
        super("ScrollBar Demo");
        //scrollbar has three type of constructor empty,Orientation(horizontal or vertical),and orientation,value,visible amt,min and max
//        red=new Scrollbar();//Empty constrctor
        red=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);//Orientation,current value,tracker visible value,minimum vallue and maximum value
        green=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        blue=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);

        tf=new TextField(20);//no of columns
        //setBounds
        tf.setBounds(50,50,300,50);
        red.setBounds(50,150,300,30);
        green.setBounds(50,200,300,30);
        blue.setBounds(50,250,300,30);
        setLayout(null);//because we set the boundaries to the components we set the companents where it should be arranged
        add(tf);
        add(red);
        add(green);
        add(blue);




    }
}
public class ScroolBarComp {
    public static void main(String[] args) {
        Myframe my=new Myframe();
        my.setVisible(true);
        my.setSize(500,500);

    }
}
