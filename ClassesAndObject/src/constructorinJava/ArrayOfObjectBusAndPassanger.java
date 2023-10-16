package constructorinJava;

import java.util.Scanner;

//create bus class
class Bus {
    private String busNo;
    private int busCapacity;
    private String busName;
    private String busRoot;

    //assign constant property for Constructor
    Bus(String busno, int busCap) {
        //we don't need to tell this key word if parameter names are differen
        busNo = busno;
        busCapacity = busCap;
    }

    //constructor overloading
    Bus(String busno, int busCap, String name, String root) {
        //we don't need to tell this key word if parameter names are differen
        busNo = busno;
        busCapacity = busCap;
        setBusRoot(root);
        setBusName(name);
    }

    //read only Property
    String getBusNo() {
        return busNo;
    }

    int getBusCapacity() {
        return busCapacity;
    }

    //read and write method
    String getBusRoot() {
        return busRoot;
    }

    String getBusName() {
        return busName;
    }

    void setBusRoot(String root) {
        busRoot = root;

    }

    void setBusName(String name) {
        busName = name;
    }

    public String toString() {
        return ("BusNo :" + busNo + "\n"
                + "BusCapacity :" + busCapacity + "\n"
                + "BusRoot :" + busRoot + "\n"
                + "BusName :" + busName);
    }

}

//now Create class for passanger
class Passanger {
    private String name;
    private int Age;
    private String mobileNo;
    private Bus[] b;
    private Members[] m;

    //Constructor
    Passanger(String name, int age, String mobno) {
        this.name = name;
        setAge(age);
        setMobileNo(mobno);
        b = new Bus[0];
        m = new Members[0];
    }

    Passanger(String name, int age, String mobno, Bus[] b,Members[] mem) {
        this.name = name;
        setAge(age);
        setMobileNo(mobno);
        this.setB(b);
        setM(mem);
    }

    //getter(read only )
    String getName() {
        return name;
    }

    //write and read
    int getAge() {
        return Age;
    }

    void setAge(int age) {
        Age = age;
    }

    String getMobileNo() {
        return mobileNo;
    }

    void setMobileNo(String mobile) {
        mobileNo = mobile;
    }

    public Bus[] getB() {
        return b;
    }

    public void setB(Bus... bus) {
        b = new Bus[bus.length];
        for (int i = 0; i < b.length; i++) {
            b[i] = bus[i];
        }


    }

    public Members[] getM() {
        return m;
    }

    public void setM(Members... mem) {
        m = new Members[mem.length];
        for (int i = 0; i < mem.length; i++) {
            m[i] = mem[i];
        }
    }

    public String toString() {
        System.out.println("Passanger Details :");
        System.out.println("Name :" + name + "\n" + "Age :" + Age + "\n" + "MobileNo :" + mobileNo + "\n");
        if (b.length == 0) {
            System.out.println("No buses");
        } else {
            for (Bus s : b) {
                System.out.println(s);
            }
        }
        if (m.length == 0) {
            System.out.println("No Members");
        } else {
            for (Members mems : m) {
                System.out.println(mems);
            }
        }
        return "";
    }
}

class Members {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
        //this.age=>it's belongs to class attributes variable,
        //age=>it's belongs to paramter age that we pass values while creatae object
    }

    Members(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public String toString() {
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
        return "";
    }

}

public class ArrayOfObjectBusAndPassanger {
    public static void main(String[] args) {
        //create array of object to bus
        //----------------BUS-----------------
    /*    Bus []buses=new Bus[2];
        buses[0]=new Bus("TN45BQ5321",40,"volvo","Trichy");
        System.out.println(buses[0]);
        System.out.println("-------------------------------------------");
        buses[1]=new Bus("TN55BA1234",20,"BMW","ChennaiToTrichy");
        System.out.println(buses[1]);*/
        //lets give values from user
      /*  Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number of Reference you want to create bus :");
        int n=sc.nextInt();
        //crate Array of object for bus
        Bus []b=new Bus[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter The Bus No");
            String busNo=sc.next();
            System.out.println("Enter The Bus Capacity");
            int cap=sc.nextInt();
            System.out.println("Enter The Bus Name :");
            String name=sc.next();
            System.out.println("Enter The Bus root :");
            String root=sc.next();
            //assign the values for array of object reference
            b[i]=new Bus(busNo,cap,name,root);

        }
        for(int i=0;i<n;i++){
            System.out.println(b[i]);
        }
        System.out.println();*/
        //----------------PASSANGERS-----------------
        Bus[] b = new Bus[1];
        b[0] = new Bus("12AFB", 20, "volvo", "TrichyToCheanni");
//        Passanger p = new Passanger("Jasmine", 23, "9095791415", b);
//        System.out.println(p);



        //----------------MEMBERS----------------
        /*Members m=new Members("Saravanan",12);
        System.out.println(m);*/
        //create ArrayofObject to Member Class
        Members[] m = new Members[2];
//        int c = 1;
        m[0] = new Members("Allwin", 19);
        m[1] = new Members("Divya", 32);
     /*   for (int i = 0; i < m.length; i++) {
//            System.out.println("Passanger :" + c);
            System.out.println(m[i]);
//            c += 1;//to count no of passanger
        }*/
        //object create for passanger
        Passanger p1=new Passanger("Jasmine",23,"9095791515",b,m);
        System.out.println(p1);

    }
}
