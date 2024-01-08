package databases;
import java.sql.*;
public class DatabaseDemo {
    public static void main(String[] args) throws Exception{
        Class.forName("org.sqlite.JDBC");

        Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ");

        Statement stm=con.createStatement();

        ResultSet rs=stm.executeQuery("select *  from students");//table


        while(rs.next()){
            System.out.print(rs.getInt("rollno")+"| ");
            System.out.print(rs.getString("name")+"| ");
            System.out.print(rs.getString("city")+"| ");//column lable
//            System.out.print(rs.getInt("deptno")+" ");//clwe can use index also 4th index
            System.out.print(rs.getInt(4)+" ");//using column index position
            System.out.println();
        }
        stm.close();
        con.close();

    }
}
