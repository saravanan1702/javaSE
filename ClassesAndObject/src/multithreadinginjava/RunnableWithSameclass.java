package multithreadinginjava;

public class RunnableWithSameclass implements Runnable{
    public void run(){
        int i = 1;
        while (i <= 10) {
            System.out.println(i + " hello");
            i++;
        }
    }

    public static void main(String[] args) {
        RunnableWithSameclass r=new RunnableWithSameclass();
        Thread t=new Thread(r);
        t.start();
        int i = 1;
        while (i <= 10) {
            System.out.println(i + " hello");
            i++;
        }
    }
}
