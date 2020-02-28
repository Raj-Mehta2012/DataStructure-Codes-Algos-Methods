***DS Linked-List (ARRAY)***

import java.util.*;
public class Test {

	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		LinkedList<String> ll = new LinkedList<String>();
		int n,check = 0;
		
		do{
			System.out.println("Enter");
			System.out.println("1 to create a new linkedlist");
			System.out.println("2 to delete node from linkedlist");
			System.out.println("3 to Add a linkedlist");
			n=sc.nextInt();
			switch (n){

			case 1:	int size ;
					System.out.println("the the size of Linked list");
					size=sc.nextInt();
					String node;
					System.out.println("enter the values");
					for (int i=0 ; i<size; i++){
						node=sc.next();
						ll.add(node);
					}
					System.out.println("Linkedlist created"+ll);
					break;
			
			case 2: System.out.println("what do you want to delete ?\n 1 enter the node value\n2 index of the node\n3 delete first\n4 delete last");
					int choice=sc.nextInt();
					switch (choice){
										
					case 1:System.out.println("enter the node value");
							String s=sc.next();
							ll.remove(s);
							System.out.println("done\n"+ll);
							break;
							
					case 2: System.out.println("enter the index");
							int index=sc.nextInt();
							ll.remove(index);
							System.out.println("done\n"+ll);
							break;
							
					case 3: ll.removeFirst();
							System.out.println("done\n"+ll);
							break;
							
					case 4: ll.removeLast();
							System.out.println("donr\n"+ll);
							break;
					}
					
					break;
				
			case 3: System.out.println("enter the index at which you want to add the node ");
					int index = sc.nextInt();
					System.out.println("enter the value of node");
					String s = sc.next();
					ll.add(index,s);
					System.out.println(ll);
					break;
				
			default : System.out.println("enter the correct value");
			
			}
			System.out.println("enter 1 to continue..?");
			check=sc.nextInt();
		}while(check == 1);		
	}
}
