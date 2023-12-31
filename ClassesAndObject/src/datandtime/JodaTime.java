package datandtime;
import java.util.*;
import java.time.*;
import java.time.temporal.*;
public class JodaTime {
    public static void main(String[] args) {
        /*Date d=new Date();//able to modify this object because this is mutable
        //set
        d.setHours(21);
        System.out.println(d);
         //===========Local Date=================
*/
//        LocalDate d=LocalDate.now();
//        LocalDate d=LocalDate.now(ZoneId.of("Asia/Kolkata"));//getting date with zone id
//        LocalDate d=LocalDate.of(2022,11,12);//getting specific date
        //HINTS : we can't create date with new create we can't create date we just follow the date
        //date can changes everyday it already exists and we can just use it

//        LocalDate d=LocalDate.ofEpochDay(1);//Epoch Day mean starting year of java 1970 from how many days we passed
       /* LocalDate d=LocalDate.parse("2023-12-17");//String format
        //Method available in date
        LocalDate d1=d.plusMonths(5);//it doesn't modified untill we give new Object
        System.out.println(d1);*/


        //===========Local Time=================


       /* LocalTime t=LocalTime.now();
        System.out.println(t);
        LocalTime t1=t.minusHours(3);//again we create separate object for modified this one because this is mutable
        System.out.println(t1);*/

        //===========Local Date and Time=================
        LocalDateTime d=LocalDateTime.now();
        System.out.println(d);//printing date and time together
        System.out.println(d.getDayOfMonth());
        System.out.println(d.getHour());
        System.out.println(d.getDayOfWeek());






    }
}
