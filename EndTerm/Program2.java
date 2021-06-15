package abc;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) throws Exception {
        
        //writing in file one
        PrintWriter pwriterone = new PrintWriter("./one.txt");
        for(int i=100;i<=150;i++){
            pwriterone.println(i);
        }
        pwriterone.close();

        //reading from one and reverse than save to two




        File file = new File("./one.txt");
        Scanner sc = new Scanner(file);
        
        PrintWriter pwriter = new PrintWriter("./two.txt");
        
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            int rev = 0;
            while (num > 0) {
                rev = rev * 10 + num % 10;
                num = num / 10;
            }
            pwriter.println(rev);
        }
        sc.close();
        pwriter.close();
    }
}
