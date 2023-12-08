package ioStream;


import java.io.*;

class Producer extends Thread{
    OutputStream os;
    //constructor is taking outpouts stream as a parameter
    Producer(OutputStream o){
        os=o;
    }
    public  void run(){
        int count=1;
        while (true) {
            try {
                os.write(count);
                os.flush();//to make sure that our data sent to other side that's why we put this method
                System.out.println("Producer produce the values :"+count);
                System.out.flush();
                Thread.sleep(10);
                 count++;
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Consumer extends Thread{
    InputStream is;
  public   Consumer(InputStream i){
        is=i;
    }
    public void run(){
      int x;
      while (true){
          try {
              x=is.read();
          System.out.println("Consumer Consuming the values :"+x);
              System.out.flush();
              Thread.sleep(10);
          } catch (IOException | InterruptedException e) {
              throw new RuntimeException(e);
          }

      }
    }

}
public class PipedDemo {
    public static void main(String[] args) throws IOException{
        PipedInputStream pis=new PipedInputStream();
        PipedOutputStream pos=new PipedOutputStream();
        //connect these two pipes whatever procducer produce the consumer ready to consume the value
        pis.connect(pos);//we can connect these two pipes any direction left to right or right to left the purpose is just connect the pipes that's all
//        pos.connect(pis);//both are connect we just connect the pipes/

        Producer p=new Producer(pos);//passing construtor as pos
        Consumer c=new Consumer(pis);

        p.start();
        c.start();

    }
}
