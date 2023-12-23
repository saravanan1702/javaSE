package generics;

public class GenericsDemo<T> {
    T[] data = (T[]) new Object[3];

    //creating generic Array
    public static void main(String[] args) {
        GenericsDemo<String> d = new GenericsDemo<>();
        d.data[0] = "Hi";
        d.data[1] = "Hello";
//     d.data[2]=12;//shows compile time error it  won't allow to write integer because we mentioned we store only Strings
        //and another benefits of generic we don't need to type casting
        String str = d.data[0];
    }
}
