package stackAndQueues;

public class Stack {

	Node top;

	public Stack() {
	}

	public void push(int data) {
		Node temp = new Node(data);
		temp.setNextNode(top);
		top = temp;
		System.out.println(data + " is now on top of the stack.");
	}
	
	public void pop(){
		if(top.getNextNode() != null){
			top = top.getNextNode();
			System.out.println(top.getNodeData() + " is now on top of the stack.");
		}
		
		else {
			top = null;
			System.out.println("The stack is now empty.");
		}
	}
	
	public void printTop(){
		System.out.println(top + " is currently on top of the stack.");
	}
}
