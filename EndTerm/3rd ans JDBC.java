import java.sql.*;
import java.util.Scanner;

class InvalidDetail extends Exception {
    @Override
    public String toString() {
        return "exception invalid :  student roll number";
    }
}



public class JDBCDemo {
    Connection con = null;
    Statement stmt = null;

    JDBCDemo() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "");
        stmt = con.createStatement();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll  no : ");
        int roll = sc.nextInt();
        if (!(roll >= 1 && roll <= 63)) {
            InvalidDetail e = new InvalidDetail();
            System.out.println(e);
        }
        else {
            System.out.println("Valid details");
        }
        //for reading 
        ResultSet rs =  stmt.executeQuery("select * from Student");
        System.out.println("Details are");
            System.out.println(rs.getString("Name"));
            System.out.println(rs.getInt("RollNumber"));
            System.out.println(rs.getDouble("Percentage"));
        

        con.close();
    }

    public static void main(String[] args) {
        try {
            new JDBCDemo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
