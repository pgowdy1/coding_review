package sortingAlgorithms;

public class SelectionSort {

	public static int[] sortDescendingOrder(int[] arrayToSort) {

		int minElement = 0;

		for (int i = 0; i < arrayToSort.length - 1; i++) {

			minElement = arrayToSort[i];

			for (int k = i; k < arrayToSort.length - 1; k++) {
				if (arrayToSort[k] < minElement) {
					minElement = arrayToSort[k];
				}

			}

			arrayToSort[i] = minElement;
		}
		System.out.println("The array has been sorted using Selection Sort in ascending order.");
		return arrayToSort;
	}

	public static void printArray(int[] arrayToPrint) {
		for (int curElement : arrayToPrint) {
			System.out.print(curElement + " ");
		}
		System.out.println("");
	}
}
