package mypackDemo;
import packagesdemo.*;
import packagesdemo.innerdemo.Arithmatic;
import packagesdemo.innerdemo.Demo3;

public class DemoforPack {
    public static void main(String[] args) {
        Demo2 d1=new Demo2();
        Demo3 d2=new Demo3();
        d1.display();
        d1.display();
        d2.display();
        Arithmatic a=new Arithmatic();
        a.sub(20,2);
        a.add(29,2);
    }
}
