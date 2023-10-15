import java.util.Scanner;

class Television{
    private  int channel;
    private int valume;
    public void changeChannel(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The channal no :");
        int number=sc.nextInt();
        System.out.println("Channal changed to "+number);
    }
    public void  changeValume(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Valume Level :");
        int level=sc.nextInt();
        System.out.println("valume level :"+level);

    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getValume() {
        return valume;
    }

    public void setValume(int valume) {
        this.valume = valume;
    }
}
public class TelevisionForExample {
    public static void main(String[] args) {
        Television t=new Television();
        t.changeChannel();
        t.changeValume();
        Television t2=new Television();
        t2.changeValume();
        t2.changeChannel();
        t.setValume(32);
        t.setChannel(300);
        System.out.println("Channel No is :"+t.getChannel());
        System.out.println("Valume level is :"+t.getValume());

    }
}
