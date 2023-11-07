package forlooppracticeandpatternprinting_udemy;

public class Pattern14 {
    public static void main(String[] args) {
        int line=5;
        for(int i=5;i>=1;i--){
            for(int s=1;s<=5-i;s++){
                System.out.print("  ");
            }
            for (int k=1;k<=i*2-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
