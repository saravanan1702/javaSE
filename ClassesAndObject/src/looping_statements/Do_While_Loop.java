package looping_statements;

public class Do_While_Loop {
    public static void main(String[] args) {
        //as we know earlier same as while loop but one differents from while loop do while loop atleast one time execute the statment whether it is false or true
        int i=2;//step 1 initial part
        System.out.println("Even Numbers :");
        do {
            //statement in block what we print
            System.out.println(i);//printing statment
            i+=2;// upadtation part 2
        }while ( i<=10);//we put semi column after this condition because we emphasize statemenmt to end of the conditon
        //condition parts 2
    }
}
