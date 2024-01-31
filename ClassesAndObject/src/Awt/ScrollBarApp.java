package Awt;

import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class ScrollBarApp extends Frame implements AdjustmentListener {
    TextField tf;
    Scrollbar red,green,blue;
    ScrollBarApp(){
        super("Myapp");
        red=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        green=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        blue=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        tf=new TextField(20);
        tf.setBounds(50,50,300,50);
        red.setBounds(50,150,300,30);
        green.setBounds(50,200,300,30);
        blue.setBounds(50,250,300,30);
        setLayout(null);//because we set our own bondaries where it be placed
        add(tf);
        add(red);
        add(green);
        add(blue);

        //register AsjustmentListerner to the components
        red.addAdjustmentListener(this);
        green.addAdjustmentListener(this);
        blue.addAdjustmentListener(this);

    }
    public static void main(String[] args) {
      ScrollBarApp s=new ScrollBarApp();
      s.setVisible(true);
      s.setSize(500,500);

    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        //set background color to text field
        tf.setBackground(new Color(red.getValue(),green.getValue(),blue.getValue()));

    }
}
