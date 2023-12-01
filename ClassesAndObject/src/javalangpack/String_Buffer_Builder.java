package javalangpack;

public class String_Buffer_Builder {
    public static void main(String[] args) {
        String s1=new String("Hello");
        StringBuffer s2=new StringBuffer("Hello");
        StringBuilder s3=new StringBuilder("Hello");

        //String is immutalbe and we can only cancate
        s1.concat("World");//it won't modify it will give another String object
        //String buffer and String builder is mutable
        //String buffer is Thread safe and builder not Thread safe
        //String buffer is slow because of Syncharization and String builder is fast
        s2.append("World");
        s3.append("World");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
