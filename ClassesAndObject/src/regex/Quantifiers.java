package regex.from.udemy;

import java.util.Locale;

/*Regular Expression     Describtion
1.*                     zero or more times present in string
2.+                     one or more times present in string
3.?                     zero or one time
4.{ x }                 x times
5.{x,y}                 between x and y times*/
public class Quantifiers {
    public static void main(String[] args) {
        String str="Saravanan1702.@gmail.com";
//        System.out.println(str.matches(".*"));
//        System.out.println(str.matches("[abc]{2}"));
//        System.out.println(str.matches("[abc]{1,2}"));//there must be exatly three letter
//        System.out.println(str.matches(".*gmail.*"));
        System.out.println(str.matches("\\w*@gmail(.*)"));//any alphates or number
    }
}
