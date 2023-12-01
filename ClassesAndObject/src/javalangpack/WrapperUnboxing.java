package javalangpack;

public class WrapperUnboxing {
    public static void main(String[] args) {
        int i=15;
//        Integer i1=Integer.valueOf(10);
//        Integer i2=i;
//        System.out.println(i2.equals(i));//true
//        Integer i3=15;
//        System.out.println(i2.equals(i3));//true
        //String type Integer
        Integer i2=Integer.valueOf("123");//decimal we don't need to radix type we can give it as String
        Integer i3=Integer.valueOf("a7",16);//hexa decimal atof and 0 to 9 total=16;
        Integer i4=Integer.valueOf("1010",2);//binary 0 and 1
        System.out.println("Decimal :"+i2);
        System.out.println("Hexa Decimal :"+i3);
        System.out.println("Binary  :"+i4);
        String s="120";
        //Converting String into  int
        System.out.println(Integer.parseInt(s));//it's same as valueof("String")
        System.out.println(Integer.parseInt("23"));
        System.out.println(Integer.sum(i2,i3));
        //converting integer into binary
        System.out.println(Integer.toBinaryString(40));



    }
}
