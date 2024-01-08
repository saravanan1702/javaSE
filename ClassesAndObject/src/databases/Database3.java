package databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database3 {
    public static void main(String[] args) throws Exception{
        Class.forName("org.sqlite.JDBC");
        Connection con= DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ");
        Statement stm=con.createStatement();
        ResultSet rs=stm.executeQuery("select * from dept");

        while (rs.next()){
            System.out.print(rs.getInt("deptno")+" | ");
            System.out.println(rs.getString("dname")+" ");
        }
        stm.close();
        rs.close();
    }
}
