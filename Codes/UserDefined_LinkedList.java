***DS Linked-list (User defined)***

import java.util.*;

class Node 
{
	private int data;
	private Node next;
	Node(int data,Node next)
	{
		this.setData(data);
		this.setNext(next);
	}
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data=data;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node next) {
		this.next=next;
	}
	
}	


public class LLDemo 
{
		static Node head=null;
		static Node nwnode=null;
	
		public static void main(String[]args) 
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter nodes: ");
			int n=sc.nextInt();
			
			System.out.println("Enter 1st Node value: ");
			int data=sc.nextInt();
			
			LLDemo obj=new LLDemo();
			head=obj.createLL(head,data);
			
			System.out.println("head: "+head);
			for(int i=1;i<n;i++)
			{
				System.out.println("Enter value for "+(i+1)+"th node: ");
				data=sc.nextInt();
				obj.createLL(head,data);
			}
			
			System.out.println("Linked List Created");
			System.out.println("Link list is :");
			obj.printLL(head);
			
			System.out.println("Enter position to add node: ");
			int pos=sc.nextInt();
			System.out.println("Enter data: ");
			data=sc.nextInt();
			
			nwnode=obj.createLL(nwnode,data);
			obj.addLL(head,nwnode,pos);
			obj.printLL(head);
		}
	
	void printLL(Node head) 
	{
		Node h=head;
		Node p=h;
		while(p!=null) 
		{
			System.out.println("-->"+p.getData());
			p=p.getNext();
		}
		System.out.println();
		
	}
	
	Node createLL(Node head,int data) 
	{
		Node h=head;
		Node p=h;
		Node q=h;
		if(h==null) 
			h=new Node(data,null);
		else
		{
			while(p!=null) 
			{
				q=p;
				p=p.getNext();
			}
			p=new Node(data,null);
			q.setNext(p);
		}
		return h;
	}
	
	Node addLL(Node head,Node nwnode,int position) 
	{
		Node h=head;
		Node p=h;
		Node q=h;
		int n=0;
		
		while(p!=null) 
		{
			n++;
			if(n==position)
				break;
			q=p;
			p=p.getNext();
		}
		nwnode.setNext(p);
		q.setNext(nwnode);
		
		return h;
	}
	
}
