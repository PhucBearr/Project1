import java.util.Scanner;
class Node {
    Node next;int data;
    public Node(int data) {
        this.data = data;
    }
}
public  class LinkedLists {
    public Node head = null;
    public Node tail = null;
    public void add(int data) {
        Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else
                tail.next = newNode;
                tail = newNode;}
    public void prepend(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }

     /*   if(head == null){
                head = new Node(data);
            }
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
   }         current.next = new Node(data);*/
    public static void Display(Node head){
        if( head ==null){
            System.out.print("List is empty");
        }
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    public static  void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int value = in.nextInt();
        LinkedLists lists = new LinkedLists();
        for(int i = 0; i < value; i++){
            int ele = in.nextInt();
             lists.add(ele);
        }
        System.out.println("add tail");
        Display(lists.head);
        System.out.println();
        System.out.println("add to the head");
        for(int i =0; i< value; i++){
            int ele = in.nextInt();
            lists.prepend(ele);
        }
        System.out.println("Add head");
        Display(lists.head);
    }
}

