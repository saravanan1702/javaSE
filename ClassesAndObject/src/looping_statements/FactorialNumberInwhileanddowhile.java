package looping_statements;

public class FactorialNumberInwhileanddowhile {
    public static void main(String[] args) {
  /*      int i=1,fact=1;
        int n=4;
        for(;i<=4;){// all of them inside the for loop they are optional but we should initial first
            fact=fact*i;
            i++;
        }
        System.out.println("the Factorial of 4 is : " + fact);
    }*/
//    int i=1;
//    int j=i;
//    int fact1=1;
//    while(j<=5){
//        fact1*=j;
//        j+=1;
//    }
//        System.out.println("the factorial of the number is : "+fact1);
        int x=1;
        int k=x;
        int $fact=1;

        do{
            $fact*=k;
            k=k+1;
        }while (k<=5);
        System.out.println("the sum of  5 is :"+$fact);
    }
}
