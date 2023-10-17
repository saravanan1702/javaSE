package looping_statements;

public class ContinureAndBreak {
    public static void main(String[] args) {
     /*   int n=10;
        int i=1;
     while(i<=n){
         if(i==5){
             i++;//skip then we increase the i or otherwise it will stop the excute rest of the statements
             continue;

         }
         System.out.println(i);
         i++;


     }
        for(int i=1;i<=10;i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }*/
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
              /*  if (i == 2 && j == 2) {
                  break;
                }*/
                System.out.println(i + " " + j);
            }
        }
    }
}
