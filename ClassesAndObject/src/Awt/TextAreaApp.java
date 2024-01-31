package Awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TextAreaDemo extends Frame implements ActionListener {
    //components
    TextArea ta;
    TextField tf;
    Label l;
    Button b;
    //constructor
    public  TextAreaDemo(){
        super("MYapp");
        l=new Label("No Text Entered ");
        tf=new TextField(20);//column
        ta=new TextArea(10,20);//no of rows >10, No of Column >20
        b=new Button("Click");

        setLayout(new FlowLayout());
        add(ta);
        add(l);
        add(tf);
        add(b);


        b.addActionListener(this);//register actionlistener for button component when it click it will responce

//        setBounds(100,100,65,65); //x axies and y axies and width and height

        setSize(400,400);//frame size
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        l.setText(ta.getSelectedText());//only selected text will show or print
//        ta.append(ta.getText());//append at last
        ta.insert(ta.getText(),ta.getCaretPosition());//caret mean cursor,In java cursor is called as caret, it will add the text whereever cursor point
    }

}
public class TextAreaApp {
    public static void main(String[] args) {
     TextAreaDemo ta=new TextAreaDemo();
    }
}
