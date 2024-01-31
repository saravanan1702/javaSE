package Awt;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseHandle extends Frame implements MouseListener, MouseMotionListener {
    Label l,l2;
    MouseHandle(){
        super("Mouse Even Handling");
        setLayout(null);
        l=new Label("");
        l2=new Label("");
        l.setBounds(10,50,100,30);
        l2.setBounds(10,80,100,30);
        add(l);
        add(l2);

        //register this class to handler
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public static void main(String[] args) {
        MouseHandle mh=new MouseHandle();
        mh.setSize(400,400);
        mh.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        l.setText("Mouse pressed");

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");

    }

    @Override
    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        l.setText("Mouse Dragged");

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        l.setText("Mouse Moved");
        l2.setText("("+e.getX()+","+e.getY()+")");

    }
}
