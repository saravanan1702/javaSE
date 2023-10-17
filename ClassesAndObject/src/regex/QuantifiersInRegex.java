package regex.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuantifiersInRegex {
    public static void main(String[] args) {
        //Quantity -> Number of ocurrenses in given String
        /* ?,*,+,{}*/
        //+ ->Atleast one or more charactor occurance in given string
        //* ->Any Number even it's zero
        //? ->Atmost charactor occurances
        //{} -> this is meaning how many times this the given string occurance in given object (string)
        String str = "ababaaaabaccacac 620021 !@#$%^&*()";
//        Pattern p= Pattern.compile("Tamil");
//        Matcher m=p.matcher(str);
//        System.out.println(m.find());
//        System.out.println(m.group());
//        System.out.println(m.start());
//        System.out.println(m.end());
//        System.out.println(m.find());
//        System.out.println(m.groupCount());
//        Pattern p = Pattern.compile("ab+");//atleast one ab or more
//        Pattern p = Pattern.compile("ab?");//atmost one charactor
        Pattern p = Pattern.compile("ab{1,2}");// this is mean the number of times atleast one time or 2 times
        Matcher m=p.matcher(str);
        while(m.find()){
            System.out.println(m.group()+" Start at "+m.start());
        }
    }
}
