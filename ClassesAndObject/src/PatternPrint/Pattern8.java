package forlooppracticeandpatternprinting_udemy;

public class Pattern8 {
    public static void main(String[] args) {
        int n=5;
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
//                System.out.print(j+" ");//we can use star also
//                System.out.print("*"+ " ");
                System.out.print(i+" ");//only print (i)
//                System.out.printf("%02d ",++count);
            }
            System.out.println();
        }
    }
}
