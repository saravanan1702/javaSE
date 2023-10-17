package regex.practice;

import java.util.regex.Pattern;

public class SplitPattern {
    public static void main(String[] args) {
        String str="Saravanan Chennai TamilNadu 62001";
       // str.split("\\s")
/*        String st[]=str.split("\\s");//Removing white spaces
        for (String x:st) {
            System.out.print(x);
        }
        System.out.println("---------------------------------------");
        String str2="www.saravanancutiee.com";
        String st2[]=str2.split("\\.");// it split with after dot //  this is argument -> regex pattern
        for(String x1:st2){
            System.out.println(x1);
        }*/
        //now split method using in pattern class
//        Pattern p=Pattern.compile("\\s");//Remove white spaces
        String str2="www.saravanancutiee.com";
        Pattern p=Pattern.compile("\\.");//split with after dot ->regex pattern type♦
        String st[]=p.split(str2);
        for(String x:st){
            System.out.println(x);
        }


    }
}
