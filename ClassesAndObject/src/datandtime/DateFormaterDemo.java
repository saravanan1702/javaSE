package datandtime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.*;
import java.time.temporal.*;
import java.time.format.*;
public class DateFormaterDemo {
    //changing date and time format as we wish
    public static void main(String[] args) {
//        LocalDateTime d=LocalDateTime.now();//since it's local date and time it doesn't contain any zonedatetiem or zoneid we have to choose another class for getting zone information
      /*  ZonedDateTime zdt=ZonedDateTime.now();
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss  z Z");

        System.out.println(df.format(zdt));*/

        //Chrono Field

        LocalDateTime d=LocalDateTime.now();
        System.out.println(d.get(ChronoField.AMPM_OF_DAY)); //PM 1 AM 0
        System.out.println(d.get(ChronoField.YEAR));

        //String templet Literal
        /*int age=23;
        String name="Saravanan";
        float height=6.2f;
        System.out.println(STR."Hi my name is \{name} and my age is \{age} and my height is \{height}");*/
    }
}
