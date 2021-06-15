import java.io.*;
  
public class FileMerge 
{
    public static void main(String[] args) throws IOException 
    {
      
        PrintWriter pw = new PrintWriter("three.txt");
          
      
        BufferedReader br = new BufferedReader(new FileReader("one.txt"));
          
        String line = br.readLine();
          
       
        while (line != null)
        {
            pw.println(line);
            line = br.readLine();
        }
          
        br = new BufferedReader(new FileReader("two.txt"));
          
        line = br.readLine();
          
        // loop to copy each line of 
        // two.txt to  three.txt
        while(line != null)
        {
            pw.println(line);
            line = br.readLine();
        }
          
        pw.flush();
          
        // closing resources
        br.close();
        pw.close();
          
        System.out.println("Merged one.txt and two.txt into three.txt");
    }
}
