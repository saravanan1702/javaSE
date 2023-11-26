package multithreadinginjava;
class ATM {
  synchronized   void CheckBal(String name){
        System.out.println(name +" is checking balance");
      try {
          Thread.sleep(1000);
      }catch (Exception e){
          System.out.println(e);
      }
    }
   synchronized void withdraw(String name,int amt){
        System.out.print(name+" is withdrawing ");
      try {
          Thread.sleep(1000);
      }catch (Exception e){
          System.out.println(e);
      }
       System.out.println(amt);
    }
}


//instead of Thread just try runnnable interface for fun
class Customer implements Runnable{
    ATM atm;
    String name;
    int amount;
     Customer(ATM a,String name,int amount){
         atm=a;
         this.name=name;
         this.amount=amount;

     }

    @Override
    public void run() {
            atm.CheckBal(name);
            atm.withdraw(name,amount);

    }
}
class Customer2 extends Thread{
    ATM atm;
    String name;
    int amouunt;
    Customer2(ATM a,String name,int amount){
        atm=a;
        this.name=name;
        this.amouunt=amount;
    }
    void useAtm(){
        atm.CheckBal(name);
        atm.withdraw(name,amouunt);
    }
    public void run(){
        useAtm();
    }

}
public class StudentChallangefoSync {
    public static void main(String[] args) {
        ATM a=new ATM();
        Customer c1=new Customer(a,"saravananan",22200);
        //we can't create object for runnalbe interface then how to call the start method
        //pass object of the interface into thread object
        Thread t=new Thread(c1);
        t.start();
        Customer2 c2=new Customer2(a,"Jasmine",200002);
        c2.start();

    }
}
