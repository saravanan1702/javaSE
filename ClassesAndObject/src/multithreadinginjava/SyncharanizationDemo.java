package multithreadinginjava;
class MyData {


     synchronized    void display (String str){

            //we can give block as synchronized or method as synchronized
//            synchronized (this){
             //critical suitavation =>a  peice of code which is allows to access multiple thread simulteaniousyuy
            for (int i = 0; i < str.length(); i++) {
                System.out.println(str.charAt(i));

                //even if we make thread as sleep it will allow only one thread to access
                try{
                    Thread.sleep(500);
                }catch (Exception e){
                    System.out.println(e);
                }
            }
//        }
    }

}
class MyThread1 extends Thread{
    //creatin reference of Mydata class
    MyData d;
    public  MyThread1(MyData md){ //passing reference of constructor as myData class
        d=md;
    }

    @Override
    public void run() {
        d.display("Hello World");
    }
}
class MyThread2 extends Thread{
    MyData data;//create reference for MYData class
    MyThread2(MyData data){
        this.data=data;
    }

    @Override
    public void run() {
        data.display("Welcome");
    }
}

public class SyncharanizationDemo {
    public static void main(String[] args) {
      MyData data=new MyData();
      MyThread1 t1=new MyThread1(data);
      MyThread2 t2=new MyThread2(data);
        t1.start();
        t2.start();
    }
}
