package datandtime;
import java.util.*;
public class CalenderDemo {
    public static void main(String[] args) {
        GregorianCalendar g=new GregorianCalendar();//globally using this calender
        //gregprian calaendar is mutable we can change anything get current date or set our own data

    /*    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Year :");
        int year=sc.nextInt();
        if(g.isLeapYear(year)){
            System.out.println(year+" is leap year");
        }else{
            System.out.println(year+" is not a leap year");
        }*/
        /*System.out.println(g.isLeapYear(2020));
        //getting data //we need to pass some field and those fileds are availalbe in calender
        System.out.println(g.get(Calendar.DATE));//getting today date
        System.out.println(g.get(Calendar.MONTH));//getting this Month
        System.out.println(g.get(Calendar.DAY_OF_YEAR));
        System.out.println(g.get(Calendar.MINUTE));*/

        //Time zone
        g.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));// changing time zone

        TimeZone tz=g.getTimeZone();//we can't create time zone we get time zone with gerorian calender
//        System.out.println(tz);//give some information about where you can see the name of this time zone
        System.out.println(tz.getDisplayName());//indian standard time
        System.out.println(tz.getID());//indian standard time




    }
}
