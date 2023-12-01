package javalangpack;
enum Dept{
    //Inside the datas are finals or constant values we can't change it anycast
    //all this datas must be capital only then only compiler idenifier not must but following this good practice
    //we know const or final values always be capital values


    //we can give values also
//    CS,IT,CIVIL,ECE;
    CS("Jasmine","Blocl :A"),IT("Saravanan","Block :B"),CIVIL("Santhos","Block:C"),ECE("Allwin","Block D");
    //if we pass more than two values we must give constructor as paramter
    String head;
    String location;

    //enum also have some other method as well as constructor
    //but constructor must be either private or default
    //it shouldn't be public or protected
    private Dept(String head,String location){
        //this constructor calles when enum is loaded, every identifier called
        this.head=head;
        this.location=location;
    }
    public  String getHeadName(){
        return head;
    }
    public String getLocation(){
        return location;
    }
    //other method can be public except constructor
  /*  public  void display(){
        System.out.println(this.name()+" "+this.ordinal());
    }*/
}
public class EnumClass {
    //Enum => Enumuration data types,we can define our own data like in classes we define our own datas

    public static void main(String[] args) {
        Dept d=Dept.CIVIL;//try with change the values
        Dept d1=Dept.CS;
//        d.display();
        System.out.println(d.head);//civil so head will be santhosh
        System.out.println(d.location);//block c
        System.out.println(d1.head);
        System.out.println(d1.location);
        //some methods for Enum

        //it will give the index of the values
//        System.out.println(d.ordinal());//civil in 2nd index
        //giving name also
//        System.out.println(d.name());

        //if it matching with enum values it will give the given values
        //it should be in upper case only
//        System.out.println(Dept.valueOf("CIVIL"));//if it's there it will give the value

        //array of all the values
        //all the enum values are stored inside the array
//         Dept[] list =Dept.values();
//         for(Dept x:list){
//             System.out.println(x);
//         }

        //Enum also usefull for switch cases


        /*switch (d){
            case CS :
                System.out.println("Head :Jasmine\n Block :A");
                break;
            case IT:
                System.out.println("Head :Saravanan\nBlock :B");
                break;
            case ECE:
                System.out.println("Head:Allwin\nBlock :c");
                break;
            case CIVIL:
                System.out.println("Head :Santhosh \nBlock :D");
                break;
        }*/
    }
}
