package forlooppracticeandpatternprinting_udemy;

public class Pattern7 {
    public static void main(String[] args) {
        int n=5;
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){//count will be increase untill less or equal to i
                System.out.printf("%02d ",++count);//we can print * also either we want
            }
            System.out.println();
        }
    }
}
