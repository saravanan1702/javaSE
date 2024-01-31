package Awt;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class RadioButtons  extends Frame implements ItemListener {
    Label l;
    Checkbox c1,c2,c3;
    CheckboxGroup cg;

    RadioButtons(){
        super("Radio Buttons");
        l=new Label("Nothing is Selected ");
        cg=new CheckboxGroup();
        c1=new Checkbox("java",false,cg);
        c2=new Checkbox("c++",false,cg);
        c3=new Checkbox("Python",false,cg);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        //set layout
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);

        //add components to the frame
        add(l);
        add(c1);
        add(c2);
        add(c3);
    }
    public static void main(String[] args) {
      RadioButtons rb=new RadioButtons();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String str="";
        if(c1.getState()){//state mean if true it's selected if false not selected
            //Now we're using String Template
            str= STR."\{str}  \{c1.getLabel()}";//lable(name of the radio check box whatever it be java or python ,c++)
        }
        if(c2.getState()){
            str= STR."\{str}  \{c2.getLabel()}";//lable(name of the radio check box whatever it be java or python ,c++)
        }
        if(c3.getState()){
            str= STR."\{str}  \{c3.getLabel()}";//lable(name of the radio check box whatever it be java or python ,c++)
        }
        if(str.isEmpty()){
//            str="Nothing is Selected";
            str="Nothing is selected";
        }
        l.setText(str);//whichevere selected they'll appear
    }
}
