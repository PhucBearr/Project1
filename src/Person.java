import java.util.Scanner;

public class Person{
    String firstName;
    String lastName;
    int id;
    int [] scores;
    public Person(String firstName, String lastName, int id, int [] scores){
        this.firstName = firstName;
        this.id = id;
        this.lastName =lastName;
        this.scores = scores;
    }
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        String firstName = in.nextLine();
        String lastName = in.nextLine();
        int id = in.nextInt();
        System.out.println("arr length");
        int n = in.nextInt();
        int [] scores = new int[n];
        for(int i = 0; i< scores.length; i++){
            scores[i]= in.nextInt();
        }
        Student student = new Student(firstName,lastName,id,scores);
        System.out.println(student.calculate());
    }
}
class Student extends Person{

    public Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id, scores);
    }
    char calculate(){
        int sum =0;
        for(int s : scores){
            sum += s;
        }
        int cal = sum/scores.length;
         if(cal >=90){
             return 'O';
         }
         else if(cal >=80){
             return 'E';
         }
         else if(cal >=70){
             return 'A';
         }
         else if(cal >=55){
             return 'P';
         }
         else if(cal >= 40){
             return 'D';
         }
         else return 'T';
    }
}


