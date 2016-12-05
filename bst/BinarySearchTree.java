package bst;

public class BinarySearchTree {

	Node root = null;

	public BinarySearchTree() {

	}

	public BinarySearchTree(int data) {
		this.root = new Node(data);
	}

	public void addNode(int data) {
		if (root == null) { // tree is empty so add node as root node.
			this.root = new Node(data);
		}

		else if (root != null) {
			Node curNode = root;
			Node parent = null;

			while (curNode != null) {
				parent = curNode;
				if (data <= curNode.getData()) {
					curNode = curNode.getLeftChild();

					if (curNode == null) {
						parent.setLeftChild(new Node(data));
						return;
					}
				}

				else {
					curNode = curNode.getRightChild();

					if (curNode == null) {
						parent.setRightChild(new Node(data));
						return;
					}
				}
			}
		}
	}

	public Node findNode(int data) {
		if (root.getData() == data) {
			return root;
		}
		
		Node curNode = root; 
		
		while(curNode != null) {
			if(curNode.getData() == data) {
				System.out.println("The node containing the value " + data + " was found.");
				return curNode; 
			}
			
			else if(data <= curNode.getData()) {
				curNode = curNode.getLeftChild();
			}
			
			else if (data > curNode.getData()) {
				curNode = curNode.getRightChild();
			}
		}
		
		System.out.println("No node with this data value was found.");
		return null; 
	}
	
	public void preOrderTraversal(Node rootNode){
		if(rootNode != null) {
			System.out.println(rootNode.getData());
			preOrderTraversal(rootNode.getLeftChild());
			preOrderTraversal(rootNode.getRightChild());
		}
	}
	
	public Node getRoot(){
		return this.root; 
	}
}
