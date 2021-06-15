import java.sql.*;
class Testjdbc1
{
	public static void main(String args[])throws Exception
	{
	String driverClassName="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost/jdbc";
	String user="root";
	String pwd="1234";

	Class.forName(driverClassName).newInstance();
	
	Connection con=DriverManager.getConnection(url,user,pwd);
	System.out.println("con----->"+con);

	Statement st=con.createStatement();
	String sql="Insert into inventory

(name,id,salary) value

('kartik',104,6000)";
String sql1="Insert into inventory

(name,id,salary) value

('harshit',102,5000)";

String sql2="Insert into inventory(name,id,salary) value('Shiraz',103,4000)";
	st.executeUpdate(sql);
st.executeUpdate(sql1);
st.executeUpdate(sql2);

	st.close();
	con.close();
	System.out.println("Ran successfully");
	}
}
