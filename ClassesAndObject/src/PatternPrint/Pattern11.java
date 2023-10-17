package forlooppracticeandpatternprinting_udemy;

public class Pattern11 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=n;j++){
                if(i+j>5){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i<=j){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
