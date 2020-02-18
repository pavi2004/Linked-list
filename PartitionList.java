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
 
public class PartitionList 
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
 void partition(int value) 
	{ 
    Node current = this.head;
    Node smallerhead = null;
    Node smallerlast = null;  
    Node largerhead = null; 
    Node largerlast = null;    
    while (current != null )  
    {  
        if(current.data<value)
        {
          if(smallerhead==null)
          {
            smallerhead=current;
            smallerlast=smallerhead;
          }
          else
          {
            smallerlast.next=current;
            smallerlast=smallerlast.next;
          }
        }
        else
        {
          if(largerhead==null)
          {
            largerhead=current;
            largerlast=largerhead;
          }
          else
          {
            largerlast.next=current;
            largerlast=largerlast.next;
          }
        }
       current=current.next;
    }  
    smallerlast.next=largerhead;
    largerlast.next=null;
    this.head=smallerhead;
	} 
 
	 void printList() 
	{ 
    Node temp=this.head;
		while (temp.next != null ) 
		{ 
			System.out.print(temp.data + "->"); 
			temp = temp.next; 
		} 
    System.out.println(temp.data);
	} 
 
	public static void main(String[] args) 
	{ 
    Scanner sc=new Scanner(System.in);
		PartitionList list=new PartitionList(); 
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
		list.partition(5); 
    System.out.println("Linked list after partition :"); 
		list.printList(); 
	} 
} 
