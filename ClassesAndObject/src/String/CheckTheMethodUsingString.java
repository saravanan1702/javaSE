package String.method.com;

public class CheckTheMethodUsingString {
    public static void main(String[] args) {
        String name="Mr. Saravanan";
         int l=name.length()-1;
        System.out.println(name.length());
        System.out.println(l);
        System.out.println(name);
        name=name.toLowerCase();//to convert lowercase to find the given values
//        if(name.startsWith("Mr")){
//            System.out.println("Yeah .. This is Men");
//        }
//        else {
//            System.out.println("No it's Female");
//        }
        if(name.startsWith("mr") && name.endsWith("na")){
            System.out.println("yeah.. this is saravanan here");
        } else if (name.startsWith("mr") || name.endsWith("Yum")) {
            System.out.println("Yeah .. this is men but i don't know whehter is this saravanan or someone");

        } else {
            System.out.println("No ..it'snt Saravanan");
        }
    }
}
