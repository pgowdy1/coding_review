package linkedLists;

public class LinkedListMain { 

	public static void main(String[] args) {
		LinkedList testList = new LinkedList(1); 
		
		//TODO: Complete delete operation
			
		testList.addNodeToTail(2);
		testList.addNodeToTail(3);
		testList.printList();
		testList.deleteNode(2);
		testList.printList();
	}
	
}
