package linkedLists;

public class LinkedList {

	private Node head;

	public LinkedList(int data) {
		Node headNode = new Node(data);
		System.out.println("The node: " + data + " has become the head of the LinkedList.");
		this.head = headNode;
	}

	public void deleteNode(int data) {

		Node curNode = head;

		if (curNode.getNodeData() == data) { // Node was at the Head so set next
												// element in List to Head
			if (curNode.getNextNode() != null) {
				head = curNode.getNextNode();
			}

			else {
				System.out.println("The node was deleted and this List is now empty.");
			}
		}

		while (curNode.getNextNode() != null) {
			if (curNode.getNextNode().getNodeData() == data) {
				if (curNode.getNextNode().getNextNode() != null) {
					curNode.setNextNode(curNode.getNextNode().getNextNode());
				}
			}
			curNode = curNode.getNextNode();

		}
		
		if(curNode.getNodeData() == data && curNode.getNextNode() == null) {
			curNode = null; 
		}

	}

	public void addNodeToTail(int data) {
		Node newNode = new Node();

		if (this.head == null) {
			this.head = newNode;
			return;
		}

		newNode = this.head;

		System.out.println("Entering the list with: " + data);

		while (newNode.getNextNode() != null) {
			newNode = newNode.getNextNode();
		}

		System.out.println("The node : " + data + " has been added to the LinkedList.");

		Node nodeToAdd = new Node(data);
		newNode.setNextNode(nodeToAdd);
	}

	public void printList() {
		Node curNode = new Node();
		curNode = this.head;

		while (curNode.getNextNode() != null) {
			System.out.print(curNode.getNodeData() + "->");
			curNode = curNode.getNextNode();
		}

		System.out.println(curNode.getNodeData());

	}

}
