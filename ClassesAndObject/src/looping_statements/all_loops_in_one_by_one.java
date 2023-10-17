package looping_statements;

public class all_loops_in_one_by_one {
    void while_loop(){
        int i=1;
        while(i<=10){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
    }
    void do_while(){
        int i=1;
        do {
            System.out.print(i+" ");
            i+=2;
        }while (i<=10);
        System.out.println();
    }
    void for_loop(){
        for(int i=1;i<=10;i=i+5){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[]args){

   all_loops_in_one_by_one o=new all_loops_in_one_by_one();
   o.while_loop();
   o.do_while();
   o.for_loop();

    }
}
