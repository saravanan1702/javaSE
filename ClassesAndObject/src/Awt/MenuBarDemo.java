package Awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyMenu extends Frame{

    //what's out require File  and  it's related sub menu
    Menu file,sub;
    MenuItem open,save,close,closeall;
    CheckboxMenuItem auto;

    TextField tf;
    MyMenu(){
        super("MyMenuBar");
        open=new MenuItem("open");
        save=new MenuItem("save");
        close=new MenuItem("close");
        closeall=new MenuItem("closeall");
        auto=new CheckboxMenuItem("auto save");

        file=new Menu("file");
        sub=new Menu("close");

        //file menu contains MenuItems
        file.add(open);
        file.add(save);
        file.add(sub);
        file.add(auto);

        sub.add(close);
        sub.add(closeall);

        //now we add all the components to the MenuBar(class)

        MenuBar m=new MenuBar();
        m.add(file);
        setMenuBar(m);//setMenubar is method of frame class

        tf=new TextField(20);
        setLayout(new FlowLayout());
        add(tf);//add to frame

        //HINTS ->
        //we can use lambda function only if class has only one method
        //handling event listener but we don't write big lines of code just simple write in single line with help of lambda expression
        open.addActionListener((ActionEvent e)->tf.setText("open"));
        save.addActionListener((ActionEvent e)->tf.setText("save"));
        close.addActionListener((ActionEvent e)->tf.setText("close"));
        closeall.addActionListener((ActionEvent e)->tf.setText("closeall"));

        auto.addItemListener((ItemEvent ie)->
        {
            if(auto.getState()){
                tf.setText("auto on");
            }else {
                tf.setText("auto off");
            }
        });

        //windows close button
        //add windows close using windowAdapter class
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


    }
}
public class MenuBarDemo {
    public static void main(String[] args) {
        MyMenu m=new MyMenu();
        m.setSize(500,500);
        m.setVisible(true);
    }
}
