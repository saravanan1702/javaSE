package packagesdemo;
import packagesdemo.innerdemo.*;
public class CreateOwnPack {
    public static void main(String[] args) {
      Demo3 d=new Demo3();
      d.display();
      int a=10,b=20;
      Arithmatic arr=new Arithmatic();
      arr.add(12,3);
      arr.sub(a,b);

    }
}
