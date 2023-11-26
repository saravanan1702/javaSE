package multithreadinginjava;
class Test extends  Thread{
    //if we want to run multiple method in simultinously then we can achieve it with Thread class
    //if we want to achive multi thread  we must extends Thread class
    //user defined thread

    public void run() {//inbuild run method that's available in thread class
        //whatever we want to write some logic to the program we must override the run method
        //we can't give own method name but can give logic in run method (override)
        int i=1;
        while(i<=10){
            System.out.println(i+" Hello");
            i++;
        }
    }
}
public class Demo_usingThreadclassWithSeparateClassFile {
    public static void main(String[] args) {
        Test t=new Test();
        t.start();//inbuilt start method,this method know how to start the thread
        int i=1;
        while(i<=10){
            System.out.println(i+" world");
            i++;
        }
    }
}
