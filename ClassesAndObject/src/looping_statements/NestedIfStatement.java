package looping_statements;

public class NestedIfStatement {
    public static void main(String[] args) {
        String address="Delhi,India";
        if(address.endsWith("India")){
            if(address.contains("Goa")){
                System.out.println("You are Live in Goa");
            }
            else if(address.contains("Murat ")){
                System.out.println("You are Live in murat");
            }else {
                System.out.println("You are live in :"+address.split(",")[0]);
            }

        }
        else {
            System.out.println("You are Not Live in India");
        }
    }
}
