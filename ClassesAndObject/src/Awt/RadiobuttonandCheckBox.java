package Awt;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class RadioButtonsDemo extends Frame  implements ItemListener{
    Label l;


    public void itemStateChanged(ItemEvent e) { //item event e=>contain the information
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

    Checkbox c1,c2,c3;

    //RadioButtons
    //Set of Check boxes are kept inside the group then they become Radio buttons
    //but we can click only one not selecting multiple items




    public RadioButtonsDemo(){
        //set title super()
        super("CheckBox Demo");//parent class Frame(title)

        //now creating component
        l=new Label("Nothing is Selected    ");//space for lable depending on our lable what we put that place
        c1=new Checkbox("Java");
        c2=new Checkbox("C++");
        c3=new Checkbox("JavaScript");

/*        //radio buttons
        cbg=new CheckboxGroup();
        l=new Label("Nothing is Selected    ");//space for lable depending on our lable what we put that place
        c1=new Checkbox("Java",false,cbg);
        c2=new Checkbox("C++",false,cbg);
        c3=new Checkbox("JavaScript",false,cbg);*/




        //set Layout our app
        setLayout(new FlowLayout());

        //add items to Listener
        c1.addItemListener(this);//current class itslef as listener
        c2.addItemListener(this);
        c3.addItemListener(this);

        //add the component to the frame
        add(l);
        add(c1);
        add(c2);
        add(c3);


        //set size for our application
        //onemore thinng we can set size of application inside the constructor also create outsie the class but i'd like to assgin the size of application inside the constructor

        setSize(400,400);
        //seti visible true then only we can see that
        setVisible(true);


    }


}
public class RadiobuttonandCheckBox {
    public static void main(String[] args) {
        //create obj for our application
        RadioButtonsDemo rb=new RadioButtonsDemo();

    }
}
