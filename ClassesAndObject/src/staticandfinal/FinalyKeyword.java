package staticandfinal;
/*======FINAL KEYWORD=====
* 1.final variable can't be modified it's fixed
* 2.final method can't be override to inherited class it's restricted
* 3.final class can't be extent to sub class we can create object and use them but can't inherited
*
*==HINTS===
* 1.final variable name must be capital letter it's notation for java loaders
* 2.we can't change the final values with object creation or instance (directly)change unlike sttaic*/
final class FinalTask
{
    final int MIN=1;  //1st method initialize values directly
    static final String NAME;
    final int MAX;
    //we can assign final variable values with 3 methods
    //2nd static block
    static
    {
        NAME="Inda";
    }

    //3rd Constructor
    FinalTask(){

        MAX=10;
    }
    final  void dis(){
        System.out.println("name :"+NAME);
        System.out.println("MAX  :"+MAX);
        System.out.println("MIN  :"+MIN);

    }

}
class TestMy //final class can't inherited
{
    void dis(){
        System.out.println("Test method");
    }
}
public class FinalyKeyword {
    public static void main(String[] args) {
        FinalTask f=new FinalTask();
        f.dis();

    }
}
