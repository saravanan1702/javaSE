package forlooppracticeandpatternprinting_udemy;

public class Pattern10 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= i; j++) {
//                System.out.print(j+" ");
                if (i<=j)//(j>=i) both are same
                {
                    System.out.print("* ");
                }
                else {
                    System.out.print(" ");
                }
            }
//            System.out.println("");

            }
//            System.out.println();
        }
    }

