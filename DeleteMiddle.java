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
 
public class DeleteMiddle
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
void deleteMiddle()
  {
    if (this.head == null) 
       return; 
   if (this.head.next == null) 
   { 
       return; 
   } 
   Node slow = this.head; 
   Node fast = this.head;   
   Node prev = null; 
   while (fast != null && fast.next != null) 
   { 
       fast = fast.next.next; 
       prev = slow; 
       slow = slow.next; 
   } 
    
   prev.next = slow.next; 
  }
 
   void printList()
  {
   Node temp=this.head;
    while (temp.next != null)
    {
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
   System.out.println(temp.data);
  }
 
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
    DeleteMiddle list=new DeleteMiddle();
   while(true)
   {
     int n=sc.nextInt();
     if(n!=-1)
       list.insert(n);
     else
       break;
   }
  
 
    System.out.println("Linked list :");
    list.printList();
 
    list.deleteMiddle();
    System.out.println("after deletion, Linked list :");
 
   list.printList();
 
  
  
  }
}
 
