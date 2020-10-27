import java.util.Scanner;


public class Exception {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        String  S = in.nextLine();
        try {
            System.out.println(Integer.parseInt(S));
        }
        catch (java.lang.Exception e){
            System.err.println("Error");
        }
    }
}
