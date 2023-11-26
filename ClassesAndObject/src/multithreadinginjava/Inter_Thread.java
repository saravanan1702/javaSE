package multithreadinginjava;

import java.lang.runtime.TemplateRuntime;

class MyData01 {
    int value;
    boolean flag=true;
    synchronized void setValue(int v)throws Exception{
        Thread.sleep(1000);
        while (flag!=true)
            wait();
            value = v;

            flag = false;
            notify();

    }
    synchronized int getValue()throws Exception{
        Thread.sleep(1000);
        int x=0;
        while(flag!=false)
            wait();
            x=value;

        flag=true;
        notify();
        return x;
    }
}
class Producer extends Thread{
    MyData01 d;
    Producer(MyData01 d){
        this.d=d;
    }

    @Override
    public void run() {
      int i=1;
      while(true){
          try {
              d.setValue(i);
          } catch (Exception e) {
              throw new RuntimeException(e);
          }
          System.out.println("Producer :"+i);
          i++;
      }
    }
}class Consumer extends Thread{
    MyData01 d;
    Consumer(MyData01 d){
        this.d=d;
    }

    @Override
    public void run() {
        int val;
        while (true){
            try {
                val=d.getValue();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println("Consumer :"+val);
        }
    }
}
public class Inter_Thread {
    public static void main(String[] args) {
     MyData01 data=new MyData01();
     Producer p=new Producer(data);
     Consumer c=new Consumer(data);
     p.start();
     c.start();
    }
}
