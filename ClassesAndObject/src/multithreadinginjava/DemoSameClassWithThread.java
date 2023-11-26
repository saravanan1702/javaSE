package multithreadinginjava;

public class DemoSameClassWithThread extends Thread {
    //samething but we do in same class instead of writing separete class
    public void run() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i + " hello");
            i++;
        }
    }

    public static void main(String[] args) {
        DemoSameClassWithThread d = new DemoSameClassWithThread();
        d.start();

        int i = 1;
        while (i <= 10) {
            System.out.println(i + " hello");
            i++;

        }
    }
}
