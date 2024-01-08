import java.sql.*;
class database2{
	public static void main(String args[])throws Exception{
		Class.forName("org.sqlite.JDBC");
		Connection con=DriverManager.getConnection("jdbc:sqlite:c://sqlite//univ.db");
		Statement stm=con.createStatement();
		ResultSet rs=stm.executeQuery("select * from dept");
		
		int dno;
		String dname;
		while(rs.next()){
			dno=rs.getInt("deptno");
			dname=rs.getString("dname");
			System.out.println(dno+" "+dname);
		}
	}
}