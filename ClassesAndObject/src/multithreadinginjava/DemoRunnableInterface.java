package multithreadinginjava;
class Test1 implements Runnable{
    public void run(){
        int i = 1;
        while (i <= 10) {
            System.out.println(i + " hello");
            i++;
        }
    }
}
public class DemoRunnableInterface {
    public static void main(String[] args) {
        //if want to start the run as a Thread we must need object of the thread class
        //first create class object then attached to Thread object of the class
        Test1 t=new Test1();
        //crate Thread class
        Thread thread=new Thread(t);//attaching implemented class to object of the Thread class
        thread.start();
        int i = 1;
        while (i <= 10) {
            System.out.println(i + " hello");
            i++;
        }
    }
}
