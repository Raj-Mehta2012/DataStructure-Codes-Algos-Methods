***DS Stack***

import java.util.Scanner;

public class StArr 
{

	private int[] arr;
	private int top;
	private int size;
	private int length;

	StArr(int s)
	{
		arr=new int[s];
		top=-1;
		size=s;
		length=0;
	
	}
	
	public boolean isEmpty()
	{
		if(top==-1)
		return true;
		
	else return false;
	}
	
	public boolean isFull()
	{
		if(top==size-1)
			return true;
		
		else return false;
	}
	
	public int getSize()
	{
		return top+1;
	}
	
	public int peek()
	{
		return arr[top];
	}
	
	public int pop()
	{
		if(isEmpty()==true)
		{
			System.out.println("Stack Empty");
			return 0;
		}
		else
		{
			top=top-1;
			length--;
			return arr[top+1];
		}
	}
	
	public void display()
	{
		if(isEmpty()==true)
			System.out.println("Stack empty");
		
		else
		{
			for(int i=top;i>=0;i--)
				System.out.println(arr[i]);
		}
	}
	
	public void push(int x)
	{
		if(isFull()==true)
			System.out.println("Stack full, cannot push value");
		
		else
			top++;
		
		arr[top]=x;
		length++;
	}
	
	
	public static void main(String[] args) 
	{
	// TODO Auto-generated method stub
		int s;
		System.out.println("Enter size of the stack:");
		Scanner sc=new Scanner(System.in);
		s=sc.nextInt();
		
		StArr obj=new StArr(s);
		
		do{
			int ans;
			System.out.println("Enter:");
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.peek");
			System.out.println("4.check empty");
			System.out.println("5.check full");
			System.out.println("6.size");
			System.out.println("7.display");
			System.out.println("8.exit");
			
			ans=sc.nextInt();
			
			switch(ans)
			{
				case 1: int x;
				System.out.println("Enter element:");
				x=sc.nextInt();
				obj.push(x);
				System.out.println("Stack:");
				obj.display();
				break;
				
				case 2: int p= obj.pop();
				System.out.println(p);
				System.out.println("Stack:");
				obj.display();
				break;
				
				case 3: System.out.println(obj.peek());
				break;
				
				case 4: System.out.println(obj.isEmpty());
				break;
				
				case 5: System.out.println(obj.isFull());
				break;
				
				case 6: System.out.println(obj.getSize());
				break;
				
				case 7: obj.display();
				break;
				
				case 8: System.exit(0);
				break;
				
				default: System.out.println("Invalid choice");
			}
			
		}while(true);
	
	}
}
