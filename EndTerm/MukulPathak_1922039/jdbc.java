import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
   static final String DB_URL = "jdbc:mysql://localhost/Mypc";
   static final String NAME = "guest";
   static final int RollNumber = 00;
   static final double Percentage = 0.00;
   static final String QUERY = "SELECT  String Address, int Phonenumber";

   public static void main(String[] args) {
  
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(QUERY);
      ) {		      
         while(rs.next()){
            //Display values
            System.out.print("Address: " + rs.getString("Address"));
            System.out.print(", PhoneNumber: " + rs.getInt("PhoneNumber"));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}