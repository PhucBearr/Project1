import java.io.*;
import java.util.Scanner;

public class Read {
    public static void main(String [] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter path");
        String file = in.nextLine();
        File inputFile = new File(file + ".txt");
       Scanner IFile = new Scanner(inputFile);
        while(IFile.hasNext()){
            System.out.println(IFile.nextLine());

        }
    }
}
