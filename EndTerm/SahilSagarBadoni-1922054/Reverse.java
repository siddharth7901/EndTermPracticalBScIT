import java.io.*;
public class reverse {

	public static void main(String[] args)throws Exception {
		
		PrintWriter out=new PrintWriter(new FileWriter("file.txt"));
		PrintWriter out1=new PrintWriter(new FileWriter("Output.txt"));
		for(int i=100;i<=150;i++)
		{
			
			out.println(i);
			out.flush();
		}
		BufferedReader br=new BufferedReader(new FileReader("file.txt"));
		String line=br.readLine();
		
		int i=0;
		int t=0;
		
		while(line!=null)
		{
			t=Integer.parseInt(line);
			i=fun(t);
			line=br.readLine();			
			out1.println(i);
			
                        out1.flush();
		}
	}
	
	static int fun(int t)
	{
		int i=0;
		i=t;
		int sum=0;
		int r=0;
		while(i!=0)
		{
			r=i%10;
			sum=sum*10+r;
			i/=10;
			
		}
		return sum;
          
	}

}
