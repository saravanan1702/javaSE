package regex.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegrexDemo {
    public static void main(String[] args) {
        //Regex --> it's full form regular expression
        // pattern -> it representation of Regular Expression
        // Matcher -> it intrepertor of pattern
        //PatternsyntaxException -> handling error

        String str="Saravanan is good boy Saravanan is score  Sara good in Computer Science 62001 !@#$%^&*()";
//        Pattern p=Pattern.compile("Saravanan");//given expression to find the expression
//        Pattern p=Pattern.compile("Sara");//given expression to find the expression
//        Pattern p=Pattern.compile("s");//given expression to find the expression
//        Pattern p=Pattern.compile("^Saravanan");//if given String start with
//        Pattern p=Pattern.compile("Science$");//if we want to print the given string contrain in end we can use $simple
//        Pattern p=Pattern.compile("a|b");//find the charactor whether a or b
//        Pattern p=Pattern.compile("[abc]");//the given expression contrain abc
//        Pattern p=Pattern.compile("[SVC]");//the given string constrain expect abc
//        Pattern p=Pat♦tern.compile("[^abc]");//the given string neither of the constrains// except these letter
//
//        Pattern p=Pattern.compile("[a-z]");// the given string contain only small letters
//        Pattern p=Pattern.compile("[A-Z]");// the given string contain only Caps letters
//        Pattern p=Pattern.compile("[a-z a-z]");// the given string contain only small letters and caps both constrins
//        Pattern p=Pattern.compile("[a-z]");// the given string contain only small letters
//        Pattern p=Pattern.compile("[0-9]");// the given string contain only numericals
     //hint =[] with in the square bracet called group
//        Pattern p=Pattern.compile("[a-z A-z 0-9]");// the given string contrains all alphates and numerics
        Pattern p=Pattern.compile("[^a-z A-z 0-9]");// the given string constrains except alphapates numerics only special charactors




        Matcher m=p.matcher(str);//creating mathcer object to wheather given string contain or not
        while(m.find()){
            System.out.println(m.group()+" Start at "+m.start());
            //also we can use m.end()// method
        }
    }
}
