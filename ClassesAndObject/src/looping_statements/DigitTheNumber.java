package looping_statements;

public class DigitTheNumber {
    public static void main(String[] args) {
        //print the digits of the number
        //example =>257 =>  2 5 7
        int reminder=0;
        int n=257;
        while(n>0){
            reminder=n%10;//257 =>257%=7 reminder  25%10=> we get 5 2%10=2;
            n=n/10; //257/10=we get 25 now n is 25 //25/10=> we get 2 now n is 2 0 now n is zero loop wil break beacuse it is false
            System.out.println("the digits of number :"+reminder);
        }
    }
}
