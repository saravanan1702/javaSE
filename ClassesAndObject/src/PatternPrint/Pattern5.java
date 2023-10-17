package forlooppracticeandpatternprinting_udemy;

public class Pattern5 {
    public static void main(String[] args) {
        int count=0;
        int n=5;
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
//                System.out.printf(++count +" ");//print with space to see clearly
                System.out.printf("%02d ",++count);
            }
            System.out.println();//next line
        }
    }
}
