package Awt;
import ioStream.BufferedDemo;

import java.awt.*;

//Creating Frame based Application
public class FirstApp {
    public static void main(String[] args) {
        Frame f=new Frame("MyFirstapp");
        //set layout
        f.setLayout(new FlowLayout());//if we not set layout then other component will take the entire as component(like button wil occupy entire layout as button)


        //add button to our app
        Button b=new Button("Ok");//construct button with lable (ok)
        Label l=new Label("Name");
        TextField tf=new TextField(20);//columns size

        //we must add the component to the frame whatever we want
        f.add(l);//lable(just give something text)
        f.add(tf);//text field
        f.add(b);//add button component to the frame




        //setting size for our frames
        f.setSize(300,300);//width and height
        f.setVisible(true);//then only appear on screen

    }
}
