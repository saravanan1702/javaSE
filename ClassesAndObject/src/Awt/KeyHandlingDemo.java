package Awt;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;

class KeyHandle extends Frame implements KeyListener {
    Label l1, l2, l3, l4;
    KeyHandle(){
        super("KeyHandling Demo");
        l1=new Label("");//for key pressed
        l2=new Label("");//for key relesed
        l3=new Label("");//for holding or typed
        l4=new Label("");//for time


        setLayout(null);
        l1.setBounds(30,20,100,20);
        l2.setBounds(30,50,100,20);
        l3.setBounds(30,80,100,20);
        l4.setBounds(30,110,200,20);

        add(l1);
        add(l2);
        add(l3);
        add(l4);

       addKeyListener(this);
    }

    @Override
    public void keyPressed(KeyEvent e) {
      l1.setText("key Pressed");
      l2.setText("");
    }
    @Override
    public void keyReleased(KeyEvent e) {
     l2.setText("Key released");
     l1.setText("");
     l3.setText("");
     l4.setText("");
    }
    @Override
    public void keyTyped(KeyEvent e) {
      l3.setText("Key typed");
      l4.setText(new Date(e.getWhen())+" ");
    }


}

public class KeyHandlingDemo {
    public static void main(String[] args) {
        KeyHandle kh = new KeyHandle();
        kh.setVisible(true);
        kh.setSize(500, 500);
    }
}
