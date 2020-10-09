import java.io.*;
import java.util.Scanner;

public class Read {
    public static void main(String [] args) throws IOException {
        //Read
        FileReader reader = new FileReader("C:\\Something.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String content =  bufferedReader.readLine();
        System.out.println(content);
        bufferedReader.close();
        //Write
        FileWriter writer = new FileWriter("D:\\Something2.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        Scanner in = new Scanner(System.in);
        System.out.println("Write anything");
        String s = in.nextLine();
        bufferedWriter.write(s);
        bufferedWriter.close();
        System.out.println("Done");
    }
}
