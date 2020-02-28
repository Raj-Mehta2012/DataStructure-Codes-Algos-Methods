***DS Linked-list (User defined)***

import java.util.Scanner;
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


public class LLDemo {
		static Node head=null;
	
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter nodes: ");
		int n=sc.nextInt();
		System.out.println("Enter 1st Node value: ");
		int data=sc.nextInt();
		LLDemo obj=new LLDemo();
		head=obj.createLL(head,data);
		System.out.println("head: "+head);
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter value for "+(i+1)+"th node: ");
			data=sc.nextInt();
			obj.createLL(head,data);
		}
		System.out.println("Linked List Created");
		System.out.println("Link list is :");
		obj.printLL(head);
		
	}
	
	void printLL(Node head) {
		Node h=head;
		Node p=h;
		while(p!=null) {
			System.out.println("-->"+p.getData());
			p.getNext();
		}
		System.out.println();
		
	}
	
	Node createLL(Node head,int data) {
		Node h=head;
		Node p=h;
		Node q=h;
		if(h==null) 
			h=new Node(data,null);
		else
		{
			while(p!=null) {
				q=p;
				q=p.getNext();
			}
			p=new Node(data,null);
			q.setNext(p);
		}
		return h;
	}
}
