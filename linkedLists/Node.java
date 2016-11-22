package linkedLists;

public class Node {

	private int data;
	Node nextNode = null;
	
	public Node() {
		
	}

	public Node(int newData) {
		this.data = newData; 
	}
	
	public int getNodeData() {
		return this.data; 
	}
	
	public void setNextNode(Node nodeToSet) {
		nextNode = nodeToSet; 
	}
	
	public void setNodeData(int newData) {
		this.data = newData; 
	}
	
	public Node getNextNode() {
		return nextNode; 
	}
	
}
