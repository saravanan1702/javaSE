package operators_and_expersion.udemy;

public class CountCharactor {
    public static void main(String[] args) {
        String str="Saravanan";
        int count;
//        str.toLowerCase();
//        int count =0;
////        char[] c=str.toCharArray();
//        for(int i=0;i<str.length();i++){
//             if(str.charAt(i)!=' '){
//                 count++;
//            }
//        }
//        System.out.println("Total Length of The String is :"+count);

          for(int i=0;i<str.length();i++){
              if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u');

              System.out.println("Vowels in the String  :"+" "+str.charAt(i));

          }


    }
}
