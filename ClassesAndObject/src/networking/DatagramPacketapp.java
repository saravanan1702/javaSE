package networking;
import java.io.IOException;
import java.util.*;
import java.net.*;

public class DatagramPacketapp {
    //Datagram clinet app
    public static void main(String[] args) throws IOException {
       DatagramSocket ds=new DatagramSocket(2001);//client port number
       String msg="Hello World";
       DatagramPacket dp=new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getByName("localhost"),2000);
      ds.send(dp);//sent packet to the server
        //client has sent the packet


        //but our clinet recive the packet also
        byte b[]=new byte[1024];
        dp=new DatagramPacket(b,1024);
        ds.receive(dp);

        msg=new String(dp.getData()).trim();
        System.out.println("From Server "+msg);

        ds.close();




    }
}
