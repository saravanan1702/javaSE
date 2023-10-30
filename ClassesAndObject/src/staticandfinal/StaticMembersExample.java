package staticandfinal;
class HondaCity
{
    static long price=10;
    int x=20;
    int y=30;
    static double onRoadPrice(String city)
    {
        switch (city)
        {
            case "delhi":
            return price+price*0.10;//(100%) =>10% (o.10)
            case "mumbai":
                return price+price*0.09; //9% tax
            case "tamilnadu":
                return price+price*0.20;
            default:
                return price;
        }

    }
}
public class StaticMembersExample {
    public static void main(String[] args) {
       HondaCity h1=new HondaCity();
        System.out.println("Honda city price :"+h1.onRoadPrice("tamilnadu"));
        //we can call this method with class name
        System.out.println("Honda city On Road Price is :"+HondaCity.onRoadPrice("mumbai"));
        System.out.println("honda city price :"+h1.price);
        System.out.println("Accessing non static members :"+h1.x+" "+h1.y);
        //if we modify the price of static it will be changed all the object which is created with class name
        h1.price=20;
        HondaCity h2=new HondaCity();
        System.out.println("On Road Price is :"+h2.price);//20
    }
}
