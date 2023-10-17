package String.method.com;

public class StringMethodInJava {
    public static void main(String[] args) {
        String str="  Saravanan  ";
        System.out.println(str.length());
        System.out.println(str.trim());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(3));
        System.out.println(str.substring(4));//starting from 4th index to end of the string
        System.out.println(str.substring(3,7));
        System.out.println(str.replace('n','m'));
        String str2="www.saravanan.org";

        System.out.println(str2.startsWith("www"));
        System.out.println(str2.endsWith("org"));
//        System.out.println(str2.startsWith(".",6));
        System.out.println(str2.indexOf('.',4));//we need to find . but not for starting from 4th index to
        System.out.println(str2.indexOf("org"));
        //same as if i want to find the . from end of the string to starting it's reverse the method to find the string
        //for Example
        System.out.println(str2.lastIndexOf('.'));//it's find the given values from last end to first i mean it find the values in reverse order
        //if we want to print the find the values we also modify the lenght which last index from to find the values
        System.out.println(str2.lastIndexOf('.',7));
        String name="Saravanan";
        String name2="saravanan";
        System.out.println(name.equals(name2));//it gives false cause name of the object Start with capital
        System.out.println(name.equalsIgnoreCase(name2));// it gives true because we check the object of the content both are same it doesn't matter whether it's caps or small but inside the content of the string are same
        //now check dictonary form
        System.out.println(name.compareTo(name2));//it gives false values because caps letter smaller than small letter by acsii vaues table
        // now try to ignore case uses
        System.out.println(name2.compareTo(name));//smaller letter ascii values greater than cap letter
        /*
        * Now learn about .equals method and '==' equal operators different
        /
         */
        //Note that -> == ->used for compare referance's the string
        //equals operots used for compare object of the string
        //Example
        String s="Java";
        String s1="Java";
        String s3=new String("Java");
        System.out.println(s.equals(s1));// it gives false because content of the object is small letter
        System.out.println(s.equalsIgnoreCase(s1));// it gives true because we compare inside the content
        System.out.println(s.equals(s3));
        System.out.println(s==s1);//different reference
        System.out.println(s==s3);//it gives false because both are different s3 objecct store in heap memory

        String a="Welcome to ";
        String b="Wonderland";
        System.out.println(a+b);//concat two string also another method
        System.out.println(a.concat(b));
        String s4="zoo";// small letters start from 95
        String s5="Zoo";//caps letter strat from 65
        System.out.println(s4.compareTo(s5));
        System.out.println(s4.compareToIgnoreCase(s5));// it gives zero both are same by ingore case
        //hint :
        //if the given number is greater than compare number it gives positive number
        // if the given number is smaller than compare number it gives negative number
        // if the given number both are same it gives zero (neither positive nor negative)
    }
}
