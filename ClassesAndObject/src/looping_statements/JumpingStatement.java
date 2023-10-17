package looping_statements;

public class JumpingStatement {
    void break_statement(){
        int i=5;
        while(i<=10){
            System.out.print(i+" ");
            if(i==5){
                break;
            }
            i++;
        }
    }
    void continue_statement(){
        int i=1;
        do {
            System.out.print(i+" ");
            if(i==8){
                continue;
            }
            i++;
        }while(i<=10);
    }
    public static void main(String []args){
        JumpingStatement j=new JumpingStatement();
        j.break_statement();
        j.continue_statement();

    }
}
