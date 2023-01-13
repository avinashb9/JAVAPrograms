package algorithms;

public class SortingAlgos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {23,4,56,34,56,7767,12,3};
		SortingAlgos sa = new SortingAlgos();
//		sa.selectionSort(numbers);
		sa.bubbleSort(numbers);
		sa.printArray(numbers);
	}
	
	public void printArray(int[] arr) {
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	
	public void selectionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j = i;j<arr.length;j++) {
				//asc - > , desc <
				if(arr[i] > arr [j]) {
					//swap elements
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					//swap 
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

}
