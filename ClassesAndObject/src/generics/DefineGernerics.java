package generics;

//**************Class DATA***********************
/*class Data<T>{
    //declare only one memeber
    private T obj;//assign Data it will get any type of Data
    public void setObj(T v){ //set Data
        obj=v;
    }
    public T getObj(){//retrive the data
        return obj;
    }
}*/

//**************Class ARRAY***********************
@SuppressWarnings("unchecked")
class MyArray<T>{
    //the reason for warning we are converting object into generics
    //we can't directl assign array object we need to type cast
//    T a[]=new T[10];
    T[] a =(T[]) new Object[10];
    int length=0;
    public void append(T v){
        //store it 0th position then increment as well
        a[length++]=v;

    }
    public void display(){
        //for each loop
        //the reason we already declare the size of array if we didn't fill the size it will store rest of the sizes in zero
        //so it'd better to use for loop
       /* for(T x:a){
            System.out.print(x+" ");
        }*/
        //it will print elements which is we assigned in the array
        for(int i=0;i<length;i++){
            System.out.print(a[i]+" ");
        }
    }



}
public class DefineGernerics {
    public static void main(String[] args) {

        /*Data<Integer>d=new Data<>();
        d.setObj(10);
        System.out.println(d.getObj());*/
        MyArray<Integer>ma=new MyArray<>();
        ma.append(10);
        ma.append(20);
        ma.append(30);
        ma.display();

    }
}
