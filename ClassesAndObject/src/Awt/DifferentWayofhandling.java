package Awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyFrameApp extends Frame {
    TextField tf;
    Button b;
    int count = 0;

    MyFrameApp() {

        super("Sample Apps");
        tf = new TextField("0            ");
        b = new Button("Click");
        setLayout(new FlowLayout());
        add(tf);
        add(b);
        //Lambda Expression
        //Action Event There is only one method there's no other method available in interface so we can use lambda expression
        //action event implement action listener that action listener only one method
        //lambda expression also know as functional interfaces if class has only one method then it will become functional interface
        b.addActionListener((ActionEvent ae)-> {count++;tf.setText(String.valueOf(count));});


        //creating annoymous class and implementing listener
      /*  b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
//                tf.setText(" "+count);//concat method
                //converting integer to string
                tf.setText(String.valueOf(count));//getting inter as String
            }
        });*/

//        b.addActionListener(new BtnEven());//add BtnEven class to actionListener
//
//
//        });



    }


   /* //Create Inner class and add to Listener
    class BtnEven implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            count++;
            tf.setText(String.valueOf(count));
        }
    }*/
}
public class DifferentWayofhandling {
    public static void main(String[] args) {
        MyFrameApp ma=new MyFrameApp();
        ma.setSize(400,400);
        ma.setVisible(true);
    }
}
