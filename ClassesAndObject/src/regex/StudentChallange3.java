package regex.from.udemy;

public class StudentChallange3 {
    public static void main(String[] args) {
        //Remove Extra space from string
        //Remove Extra Special charactor from String
        //find the number of words in string
    /*    String str="saravanan 1292 @#$%&";
        str=str.replaceAll("[^a-zA-z 0-9]","");//this mean except spcial charactor
//        str=str.replaceAll("[s]","M");
//        str=str.replace("a","e");*/
       /* String str="    saravanan is good boy   ";
        str=str.replaceAll("\\s","");
        System.out.println(str.trim());//we can use multiple method*/
      String str="saravanan is good boy";
      String str2[]=str.split("\\s");
        System.out.println("The number of words in the String is :"+str2.length);
    }
}
