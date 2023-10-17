package RelationAndOperators;

import java.util.Scanner;

public class CheckDomainName {
    public static void main(String[] args) {
      Scanner  sc=new Scanner(System.in);
      String url=sc.nextLine();
      String protocal=url.substring(0,url.indexOf(":"));
      if(protocal.equals("http")){
          System.out.println("hyper text transer protocal ");
      } else if (protocal.equals("ftp")) {
          System.out.println("file transer Protocal");

      }
      String ext=url.substring(url.lastIndexOf(".")+1);

      if(ext.equals("com")){
          System.out.println("it is commercial WebSite");
      } else if (ext.equals("org")) {
          System.out.println("it is organisation webSite");

      } else if (ext.equals("gov")) {
          System.out.println("it is government Website");

      }
    }
}
