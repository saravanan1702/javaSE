package regex.from.udemy;/*
Regular Expression                Describtion
\\d                                 only digits
\\D                                 except Digits(not Digits)
\\s                                  only spaces
\\S                                 Not Spaces
\\w                                Alphate or Digits
\\W                                Neighter Alphate or Digits*/
public class MetaCharactor {
    public static void main(String[] args) {
//      String str="9";
//      String str="9";
//      String str=" ";
      String str="%";

//        System.out.println(str.matches("\\d"));//it will true because d mean digits either or more
//        System.out.println(str.matches("\\D"));//it will false not digit  because D neither digit
//        System.out.println(str.matches("\\s"));//str contain only one spaces it will be true
//        System.out.println(str.matches("\\S"));//S mean there is no space in string
//        System.out.println(str.matches("\\w"));//w mean whether is digits or alphaptes contains
        System.out.println(str.matches("\\W"));//neither digits or charators

    }

}
