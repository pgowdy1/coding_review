package stackAndQueues;

public class StackAndQueueTest {

	public static void main(String args[]) {
		runQueue(); 
		
	}
	
	public static void runQueue() {
		Queue testQueue = new Queue(); 
		
		testQueue.enqueue(1);
		testQueue.enqueue(2);
		testQueue.enqueue(3);
		testQueue.enqueue(4);
		testQueue.enqueue(5);
		testQueue.peekFront();
		testQueue.dequeue();
		testQueue.peekFront();
		testQueue.dequeue();
		testQueue.dequeue();
		testQueue.peekFront();
		testQueue.dequeue();
		testQueue.peekFront();
		testQueue.dequeue();
		testQueue.peekFront();
	}

	public static void runStack() {
		Stack testStack = new Stack();

		testStack.push(1);
		testStack.push(2);
		testStack.push(3);
		testStack.push(4);
		testStack.push(5);
		testStack.pop();
	}

}
