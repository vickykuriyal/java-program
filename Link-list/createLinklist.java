// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Node{
  int data;
  Node next;
  Node(int data){
    data=data;
    next=null;
    System.out.print(data);
  }
}
public class createLinklist {
  public static void main(String[] args) {
      Node n1 = new Node(1);
      System.out.print(n1.data);
      Node n2 = new Node(2);
      System.out.print(n2.data);
      n1.next=n2;
      Node h =n1;
      //while(h.next!=null){
        //System.out.print(h.data);
     // }


  }
}