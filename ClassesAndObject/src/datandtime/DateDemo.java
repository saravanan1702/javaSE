package datandtime;
import java.util.*;


public class DateDemo {
    public static void main(String[] args) {

//        System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
        //divide by 1000 get sec
        //divide by 60 get minutes
        //divide by 60 get hour
        //divide by 24 get day
        //divide by 365 get year
//        System.out.println(Long.MAX_VALUE);
        Date d=new Date();//this object contain both data and time and this class runs based on millisecond pass fromm 1970
        //date is class old class we are not using this class nowadays because java provide separate api for data and time package
        //it's old class and it's deprecated when we use date's method
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getDay());
        System.out.println(d.getYear()+1900);//java year started in 1900 if we want to get correct year then we must add 1900
    }
}
