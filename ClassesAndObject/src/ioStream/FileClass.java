package ioStream;
import  java.io.*;
public class FileClass {
    public static void main(String[] args) throws IOException{
        /*
      File f=new File("E:/Udemy/Java");
        System.out.println(f.isDirectory());//if it's directory then it will true if not it will false
        //f.list()//it will give all the list of array if want to print all the files then we must give it to string array
//        String list[]=f.list();//list of array all the files names
        //instead of taking array of String

        //we can take array of files
        File list[]=f.listFiles();//array of files
        for(File x:list){
//            System.out.println(x);//this is for array of String
//            System.out.print(x.getName()+" ");//getting name of the files
//            System.out.println(x.getPath());//getting path of the files
            System.out.println(x.getParent());//parents folder name
        }*/

        //handling each files separately
        File f=new File("E:/Udemy/Java/demo3.txt");
//        f.setReadOnly();//we set read only so we can't access 
        f.setWritable(true);
        FileOutputStream fos=new FileOutputStream("E:/Udemy/Java/demo3.txt");
//        f.lastModified();//get time for last modidifed this file



    }
}
