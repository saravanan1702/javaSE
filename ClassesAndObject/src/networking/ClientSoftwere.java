package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientSoftwere {
    public static void main(String[] args) throws IOException {
        Socket stk=new Socket("192.168.29.146",2000);
        BufferedReader keyb=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));//converting inputreader
        PrintStream ps=new PrintStream(stk.getOutputStream());

        String msg;//String Object doesn't have reverse method but builder or buffer have
        StringBuilder sb;
        do{

            msg=keyb.readLine();
            ps.println(msg);
            msg=br.readLine();
            System.out.println(STR."From Server  \{msg}");//String templet literal
        }while (!msg.equals("dne"));
       stk.close();

    }

}
