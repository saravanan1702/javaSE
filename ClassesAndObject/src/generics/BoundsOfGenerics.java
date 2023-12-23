package generics;

@SuppressWarnings("unchecked")
//class MyGen<T extends Number> //Bounds type method it will allow to write only number class float int,double so on

class MyGen<T extends Number>{
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

//SubTypes
//if child class extends parents class the class incase in generic type then child class also generics
//whatever available in parents class it will available in child class also
//if don't mentioned generics type it will work also object
//if we mentioned then it will work particular data types
/*class MyGen2 extends MyGen{

}*/

//now i mentioned data type so it will work only as String
/*class MyGen2 extends MyGen<String>{

}*/

//Bounds Types
//which is inherited only which class object  is mentioned
//Numbers =>int,float,Float,long,double,short,byte




@SuppressWarnings("unchecked")
public class BoundsOfGenerics {
    public static void main(String[] args) {
        //with parameter
//        MyGen <Integer>mg=new MyGen();

        //1.No Parameter
        //if we don't give any parameter it will work as a object
        //it will take any data types String,float ,integer
        /*MyGen mg=new MyGen();
        mg.append("hello");
        mg.append(12.3f);
        mg.append(10);
        mg.display();*/

      /*  MyGen2 mg=new MyGen2();
        mg.append("Hi");
        mg.append("Hello");
//        mg.append(12); the reason for error we mentioned,Subclass only take String data types
        mg.append("Welcome to java");
        mg.display();*/

        //Bounded type
        MyGen<Float> mg=new MyGen<>();
//        mg.append(10);
        mg.append(12.3f);
//        mg.append(1000000000);
        mg.append(12.4f);
        mg.display();

    }
}
