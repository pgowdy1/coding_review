package stackAndQueues;

public class Queue {

	Node firstOut, lastOut;

	public Queue() {
		this.firstOut = null;
		this.lastOut = null;
	}

	public void enqueue(int data) {

		if (firstOut == null) {
			firstOut = new Node(data);
			System.out.println(data + " has been added to the Queue.");
		}

		else if (firstOut != null && lastOut == null) {
			Node back = new Node(data);
			lastOut = back;
			System.out.println(data + " has been added to the Queue.");
		}

		else if (firstOut != null && lastOut != null) {
			Node back = new Node(data);
			lastOut.setNextNode(back);
			lastOut = back;
			System.out.println(data + " has been added to the Queue.");
		}

	}

	public void dequeue() {

		if (firstOut == null) {
			System.out.println("The queue is empty."); 
		}
		
		else if (firstOut.getNextNode() != null) {
			System.out.println("Dequeuing " + firstOut.getNodeData() + " from queue.");
			firstOut = firstOut.getNextNode();
		}
	}
	
	public void peekFront(){
		System.out.println(firstOut.getNodeData() + " is at the front of the Queue.");
	}
}
