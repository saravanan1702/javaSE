package datandtime;
import java.util.*;
import java.time.*;
import java.time.temporal.*;
public class DateOtherclassesZoneandTime {

    //just demo for real world project
  static   void productExp(){
        Period p=Period.of(3,1,1);
        System.out.println("Product Expired in :"+p.addTo(LocalDateTime.now()));
    }
    public static void main(String[] args) {
 /*   OffsetDateTime odt=OffsetDateTime.now();
        System.out.println(odt);*/
        /*ZonedDateTime zdt=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(zdt);*/

       /* MonthDay m=MonthDay.now();//it doesn't show any year
        System.out.println(m);
        System.out.println(m.getDayOfMonth());*/

        //Period
        /*Period p=Period.of(2,3,10); //this is about period of year
        System.out.println(p.addTo(LocalDateTime.now()));
        productExp();//method calling*/

        //Instant
        Instant i=Instant.now();
        System.out.println(i);//show greenwich mean time (GMT)




    }
}
