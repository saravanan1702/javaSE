package Awt;
import java.awt.*;
import java.awt.event.*;

class Mybutton extends Frame implements ActionListener{
    int count =0;
    Button b;
    Label l;

    public Mybutton(){
        super("Button app");//title
        l=new Label("   "+count);
        b=new Button("click");
        b.addActionListener(this);
        setLayout(new FlowLayout());
        add(l);
        add(b);
       addWindowListener(new WindowAdapter() {

        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);//no error
        }
        
       });

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText("  "+count);


    }
}
public class ButtonEvenListernDemo {
    public static void main(String[] args) {

        Mybutton b=new Mybutton();
        b.setSize(400,400);
        b.setVisible(true);

    }
}
