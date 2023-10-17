package looping_statements;

public class Pattern1 {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){ //1 2 (2<=3) true  3(3<=3) true
            for(int j=1;j<=5;j++){ //1 2  3 4 5 (i=1)(i=2)(i=3)
                System.out.print(i+" ");
            }//next line
            System.out.println("");
        }//break and code into for loop (i)
    }
}
