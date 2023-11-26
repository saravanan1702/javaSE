package multithreadinginjava;
//class Mythread implements  Runnable{
//    public void run(){}
//}
class Mythread extends Thread{
  //constructor
  public   Mythread(String name){//giving name for our own Thread
        super(name);//parents class Constructor //accessing parents class constructor in derived class constructor
//       setPriority(Thread.MAX_PRIORITY);//10
      //we can set priority manualy
//      setPriority(Thread.NORM_PRIORITY+2);//normal 5 =>5+2=>7
//      setPriority(Thread.MAX_PRIORITY-2);//max=10 =>10-2=>8


    }

    @Override
    public void run() {
       int count =1;
       while(true){
           System.out.println(count++);
//           count++;
           try {

           Thread.sleep(500);
           }catch (InterruptedException e){
               System.out.println(e);
           }
       }
    }
}

public class ConstructorClassThread {
    public static void main(String[] args) {
        //annoymous class creating class without object
//        Thread t=new Thread(new Mythread(),"My Thread");
        Mythread m=new Mythread("My thread 1");//thread with our own thread name
      /*  System.out.println("ID :"+m.getId());//thread id that's given by JVM we can't set own ID for each Thread
        System.out.println("Name :"+m.getName());//name of the Thread name //My thread 1
        System.out.println("Prioriy :"+m.getPriority());//priority of the Thread
        m.start();
        System.out.println("State :"+m.getState());//current state of thread
        System.out.println("is Alive :"+m.isAlive());*/
        m.start();
        //interrupting Thread
        m.interrupt();
    }
}
