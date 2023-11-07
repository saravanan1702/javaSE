package forlooppracticeandpatternprinting_udemy;

public class Pattern1 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=5;i++){//i=>denoted how many rows we want
            for(int j=1;j<=5;j++){//j=>denoted how many columns we want
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
