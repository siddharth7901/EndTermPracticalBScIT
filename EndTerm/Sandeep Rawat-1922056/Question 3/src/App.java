import java.sql.*;
import java.util.*;

public class App {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/db";
            String user = "root";
            String password = "root";
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            String edge = " drop table STUDENT";
            st.executeUpdate(edge);
            String sql = "CREATE TABLE STUDENT " + "(name Varchar(255) not NULL, " + " Rollno INTEGER, "
                    + " percentage DOUBLE ) ";
            st.executeUpdate(sql);
            System.out.println("Table created successfully");
            Boolean exit = true;
            while (exit == true) {

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter  name ");
                String name = sc.nextLine();
                System.out.print("Enter Rollno ");
                int rollno = sc.nextInt();
                if (rollno > 63)
                    throw new Exception("Roll out of bounds");
                System.out.print("Enter percentage ");
                Double percentage = sc.nextDouble();

                String command = "INSERT INTO STUDENT VALUES " + "(" + "'" + name + "'" + "," + rollno + " , "
                        + percentage + "); ";
                st.executeUpdate(command);
                System.out.println("Query  succeeded");

            }
        } catch (SQLException s) {
            s.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}