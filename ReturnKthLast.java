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
 
public class ReturnKthLast
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
void kthlast(int k)
  {
   int t=k;
    Node slow = this.head;
   Node fast = this.head;
   while(fast!=null && k>0)
   {
     fast=fast.next;
     k--;
   }
   while(fast!=null)
   {
     slow=slow.next;
     fast=fast.next;
   }
   System.out.println(t+"th element "+slow.data);
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
    ReturnKthLast list=new ReturnKthLast();
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
 
    list.kthlast(2);
 
  
  
  }
}
