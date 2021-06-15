import java.io.*;
class DemoMerge
{
	public static void main(string[]args throws Exception
{
	Printwriter pw=newPrintwriter("three.txt");
	FileReader fr=newFileReader("one.txt");
	BufferedReader br=newBuffered Reader(fr);
	string line=br.readline();
	while(line!=null)
{	
	pw.println(line);
	line=br.readline();
}
	fr=new FileReader("two.txt");
	br=new BufferedReader(fr);
	line=br.readline();
	while(line!=null()


{	 
	pw.println(line);
	line=br.readline();
}	
	pw.flush();
	br.close();
	br1.close();
	pw.close();
	system.out.println("written the data successfully into three.txt file..");
}
}