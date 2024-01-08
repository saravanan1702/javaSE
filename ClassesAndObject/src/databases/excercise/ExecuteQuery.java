package databases.excercise;

import java.sql.*;

public class ExecuteQuery {
    public static void main(String[] args) throws Exception{
        Class.forName("org.sqlite.JDBC");
        Connection con= DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ");
        Statement stm=con.createStatement();
        ResultSet rs=stm.executeQuery("select * from emp");
        while(rs.next()){
            System.out.print(rs.getInt("id")+" ");
            System.out.println(rs.getString("name")+" ");
        }
        rs.close();
        stm.close();
        con.close();
    }
}
