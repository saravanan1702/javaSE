package Awt;

import java.awt.*;
import java.awt.event.*;

class Myapp extends Frame{
    Label l1,l2;//two lables(text)
    TextField tf;//inbuild classs that's available in awt
    Myapp(){
        super("MyTextApp");
        l1=new Label("No Text Entered.The Text is Blank");
        l2=new Label("Enter Key is not yer Hit ");
        tf=new TextField(20);//size

//        tf.setEchoChar('*');//for password

        //setting layout
        setLayout(new FlowLayout());
        add(l1);//lable 1
        add(tf);//text field
        add(l2);//lable 2

        //adding or register textlistener and action listener  to current class itself
        /*tf.addTextListener(this);
        tf.addActionListener(this);*/
        Hadnler h=new Hadnler();//inner class object
        tf.addActionListener(h);
        tf.addTextListener(h);//inner class
    }


    //Inner Class
    class Hadnler implements TextListener,ActionListener{
        @Override
        public void textValueChanged(TextEvent e) {
            l1.setText(tf.getText());


        }

        @Override
        public void actionPerformed(ActionEvent e) {
            l2.setText(tf.getText());
        }

    }
}
public class TextFieldandText {
    public static void main(String[] args) {
        Myapp m=new Myapp();
        m.setSize(400,400);
        m.setVisible(true);

    }
}
