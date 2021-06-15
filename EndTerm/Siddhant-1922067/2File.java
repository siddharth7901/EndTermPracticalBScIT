import java.io.*;

public class File{
    public static void main(String[] args) throws Exception {
        FileWriterCustom fwc = new FileWriterCustom();
        fwc.fileWriter();
        fwc.palindrome();
    }
}

class FileWriterCustom {
    void fileWriter() throws Exception {
        int i;
        PrintWriter out = new PrintWriter(new FileWriter("one.txt"));
       
        for (i = 100; i < 150; i++) {
            out.println(i);
            out.flush();
        }
    }

    void palindrome() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("one.txt"));
        PrintWriter out1 = new PrintWriter(new FileWriter("output.txt"));
        String line = reader.readLine();
        out1.println("Printing Reverse ");
        while (line != null) {
            String reversed = new StringBuilder(line).reverse().toString();

            out1.println(reversed);
            out1.flush();

            line = reader.readLine();
        }
        reader.close();
    }
}