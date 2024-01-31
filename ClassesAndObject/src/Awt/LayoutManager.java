package Awt;

import java.awt.*;

class Myframe01 extends Frame{  //the layout of the Frame  is border layout only this is default
    Button b1,b2,b3,b4,b5,b6;
    public Myframe01(){
        super("Flow Layout");
        b1=new Button("one");
        b2=new Button("two");
        b3=new Button("Three");
        b4=new Button("four");
        b5=new Button("Five");
        b6=new Button("six");

/*
        //Set Layout
        FlowLayout f=new FlowLayout();
        //setting alignment
        f.setAlignment(FlowLayout.RIGHT);
        f.setHgap(100);//giving Horizontal gap as well as vertical gap
//        setLayout(f);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        */
        //border layout
        add(b1,BorderLayout.NORTH);
//        add(b2,BorderLayout.EAST);
        add(b3,BorderLayout.SOUTH);
        add(b4,BorderLayout.WEST);
        add(b5,BorderLayout.CENTER);
//        add(b6);
        //Pannel
        Panel p=new Panel();//pannel also like a container it has components
        //default layout is flow layout
        //change layout to grid layout
        p.setLayout(new GridLayout(3,1));//no of rows and no of colum(3/1) 3 rows and 1 column
        p.add(new Button("Mond"));//annoymous button no reference for this button object
        p.add(new Button("Thu"));
        p.add(new Button("Wed"));
        add(p,BorderLayout.EAST);




    }
}
public class LayoutManager {
    public static void main(String[] args) {
      Myframe01 f=new Myframe01();
      f.setVisible(true);
      f.setSize(400,400);
    }
}
