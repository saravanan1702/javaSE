package Awt;

import java.awt.*;
import java.awt.LayoutManager;
import java.awt.event.*;
import java.awt.GridLayout;

class Grid_layout1 extends Frame {
    Button b1, b2, b3, b4, b5, b6;

    Grid_layout1() {
        super("GridBag Layout ");
        setLayout(new java.awt.GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();


        b1 = new Button("One");
        b2 = new Button("two");
        b3 = new Button("three");
        b4 = new Button("four");
        b5 = new Button("five");
        b6 = new Button("six");

        gbc.gridx = 1; //constrains
        gbc.gridy = 1;
        add(b1, gbc);
        gbc.gridx = 3;
        gbc.gridy = 1;
        add(b2);

        gbc.gridx = 2;
        gbc.gridy = 2;

        add(b3, gbc);

        gbc.gridx = 4;
        gbc.gridy = 2;
        add(b4);
        gbc.gridx = 2;
        gbc.gridy = 3;
        add(b5,gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        add(b6);
//        add(new Button("seven"));


        setVisible(true);
        setSize(400, 400);
    }
}

public class GridBagLayout {
    public static void main(String[] args) {
        Grid_layout1 g = new Grid_layout1();
    }
}
