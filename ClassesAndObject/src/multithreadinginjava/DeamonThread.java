package multithreadinginjava;
class Test01 extends Thread{
    @Override
    public void run() {
     /*  int count=1;
       while(true){
           System.out.println(count++);
       }*/
        int count =1;
        while(true){
            System.out.println(count++ +" My Thread");
        }
    }
}
public class DeamonThread {
    public static void main(String[] args) throws InterruptedException {
        Test01 t=new Test01();
//        t.setDaemon(true);//deamon threads are depended threads it will terminate when main thread terminate
        t.start();
//        try {Thread.sleep(1000);}catch (Exception e){};
        //before terminating main method sleep for a while, meanwhile the sleeping started the test 01 method execute
        //force main method to wait for other thread to complete the task
       /* Thread  mainThread =Thread.currentThread();//reference of the current thread
               //Descriptive name for a varialbe
        mainThread.join();//now main method is ready to wait for joining and terminate with run method*/

        int count =1;
        while(true){
            System.out.println(count++ +" main Thread");
            //main method will have to wait for some time
            Thread.yield();//give more time to my Thread (run method)
            //now my Thread get more time for execution from cpu
        }
    }
}
