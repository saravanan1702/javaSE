package RelationAndOperators;

public class Relational_operators_Practices {
    public static void main(String[] args) {
        //this  is logical operators
     /*   && both conditional are true
        || either one conditional true
        !  if opposite of true
       int num_1=5;
       int num_2=10;
        System.out.println(num_1>num_2);// number 1 is lesser than number 2 so this is false statementt
        System.out.println(num_1<num_2);//num 1=5,num 2=10 ==> number one is lesser than number 2 so it's true statement
        System.out.println(!(num_2>num_1));//actually it's true statement but we use not  so this return false
*/

        //Relational operators  => this is mean relation between two statement
     /*   System.out.println(a>b);// 10 >30 =>false
        System.out.println(a<b);//10 < 30 => true
        System.out.println(a<c);// 10<40 => true
        System.out.println(b<c); // 30<40 => true
        System.out.println(a==x);//10==10 =>true
        System.out.println(a>=x);// 10>=10 it means a greater  than x or equal to x =>correct it gives true
        System.out.println(a!=b);//10!=20 => yeah it's correct both are different =>true*/
     // now try to solve which is bigger number in if else statement
//        if(a>b){
//            System.out.println(a+" is bigger number");
//        } else if (b>c) {
//            System.out.println(b+" is bigger Number ");
//
//        }else {
//            System.out.println(c+" is bigger number");
//        }
        //Now combine with both statement
        // Relational operators and logical  operators
        int a=10;
        int b=33;
        int c=4;
        int x=10;
        System.out.println((a>b)&&(a<b));//&& mean both are true it gives true or it will be false
        System.out.println((a<b)&& (a<=x));//
        System.out.println(!(a<b&& a<=x));//inside the condition is true but be assing not  symbol in front so it gives false even thought it's true
        System.out.println((a==x)|| (a>b));// || mean either one is true it gives true
    }
}
