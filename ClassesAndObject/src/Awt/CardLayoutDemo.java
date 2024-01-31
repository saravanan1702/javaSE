package Awt;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CardLayoutDemo extends Frame  implements ItemListener {

    Button b1,b2,b3;
    TextField t1,t2,t3;
    Panel p1,p2;
    Panel cp;

    Panel mainp;

    Checkbox c1,c2;

    CardLayout cl;

    CardLayoutDemo(){
        super("Card Layout ");
        CheckboxGroup cb=new CheckboxGroup();
        c1=new Checkbox("one",true,cb);//passing three parameter lable,visible state,add groupbox
        c2=new Checkbox("two",false,cb);
        c1.addItemListener(this);
        c2.addItemListener(this);

        b1=new Button("one");
        b2=new Button("two");
        b3=new Button("three");

        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);

        cp=new Panel();
        cp.add(c1);
        cp.add(c2);

        //add button to pannel
        p1=new Panel();
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);

        //add text filed to pannel
        p2=new Panel();
        p2.add(t1);
        p2.add(t2);
        p2.add(t3);

        //main pannel
        //panel default layout is flow layout
        mainp=new Panel();
        cl=new CardLayout();
        mainp.setLayout(cl);

        mainp.add("one",p1);
        mainp.add("two",p2);

        //add panel to frame
        add(cp,BorderLayout.NORTH);
        add(mainp,BorderLayout.CENTER);




    }
    public static void main(String[] args) {
        CardLayoutDemo c=new CardLayoutDemo();
        c.setSize(500,500);
        c.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(c1.getState())
            cl.first(mainp);//mainp pannel
        else
            cl.last(mainp);


    }
}
