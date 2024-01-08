package databases;

import java.sql.*;
import java.util.Scanner;

public class DmlQuery {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");

        Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ");
//        Statement stm = con.createStatement();

        //update Query
//        stm.executeUpdate("insert into dept values (60,'Chem')");//inserting new row to dept table
//        stm.executeUpdate("insert into dept values (70,'Arts')");//inserting new row to dept table
//        stm.executeUpdate("delete from dept where deptno>50");//deleting rows which is face this condition
//        stm.executeUpdate("update dept set dname='Chem' where dname='Aero' ");//updating rows which is face this condition


        //********** INSERTING TABLE USING PREPARED STATEMETN ***************

        PreparedStatement stm=con.prepareStatement("insert into students values(?,?,?,?)");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Roll No :");
        int roll=sc.nextInt();
        stm.setInt(1,roll);//index position then column name
        System.out.println("Enter The Name :");
        String name=sc.next();
        stm.setString(2,name);
        System.out.println("Enter the city ");
        String city=sc.next();
        stm.setString(3,city);
        System.out.println("Enter the Dept No :");
        int deptno=sc.nextInt();
        stm.setInt(4,deptno);

        stm.executeUpdate();//we can't say execute query we can update the query because it's dml query




        stm.close();
        con.close();

    }
}
