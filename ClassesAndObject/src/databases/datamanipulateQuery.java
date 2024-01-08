package databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class datamanipulateQuery {
    public static void main(String[] args) throws  Exception{
        Class.forName("org.sqlite.JDBC");
        Connection con= DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ");
        Statement stm=con.createStatement();

        //Students
      ResultSet rs=stm.executeQuery("select * from students join dept on students.deptno=dept.deptno");

        //dept
//        ResultSet rs=stm.executeQuery("select * from dept");

        while(rs.next()){
            //Students with dept(join) table
            System.out.print(rs.getInt("rollno")+" ");
            System.out.print(rs.getString("name")+" ");
            System.out.print(rs.getString("city")+" ");
            System.out.print(rs.getInt("deptno")+" ");
            System.out.print(rs.getInt("deptno")+" ");
            System.out.println(rs.getString("dname")+" ");

          //Department
         /*   System.out.print(rs.getInt("deptno")+" ");
            System.out.println(rs.getString("dname")+" ");*/
        }
        stm.close();
        rs.close();
        con.close();

    }
}
