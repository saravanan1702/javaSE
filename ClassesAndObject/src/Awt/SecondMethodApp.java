package Awt;
import java.awt.*;

//@2 Method define our own class

class MyFrame extends Frame{

    //Just create reference not creating entire object
    Label l;
    TextField tf;
    Button b;

    //Constructor of MyFrame
    public  MyFrame(){//constructor

        super("MyApp");//super mean Frame, then Frame constructor will be called
        setLayout(new FlowLayout());
        l=new Label("Name");
        tf=new TextField(20);//column size //this is not character size this is visible size
        b=new Button("ok");//lale(ok) for button

        add(l);
        add(tf);
        add(b);

        //we can set size and visible also in constructor
        //i wish,i would do this inside the main method
     /*   setSize(300,300);
        setVisible(true);*/


    }

}
public class SecondMethodApp {
    public static void main(String[] args) {

        //creating Object for Myframe
        MyFrame f=new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);


    }
}
