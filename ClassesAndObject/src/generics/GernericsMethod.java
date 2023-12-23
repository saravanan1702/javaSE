package generics;
class A{

}class B extends A{}
class C extends B{}
@SuppressWarnings("unchecked")
class MyGen01<T>{
    T[] arr =(T[]) new Object[10];

    int length=0;
    public void append(T val){
        arr[length]=val;
        length++;
    }
    public void display(){
        for(int  i=0;i<length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
@SuppressWarnings("unchecked")
public class GernericsMethod {


    //Generic Method


                      //E[] list instead of we can use varargs method passing any type of method
/*    static <E> void show(E...list){//instead of writing T use E for elements for giving appropiate name
        for(E x:list){
            System.out.println(x);
        }
    }*/

    //we can define bounds type also

/*    static <E extends Number> void show(E...list){//instead of writing T use E for elements for giving appropiate name
        for(E x:list){
            System.out.println(x);
        }
    }*/

    //WildCard

    //it will work without ? mark generics (MyGen01 obj)

    //Upper bounds => if use extends it mean upper bounds
    //lowe bounds =>if we use super keyword it means lower bounds
   /* static void fun(MyGen01<?> obj){//? it's mean wild card accept any type of array just like MyGen01
        obj.display();
    }*/
    //Upper bounds
   /* static void fun(MyGen01<? extends  Number> obj){//? it's mean wild card accept any type of array just like MyGen01
        obj.display();
    }*/

    //Lower Bounds
    static void fun(MyGen01<? super   C> obj){//? it's mean wild card accept any type of array just like MyGen01
        obj.display();
    }
    public static void main(String[] args) {
       /* show(new String[]{"Hi","Hello","Welcome"});//array of Strings
        show(new Integer[]{1,2,3,4,5,6});*/
        //now show work any type of array
//        show("Hello","Saravanan");//since we use bounds type so String values can't store we say that only allow to store Numbers
/*        show(1,2,3,4,5,6,7);
        show(11.3f,12.5f,100.5f);//float float also Number*/
        /*MyGen01 mg1=new MyGen01();
        mg1.append("Hello");
        mg1.append("hi");
        MyGen01 mg2=new MyGen01();
        mg2.append(12);
        mg2.append(20);
        mg2.append(30);
        fun(mg1);//calling function
        fun(mg2);//calling function*/

        //lower bounds
        MyGen01<B> mg1=new MyGen01<>();

        MyGen01 <A>mg2=new MyGen01<>();
        fun(mg1);


    }
}
