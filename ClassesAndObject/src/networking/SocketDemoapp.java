package networking;
import javax.print.attribute.standard.PrinterName;
import java.net.*;
import java.io.*;
public class SocketDemoapp {
    public static void main(String[] args) throws IOException {
     ServerSocket ss=new ServerSocket(2000);//create server
     Socket stk=ss.accept();
     BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));//converting inputreader
        PrintStream ps=new PrintStream(stk.getOutputStream());

        String msg;//String Object doesn't have reverse method but builder or buffer have
        StringBuilder sb;
        do{
            msg=br.readLine();//reading

            sb=new StringBuilder(msg);
            sb.reverse();//reverse
            msg=sb.toString();

            ps.println(msg);//writing
        }while (!msg.equals("dne"));

        
    }
}
