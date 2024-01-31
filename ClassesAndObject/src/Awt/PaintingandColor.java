package Awt;

import java.awt.*;
import java.awt.event.*;

import static java.awt.Color.red;

class Mypainting extends Frame {
    int x = 0, y = 0; //coordinate x and y axis

    Mypainting() {
        super("My painting app");
        //if i use mouseListener then i must override all the method
        //if i use mouseAdapter we can overide one method which we want


        addMouseMotionListener(new MouseMotionAdapter() { //mouseListener for clicked motionListener for dragged
            @Override
            public void mouseDragged(MouseEvent e) {
                //wherever mouse clicked it will draw circle in that place
               x=e.getX();
               y=e.getY();
               //we can't called paint method again
                //we need to use repaint method that's method available in Frame
                repaint();
            }
        });

        //windows closing even again we didn't use listener instead of using adopter method
        //we can override which method we want
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    public void paint(Graphics g) {
        g.setColor(red);
//        g.drawOval(x, y, 50, 50);
//        g.fillOval(x, y, 50, 50);//circle fill with red color
        //Font class contain all the information about the fonts
        g.setFont(new Font("NoteWorthy", Font.BOLD,30));//font family,font varient,and size
        g.drawString("Hello",x,y);



                
    }
}

public class PaintingandColor {
    public static void main(String[] args) {
        Mypainting mp = new Mypainting();
        mp.setVisible(true);
        mp.setSize(500, 500);


    }
}
