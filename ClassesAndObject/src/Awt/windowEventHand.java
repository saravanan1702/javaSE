package Awt;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class windowEventHand extends Frame  implements WindowListener {
   Label l;
    windowEventHand(){
        super("Window Event Demo");
        l=new Label("    ");
        setLayout(new FlowLayout());
        add(l);
        addWindowListener(this);
        
    }

    public static void main(String[] args) {
        windowEventHand w=new windowEventHand();
        w.setSize(500,500);
        w.setVisible(true);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        l.setText("Window Opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        l.setText("Window Closing");
        System.exit(0);// 0 means no error
        //0 is the status sent to Operating system informing the operating system that program has successfully executed
    }

    @Override
    public void windowClosed(WindowEvent e) {
        l.setText("Window Closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        l.setText("Window Iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        l.setText("Window Deiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        l.setText("Window Activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        l.setText("Window Deactivated");
    }
}
