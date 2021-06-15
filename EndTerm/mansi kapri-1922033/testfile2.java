import java.io.*;
class Testfile
{
	public static void main(String[] args)throws IOException
	{
		PrintWriter out = new PrintWriter("Three.txt");

		BufferedReader br1 = new BufferedReader(new FileReader("One.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("Two.txt"));
		String line = br1.readLine();
		
		while (line != null)
		{
			out.println(line);
			out.flush();
			line = br1.readLine();
		}
		
		line = br2.readLine();
		while(line!=null)
		{
			out.println(line);
		    out.flush();
		line=br2.readLine();	
		System.out.println("Merged one.txt and two.txt into three.txt");
	    }
    }
}