import java.util.*;
class Node
  {
    int data;
    Node next;
 
    public Node(int data)
    {
      this.data = data;
    }
  }
 
public class RemoveDups
{
  
  Node head;
 void insert(int data)
 {
   Node newnode=new Node(data);
   if(this.head==null)
   {
     this.head=newnode;
     return;
   }
   Node temp=this.head;
   while(temp.next!=null)
   {
     temp=temp.next;
   }
   temp.next=newnode;
 }
void removeDuplicate()
  {
    HashSet<Integer> hs = new HashSet<>();
    Node current = this.head;
   if(current!=null)
   hs.add(current.data);
    while (current.next != null)
    {
      int curdata = current.next.data;
      
      
      if (hs.contains(curdata)) {
        current.next=current.next.next;
      } else {
        hs.add(curdata);
        current=current.next;
      } 
    }
  }
 
   void printList()
  {
   Node temp=this.head;
    while (temp != null)
    {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }
 
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
    RemoveDups list=new RemoveDups();
   while(true)
   {
     int n=sc.nextInt();
     if(n!=-1)
       list.insert(n);
     else
       break;
   }
  
 
    System.out.println("Linked list before removing duplicates :");
    list.printList();
 
    list.removeDuplicate();
 
    System.out.println("\nLinked list after removing duplicates :");
 
    list.printList();
  
  }
}
