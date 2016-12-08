package sortingAlgorithms;

public class BubbleSort {

	public static int[] sortInAscendingOrder(int[] arrayToSort) {
		
		for(int i = 0; i < arrayToSort.length - 1; i++) {
			for(int k = 1; k < arrayToSort.length - i; k++) {
				if(arrayToSort[k] < arrayToSort[k-1]) {
					int temp = arrayToSort[k];
					arrayToSort[k] = arrayToSort[k-1];
					arrayToSort[k-1] = temp;
				}
			}
		}
		System.out.println("The array has been sorted using Bubble Sort in descending order.");
		return arrayToSort; 
	}
	
	public static int[] sortInDescendingOrder(int[] arrayToSort) {
		
		for(int i = 0; i < arrayToSort.length - 1; i++) {
			for(int k = 1; k < arrayToSort.length - i; k ++) {
				if(arrayToSort[k] > arrayToSort[k-1]){
					int temp = arrayToSort[k];
					arrayToSort[k] = arrayToSort[k-1];
					arrayToSort[k-1] = temp;
				}
			}
		}
		
		System.out.println("The array has been sorted using Bubble Sort in ascending order.");
		return arrayToSort; 
	}
	
	public static void printArray(int[] arrayToPrint) {
		for(int curElement : arrayToPrint) {
			System.out.print(curElement + " ");
		}
		System.out.println("");
	}

}
