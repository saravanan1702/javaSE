package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MulthiThreadReverseechoServer extends Thread {

    Socket sk;
    //constructor
    public MulthiThreadReverseechoServer(Socket stk){
        sk=stk;
    }
    public void run(){

        BufferedReader br= null;
        try {
            br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        PrintStream ps= null;//printstream is println method it will take care of printng whatever it comes
        try {
            ps = new PrintStream(sk.getOutputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String msg;
        StringBuilder sb;
        do{
            try {
                msg=br.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            sb=new StringBuilder(msg);
            sb.reverse();//once reverse
            msg=sb.toString();//again convert into string

            ps.println(msg);//printStream method to print the messages


        }while (!msg.equals("dne"));
        try {
            sk.close();//close the socket once work in done
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(2000);
        int count=1;
        Socket sk;
        MulthiThreadReverseechoServer m;
        do{
            sk=ss.accept();
            System.out.println(STR."Clint is connected\{count++}");//to ensure that
            m=new MulthiThreadReverseechoServer(sk);
            m.start();//start the thread
        }while (true);//infinite loop server running infinite loop untill we forced to stop the connection

    }
}
