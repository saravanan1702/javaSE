package operators_and_expersion.udemy;

public class printfandprinln {
    public static void main(String[] args) {
        int a=10;
        float b=10.f;
        String str="Meow";
        System.out.println("A :"+a);
        System.out.print(b);
        //ln mean -> we print the statement with next line
        //normal print -> mean print this statement in stright line
        //if we use printf method to print our statement we can use speicifier to print the statement

        System.out.printf(" A :%d :B :%.02f",a,b);
        System.out.printf("String :%s",str);

    }
}
