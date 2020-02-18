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
 
public class LoopDetection
{
  
  Node head;
 void insert(int data)
 {
   Node newnode=new Node(data);
   if(this.head==null)
   {
     this.head=newnode;
     this.head.next=this.head;
     return;
   }
   Node temp=this.head;
   while(temp.next!=this.head)
   {
     temp=temp.next;
   }
   temp.next=newnode;
   newnode.next=this.head;
 }
void deductLoop()
  {
  
   Node slow = this.head; 
   Node fast = this.head;   
   while (fast != null && fast.next !=null && slow!=null) 
   { 
       fast = fast.next.next;
       slow = slow.next;
       if(slow==fast)
       {
         System.out.println("loop deducted");
         return;
       }
   } 
   System.out.println("loop not deducted");
  }
 
   void printList()
  {
   Node temp=this.head;
    while (temp.next != null && temp.next!=this.head)
    {
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
   System.out.println(temp.data);
  }
 
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
    LoopDetection list=new LoopDetection();
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
 
    list.deductLoop();
    
  
  
  }
}
