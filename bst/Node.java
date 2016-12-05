package bst;

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
	
	public Node getLeftChild() {
		return this.left;
	}
	
	public Node getRightChild() {
		return this.right;
	}
	
	public int getData(){
		return this.data;
	}
	
	public void setLeftChild(Node newLeft) {
		this.left = newLeft; 
	}
	
	public void setRightChild(Node newRight) {
		this.right = newRight;
	}
	
	public void setData(int data) {
		this.data = data; 
	}
}
