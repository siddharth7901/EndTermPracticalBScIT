

  
import java.io.*;
class testfile
{
pulic static void main (string[] args)throws IOException
{
PrintWriter out= new PrintWriter("three.txt")
BufferedReader b1=new BufferedReader(new FileReader("one.txt"));
BufferedReader b2=new BufferedReader(new FileReader("two.txt"));
String line=br1.readLine();
while(line!=null)
{
out.println(line);
out.flush();
line=br1.readLine();
}
line=br2.readLine();
while(line!=null)
{
out.println(line);
out.flush();
line =br2.readLine();
}
system.out.println("file merged");
}
}

     