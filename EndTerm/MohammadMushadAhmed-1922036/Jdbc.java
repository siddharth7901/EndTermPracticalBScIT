
package jdbc;
import java.sql.*;
import java.util.Scanner;


class RollnoNotWithInRangeException extends Exception
{
     public String toString()
     {
          return ("Roll is not between 1 and 63. please ReEnter the roll");
     }
}









public class Jdbc {
    
  
    public static void main(String[] args) throws Exception {
   Scanner sc=new Scanner(System.in);
   int roll=sc.nextInt();
      
   
   
   
   
          try{
               if(roll>=1 && roll<=63)
                    {
 Class.forName("org.sqlite.JDBC");
Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//db1.db");

PreparedStatement stm=con.prepareStatement(" select roll from employee where rollno=?");
stm.setInt(1,roll);
ResultSet rs=stm.executeQuery();

while(rs.next())
{
 int rollno=rs.getInt("rollno");
String name=rs.getString("Name");
float per=rs.getFloat(3);

System.out.println(rollno+" "+name+" "+per);

}   } 
         
               else
                    throw new RollnoNotWithInRangeException();
          }
          catch(RollnoNotWithInRangeException e1)
          {
               System.out.println(e1);
     }
          

    }
}



