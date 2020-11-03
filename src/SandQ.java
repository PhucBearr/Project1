import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class SandQ {
    public static  void main (String [] args) {
        Scanner in = new Scanner(System.in);
        SandQ san = new SandQ();
        String s = in.nextLine();
        char [] c = s.toCharArray();
     for(char e : c){
         san.pushCharacter(e);
         san.enqueueCharacter(e);
     }
        boolean isP =true ;
    for(int i =0; i< c.length/2; i++){
        if(san.dequeueCharacter() != san.popCharacter()){
            isP = false;
            break;
        }
    }
    System.out.println(s+" " +((isP) ? "is a palindrome" :"not a palinedrome"));

    }
    Queue<Character> q = new ArrayDeque<>();
    Stack<Character> st = new Stack<>();
    void pushCharacter(char ch){
        st.push(ch);
    }
    void enqueueCharacter(char ch){
        q.add(ch);
    }
    char popCharacter(){
       return st.pop();
    }
    char dequeueCharacter(){
        return q.poll();
    }
}
