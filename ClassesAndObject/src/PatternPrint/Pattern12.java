package forlooppracticeandpatternprinting_udemy;

public class Pattern12 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i<=j){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
                for(int k=1;k<=i;k++){
                    System.out.print("* ");
                }
            }
        }
        System.out.println();
    }
}
