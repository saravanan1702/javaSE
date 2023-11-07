package forlooppracticeandpatternprinting_udemy;

public class fullDiamontProblem {
    public static void main(String[] args) {
        //upper triangle
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print("  ");//spaces
            }
            for (int k=1;k<=i*2-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=5;i>=1;i--){//reducing line
            for(int j=1;j<=5-i;j++){
                System.out.print("  ");
            }
            for (int k=1;k<=i*2-1;k++){
                System.out.print("* ");
            }
            System.out.println();//nextline
        }

    }
}
