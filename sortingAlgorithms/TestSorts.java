package sortingAlgorithms;

import java.util.*;

public class TestSorts { 

	public static void main(String[] args) {
		
		int[] testArray = {3, 4, 1, 0, 7, 2, 3, 11, 8, 9, 2};
		Random randGenerator = new Random();
		
/*		
		testArray = BubbleSort.sortInDescendingOrder(testArray);
		BubbleSort.printArray(testArray);
		
		testArray = BubbleSort.sortInAscendingOrder(testArray); 		
		BubbleSort.printArray(testArray); 
*/			
		testArray = SelectionSort.sortDescendingOrder(testArray);
		SelectionSort.printArray(testArray);
	}

}
