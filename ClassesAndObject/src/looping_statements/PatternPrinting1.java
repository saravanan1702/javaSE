package looping_statements;

public class PatternPrinting1 {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++){
            for(j=i;j>=5;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
