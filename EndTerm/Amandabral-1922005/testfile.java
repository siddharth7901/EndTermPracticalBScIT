import java.io.*;
class testfile
{
public static void main(String[] args)throws IOException
{
printWriter out=new printWriter("three.txt");
BufferedReader b1=new BufferedReader(new FileReader("one.txt"));
BufferedReader b2=new BufferedReader(new FileReader("two.txt"));
String line=br1.readLine();
while (line!=null)
{
out.println(line);
out.flush();
line=br1.readLine();
line=br2.readLine();
while(line!=null)
{
out.println(line);
out.flush();
line=br2.readLine();
}
System.out.println("FILE MERGED");
}
}
}
