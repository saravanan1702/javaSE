package regex.from.udemy;
//      Qustion is ;
//      1.find if a number is binary or not
//      2.find if a number is hexadecimal or not
//      3.find the number is data or not
public class StudentChallange2 {
    public static void main(String[] args) {

        String str1="010101";
        //another method int =010101 => string str=string.valueOf(int)
        String str2="03453AE";
        String str3=("17/02/2022");
        System.out.println("str 1 is this binary number :"+str1.matches("[01]+"));
        System.out.println("Str 2 is this Hexa Decimal Number :"+str2.matches("[0-7A-F]*"));
        System.out.println("str 3 is this Date :"+str3.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
    }
}
