package databases.excercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DataDefinitionLanguage {
    public static void main(String[] args) throws Exception{
        //create or drop
        Class.forName("org.sqlite.JDBC");
        Connection con= DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ");
        Statement stm=con.createStatement();

        //create table for employee
        stm.executeUpdate("create table emp(id integer primary key,name text)");

        stm.close();
        con.close();
    }
}
