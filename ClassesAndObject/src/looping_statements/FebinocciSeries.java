package looping_statements;

public class FebinocciSeries {
    public static void main(String[] args) {
        //febinacci series -> 5 => 0 1 1 2 3 5
        //feb formula=> fib(n)=fib(n-2)+fib(n-2)
                        //    =>0          1     1
                        //    =>1
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b+" ");
        for (int i =0; i <= 10-2; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
          /*  if(c==13){
             break;
            }*/

        }
    }
}
