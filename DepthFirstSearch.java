**Depth-First-Search Algo**

import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearchDemo {
	
	static class Node{
		int data;
		boolean visited;
		List<Node> neighbours;
		
		Node(int data){
			this.data=data;
			this.neighbours = new ArrayList();
		}
		
		public void addNeighbours(Node NeighbourNode) {
			this.neighbours.add(NeighbourNode);
		}
		
		public List<Node> getNeighbours(){
			return neighbours;
		}
		
		public void setNeighbours(List<Node> neighbours) {
			this.neighbours=neighbours;
		}
	}
	public static void dfs(Node node) {
		System.out.println(node.data+" ");
		List<Node> neighbours = node.getNeighbours();
		node.visited = true;
		for(int i = 0 ; i< neighbours.size(); i++) {
			Node n = neighbours.get(i);
			if(n!=null && !n.visited) {
				dfs(n);
			}
		}
	}
	
	public DepthFirstSearchDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node40 = new Node(40);
		Node node10 = new Node(10);
		Node node20 = new Node(20);
		Node node30 = new Node(30);
		Node node50 = new Node(50);
		Node node60 = new Node(60);
		Node node70 = new Node(70);
		
		node40.addNeighbours(node10);
		node40.addNeighbours(node20);
		node20.addNeighbours(node10);
		node20.addNeighbours(node30);
		node20.addNeighbours(node60);
		node20.addNeighbours(node50);
		node50.addNeighbours(node70);
		node10.addNeighbours(node30);
		node30.addNeighbours(node60);
		
		dfs(node40);
	}

}
