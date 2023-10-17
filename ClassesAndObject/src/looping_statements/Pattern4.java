package looping_statements;

public class Pattern4 {
    public static void main(String[] args) {
        /*
        *******
        *     *
        *     *
        *     *
        *******
         */
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                if(i==j){
                    System.out.print("*");
                }
                else {
                    System.out.println(" ");
                }
                System.out.println();
            }
        }

    }
}
