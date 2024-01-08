package databases.excercise;

import java.sql.*;
import java.util.Scanner;

public class DataManipulateLanguage {
    public static void main(String[] args)throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection con= DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ");
        PreparedStatement stm=con.prepareStatement("insert into emp values(?,?)");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee Data :");
        int id=sc.nextInt();
        String name=sc.next();
        stm.setInt(1,id);
        stm.setString(2,name);
        stm.executeUpdate();

        stm.close();
        con.close();

    }
}
