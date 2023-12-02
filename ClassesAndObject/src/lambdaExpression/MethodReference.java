package lambdaExpression;

@FunctionalInterface
interface Lambda2{

    //this display method act like println method
//    void display(String str);
//    void display(String str);
     int display(String str1,String str2);
}

public class MethodReference {
 /*   public static  void reverse(String str){
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }*/

    //constructor as a method reference
    public MethodReference(String s){
        System.out.println(s.toUpperCase());
    }



    public static void main(String[] args) {

        //lambda2 l=>Reference of Lambda2
        //static method :: Scope Resoultion
//        Lambda2 l=System.out::println;

        //         another static method assign as
        //Same reference used for calling another method
//        Lambda2 l=MethodReference::reverse;


//        Lambda2 l=MethodReference::reverse;
//        l.display("hello");
//        l.display("Hello!");//display become reverse method

        //constructor as a reference
        Lambda2 l=String::compareTo;
        //first one take as reference second one take objectd
        System.out.println(l.display("hello","hello"));
    }
}
