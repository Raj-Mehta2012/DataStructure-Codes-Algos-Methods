class Node{
	public int value;
	Node left;
	Node right;
	Node (int value){
		this.value=value;
	}
	public int getValue() {
		return value;		
	}
	public void setValue(int value) {
		this.value=value;
	}
	public Node getLeft() {
		return left;
	}
	public Node getRight() {
		return right;
	}
	public void setLeft(Node left) {
		this.left=left;
	}
	public void setRight(Node right) {
		this.right=right;
	}
}

class Bst{
	public Node root;
	Bst insert(int value){
		Node node=new Node(value);
		if(root==null) {
			root=node;
			return this;
		}
		insertRec(root,node);
		return this;
	}
	private void insertRec(Node late, Node node) {
	   if(late.getValue()>node.getValue()) {
		   late.setLeft(node);
		   
	   }
	   else {
		   insertRec(late.getRight(),node);
	   }
		
	}
}


public class BinaryTree {
	public static void main(String[] args) {
		
		Bst bst=new Bst();
		bst.insert(45);
		bst.insert(30);
		bst.insert(40);
		bst.insert(20);
		
	}
}
