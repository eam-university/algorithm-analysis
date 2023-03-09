package algorithmAnalysis;


public class OrderingExercise {

	public static int[] originalArray;
	public static int bubbleCounter = 0, selectionCounter = 0, quickCounter = 0, insertionCounter = 0;
	
	public static void main(String[] args) {
		initArray();
		System.out.println("Unordered array");
		printArray(originalArray);
		System.out.println("Ordered array by bubble method");
		bubbleSort(originalArray);
		printArray(originalArray);
		initArray();
		System.out.println("Unordered array");
		printArray(originalArray);
		System.out.println("Ordered array by selection method");
		selectionSort(originalArray);
		printArray(originalArray);
		initArray();
		System.out.println("Unordered array");
		printArray(originalArray);
		System.out.println("Ordered array by quick sort method");
		quickSort(originalArray, 0, originalArray.length - 1);
		printArray(originalArray);
		initArray();
		System.out.println("Unordered array");
		printArray(originalArray);
		System.out.println("Ordered array by insertion method");
		insertionSort(originalArray);
		printArray(originalArray);
		System.out.println("Counters:\n");
		System.out.println("Bubble method:\n" + bubbleCounter);
		System.out.println("Selection method:\n" + selectionCounter);
		System.out.println("QuickSort method:\n" + quickCounter);
		System.out.println("Insertion method:\n" + insertionCounter);
		
	}
	
    public static void bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Elements swap
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    bubbleCounter++;
                }
            }
        }
    }
    
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
                selectionCounter++;
            }
            // Swap with the found minimum
            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }
    }
    
    public static void quickSort(int[] array, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(array, begin, end);
            quickSort(array, begin, partitionIndex-1);
            quickSort(array, partitionIndex+1, end);
        }
    }    
    
    private static int partition(int[] array, int begin, int end) {
        int pivot = array[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (array[j] <= pivot) {
                i++;
                int swapTemp = array[i];
                array[i] = array[j];
                array[j] = swapTemp;
            }
            quickCounter++;
        }

        int swapTemp = array[i+1];
        array[i+1] = array[end];
        array[end] = swapTemp;

        return i+1;
    }
    
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
                insertionCounter++;
            }
            array[j + 1] = key;
        }
    }
    
    public static void initArray() {
    	// {49, 65, 15, 43, 98, 20, 07, 77}
    	originalArray = new int[8];
    	originalArray[0] = 49;
    	originalArray[1] = 65;
    	originalArray[2] = 15;
    	originalArray[3] = 43;
    	originalArray[4] = 98;
    	originalArray[5] = 20;
    	originalArray[6] = 07;
    	originalArray[7] = 77;
    }
    
    public static void printArray(int[] array) {
    	System.out.print("[ ");
    	for (int i = 0; i < array.length; i++) {
        	System.out.print(array[i] + " ");
		}
    	System.out.print("]");
    	System.out.print("\n\n");
    }

}
