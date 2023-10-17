package regex.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMetaDataCharactor {
    public static void main(String[] args) {
        //Also called predefined method
        String str="TamilTamilan TamilNadu 620021 !@#$%^&*()";

//        Pattern p= Pattern.compile("\\s");//find space show only spaces
//        Pattern p= Pattern.compile("\\S");// if we use method print all the given words without except space
//        Pattern p= Pattern.compile("\\d");// d-> d stands for digits
//        Pattern p= Pattern.compile("\\D");// d-> d stants for digits except Digits non digit charactor
//        Pattern p= Pattern.compile("\\w");// w-> stands for  words alphabates and number
//        Pattern p= Pattern.compile("\\W");// Except words it shows spacial charactor including spaces
//        Pattern p= Pattern.compile("\\bTamil");// b-> Stands for boundaray -. wherever tamil start from
//        Pattern p= Pattern.compile("\\bTamil\\b");// it's meaning star with tamil and also end with tamil
//        Pattern p= Pattern.compile("Tamil\\B");// Not end with tamil -> it's mean start with tamil but not end with tamil only
//        Pattern p= Pattern.compile("\\GTamil");// grouping ->> start with tamil and again start with tami withut space //TamilTamilans
        Pattern p= Pattern.compile(".");// print all given values in string object to show everything including speacial charactor and spaces






        Matcher m=p.matcher(str);
        while(m.find()){
            System.out.println(m.group()+" Start at "+m.start());
        }
    }
}
