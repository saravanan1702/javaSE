package regex.from.udemy;
//Regular Expression -Regular Experssion defined for pattern and strings
//we can define a pattern whether the string is match or not
//Regular Expression find the given string wheather match or not by using help of matcher class
/*Regular Exprssion Sign     Describtion
1. .                        AnyCharactor
2.[abc]                     Excatly Given number
3.[abc][zb]                 either first or second set
4.[^abc]                    except abc (given Charactor)
5.[a-z0-9]                 it would be a-z or 0-9
6.A|B                      either a or b
7.xz                       exactly the given string*/
public class RegexExampleFromUdemy {
    public static void main(String[] args) {
//        String str="a";//
//        String str="a";
//        String str="t";
//        String str="9";
        String str="B";
//        System.out.println(str.matches("."));//Any charactor(only charactor)
//        System.out.println(str.matches("[abc]"));//true //anyone is present in string either a or b or c
//        System.out.println(str.matches("[^abc]"));//true //anyone is present except this charactor
//        System.out.println(str.matches("[a-z0-9]"));//true //anyone is present except this charactor
//        System.out.println(str.matches("[a-z0-9]"));//true //anyone is present except this charactor
        System.out.println(str.matches("A|B"));//true // any one either a or b

    }
}
