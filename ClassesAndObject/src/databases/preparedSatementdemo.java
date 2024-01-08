package databases;

import java.sql.*;
import java.util.Scanner;

public class preparedSatementdemo {
    public static void main(String[] args) throws Exception{
     Class.forName("org.sqlite.JDBC");//invoking a drivere
        Connection con= DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ");//establilsh the connection
        //Create the statements
        PreparedStatement stm=con.prepareStatement("select * from students where deptno=?");
        //read deptno from the keyboard

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Department No :");
        int dno=sc.nextInt();
        stm.setInt(1,dno);//1st one is parameter index 

        //Result set
        ResultSet rs=stm.executeQuery();

        while(rs.next()){
            System.out.print(rs.getInt("rollno")+" ");
            System.out.print(rs.getString("name")+" ");
            System.out.print(rs.getString("city")+" ");
            System.out.println(rs.getInt("deptno")+" ");
        }
        stm.close();
        rs.close();

    }
}
