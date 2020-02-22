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
 
public class Main 
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
 void mergeNode(Node one,Node two) 
	{ 
    Node temp1 = one;
    Node temp2 = two;
        
    while (temp1 != temp2 )  
    {  
        if(temp1!=null)
        {
          temp1=temp1.next;
        }
        else
        {
          temp1=two;
        }
        if(temp2!=null)
        {
          temp2=temp2.next;
        }
        else
        {
          temp2=one;
        }
    }  
    System.out.println("the intersection node data :"+temp1.data);
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
		Main list1=new Main(); 
    Main list2=new Main(); 
    Main list3=new Main(); 
    while(true)
    {
      int n=sc.nextInt();
      if(n!=-1)
        list1.insert(n);
      else
        break;
    }
	 while(true)
    {
      int n=sc.nextInt();
      if(n!=-1)
        list2.insert(n);
      else
        break;
    }
    list2.head.next.next = list1.head.next; 
		System.out.println("Linked list1 :"); 
		list1.printList(); 
    System.out.println("Linked list1 :"); 
		list2.printList(); 
		list3.mergeNode(list1.head,list2.head); 
    
	} 
} 
