package bst;

public class TestBST {

	public static void main(String[] args) {
		BinarySearchTree testTree = new BinarySearchTree(); 
		
		testTree.addNode(4);
		testTree.addNode(2);
		testTree.addNode(7);
		testTree.addNode(1);
		testTree.addNode(3);
		testTree.addNode(3);
		testTree.addNode(5);
		testTree.addNode(6);
		testTree.addNode(10);
		testTree.addNode(9);
		testTree.findNode(5);
		testTree.findNode(11);
		testTree.findNode(3);
		testTree.preOrderTraversal(testTree.getRoot());

	}

}
