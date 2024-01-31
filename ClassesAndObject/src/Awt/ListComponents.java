package Awt;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

class ListDemo extends Frame implements ItemListener,ActionListener{

    List l;
    Choice c;
    TextArea ta;
    ListDemo(){
        super("Mylistapp");
        l=new List(4,true);//no of rows want to visible,true means multiple items selected
        c=new Choice();
        ta=new TextArea(20,50);//No of rows and columns


        l.add("Monday");
        l.add("Tuesday");
        l.add("Wednesday");
        l.add("thursday");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");

        c.add("Juanuary");
        c.add("Febrary");
        c.add("March");
        c.add("April");

        //add these three things to the frame
        add(l);
        add(c);
        add(ta);

        //set layout
        setLayout(new FlowLayout());

        l.addItemListener(this);
        c.addItemListener(this);
        l.addActionListener(this);



    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        //show meg in text area either list iterms or choice
        if(e.getSource()==l){//find list box selected or choice seleted if selection equals to list then list will print ifnot then choice will print or show whatever in choice
            ta.setText(l.getSelectedItem());//only one item
//            ta.setText(Arrays.toString(l.getItems()));//getting multiple items because it's list we can select multiple items

        }else{
            ta.setText(c.getSelectedItem());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String list[]=l.getSelectedItems();//getting all the selected items in array
        String txt="";
        for(String x:list){
            txt+=x+"\n";//concat with text and also in new line
        }
        ta.setText(txt);

    }
}
public class ListComponents {
    public static void main(String[] args) {
        ListDemo ld=new ListDemo();
        ld.setSize(400,400);
        ld.setVisible(true);

    }
}
