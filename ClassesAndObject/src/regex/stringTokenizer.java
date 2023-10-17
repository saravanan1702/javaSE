package regex.practice;

import java.util.StringTokenizer;

public class stringTokenizer {
    public static void main(String[] args) {
        //StringTokenizer also same as string split() method it's split the string in token metod
        // by default -> dilimit working if there is any spaces in the given string it split by space
        //three method in string tokenzier
//        1. Stringtokenizer("only string")
//        2.Stringtokenizer ("string with dilimit);
//        3.stringtokenizer("String with dilimit and boolean return incase we want to print dilimit );
//      StringTokenizer st=new StringTokenizer("Saravanan is good boy");
//        System.out.println(st.countTokens());// we know how it's split with 4 by default it's split with dilimit ->space
//        StringTokenizer st=new StringTokenizer("www.saravanan.com",".");// in this scaniro i give implicity with split with dot so it'ssplit with dot
//        StringTokenizer st=new StringTokenizer("12-12-2023","-",true);
//        // in this method i want print all thise given data split with dash also
//        //delimiters -> it works on how to split this method
//        while(st.hasMoreTokens()){
//            System.out.println(st.nextToken());
//        }
        // why string split method is very easy compare to string tokenizer because we we don't need to create mutiple method split the given string
        //for example
        String s="http\\:www.saravanan.com";
        String st[]=s.split("\\:|\\\\|\\.");
        for(String x:st){
            System.out.println(x);
        }
    }
}//More than one delimiter we can use string.split() method
//if you want to split the string one you can use string tokenizer
//and one more thing string tokenizer currently we're not using we use string split method using instead of tokenizer
//if we work in old java project we use string tokenizer otherwise we use only pattern or split method
