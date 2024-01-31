package Awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Adopter extends Frame{
    Adopter(){
        super("adoper Demo");
        addWindowListener(new WindowAdapter() { //create annoymoes class and override method which we want to our application
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

            @Override
            public void windowActivated(WindowEvent e) {
                Label l=new Label("Windows Activated");
            }
        });//which class Mywindow class
    }
 /*  class MyWindowAdopter extends WindowAdapter{//why we create separate class
        //we can't extents multiple class in single class
        public void windowClosing(WindowEvent we){
            System.exit(0);
        }
   }*/
}
public class AdopterClass{
    public static void main(String[] args) {
        Adopter a=new Adopter();
        a.setSize(400,400);
        a.setVisible(true);
    }
}
