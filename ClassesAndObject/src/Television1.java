import java.util.Scanner;

class TelevisionTask {
    Scanner sc=new Scanner(System.in);
    //properties
    String brand_name;
    String tv_inch;
    String varients;
    int channel_no;
    int volume;

    //method
    public void switch_on(){
        System.out.println("Tv is ON");
    }
    public void switch_off(){
        System.out.println("Tv is OFF");
    }
    public  int channlNo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter The channel you want to change");
        int ch=sc.nextInt();
        return ch;

    }
    public  int channelVal(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Valume level that you want :");
        int val=sc.nextInt();
        return val;
    }
    public String input(){
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Input Type :");
        String ip=sc.next();
        if(ip.equals("html")){
            return ("html");
        } else if (ip.equals("av")) {
            return ("av");

        }
        else {
            return ("Default port");
        }
    }

}

public class Television1 {
    public static void main(String[] args) {
        TelevisionTask t=new TelevisionTask();
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter Tv Brand :");
        t.brand_name= sc.next();
        System.out.println("Enter Tv inch :");
        t.tv_inch= sc.next();
        System.out.println("Enter the Varient of Tv :");
        t.varients= sc.next();
        System.out.println("Enter The current Channel No :");
        t.channel_no= sc.nextInt();
        System.out.println("Enter The Current Valume of The Tv :");
        t.volume=sc.nextInt();
        t.switch_on();
        t.switch_off();
        System.out.println("-------------------------------------");
        System.out.println("Previous Channel No :"+t.channel_no);
        System.out.println("Channel changed to :"+t.channlNo());
        System.out.println("-------------------------------------");
        System.out.println("Previous valuem :"+t.volume);
        System.out.println("Channel Valume curretnly :"+t.channelVal());
    }
}
