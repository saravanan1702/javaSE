package databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DDL {
    public static void main(String[] args)throws Exception {
        //Data Definition Language
        Class.forName("org.sqlite.JDBC");
        Connection con= DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ");
        Statement stm=con.createStatement();//just statement not prepared statement

        //create new table
//        stm.executeUpdate("create table temp(a integer,b float)");

        //Drop the table
        stm.executeUpdate("drop table temp");

        stm.close();
        con.close();
    }
}
