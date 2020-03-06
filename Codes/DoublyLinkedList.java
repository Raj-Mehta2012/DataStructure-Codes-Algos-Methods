import java.util.Scanner;

class Node
{
	private int data;
	private Node next, previous;
	Node(int data,Node next, Node previous)
	{
		this.setData(data);
		this.setNext(next);
		this.setPrevious(previous);
	}
	
	public void setNext(Node next) 
	{
		this.next = next;
	}
	
	public Node getNext() 
	{
		return next;
	}
	
	public Node getPrevious() 
	{
		return previous;
	}
	
	public void setPrevious(Node previous) 
	{
		this.previous = previous;
	}
	
	public int getData() 
	{
		return data;
	}
	
	public void setData(int data) 
	{
		this.data = data;
	}
	
	
}
class LLDemo 
{
   static Node head=null;
   
	
	public static void main(String[] args) 
	{
	
      Scanner sc=new Scanner(System.in);
      System.out.println("enter total nodes");
      int n=sc.nextInt();
      
      System.out.println("enter data: ");
      int data=sc.nextInt();
 
      
      LLDemo obj=new LLDemo();
      head=obj.createLL(head,data);

      for(int i=1;i<n;i++)
      {
    	  System.out.println("enter data: ");
          data=sc.nextInt();
          
          obj.createLL(head,data);
   	  
      }
      //dynamic creation of LL
      System.out.println("linked list created");
      System.out.println("printing LL");
      obj.printLL(head);
      sc.close();
	}


	Node createLL(Node head, int data) 
	{
		Node h=head;
		Node p=h;
		Node q=h;
		if(h==null)
			h=new Node(data,null,null);
		else
		{
			while(p!=null)
			{
				q=p;
				p=p.getNext();
			}
			p=new Node(data,null,q);
			q.setNext(p);
		}
		return h;
	}


	void printLL(Node head) 
	{
		Node h=head;
		Node p=h;
		while(p!=null)
		{
			System.out.println("-->"+p.getData());
			p=p.getNext(); //p moves ahead
	    }
		System.out.println();
		
	}

}
