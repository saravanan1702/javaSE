package looping_statements;

public class Reverse_a_Number {
    public static void main(String[] args) {
        int rem=0;
        int rev=0;
        int n=1234;
        int m=n;//because n become zero when we divie
        while(n>0){
           rem=n%10;
            rev=(rev*10)+rem;
            n/=10;

        }
        System.out.println(m+" The Reverse a Number :" +rev);
    }
}
