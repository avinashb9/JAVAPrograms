package algorithms;

public class BinarySearchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {2,4,56,65,78,99,102,300};
		int x = 300;
//		BinarySearchEx bs = new BinarySearchEx();
//		int index = BinarySearchEx.binarySearch(numbers, 0,numbers.length-1,x);
		int index = BinarySearchEx.iterativeBinarySearch(numbers, x);
		if(index==-1) {
			System.out.println("Search number: "+x+" NOT Found.");
		}else {
			System.out.println("Search number: "+x+"  Found at Index: "+index);
		}
	}

	// recursive binay search
	public static int binarySearch(int[] arr, int l, int r, int x) {
		// input array should be sorted

		// fails when r < l
		if (r >= l) {
			int mid = l + (r - 1) / 2;

			if (arr[mid] == x) {
				return mid;
			} else if(arr[mid] > x) {
				// should check in the left sub array
				return binarySearch(arr, l, mid - 1, x);
			} else {
				// should check in the right sub array
				return binarySearch(arr, mid + 1, r, x);
			}
		}
		return -1;
	}
	
	//Iterative Binary Search
	public static int iterativeBinarySearch(int[] arr,int x) {
		int l =0 ;
		int r = arr.length - 1;
		while (r >= l) {
			int mid = l + (r - 1)/2;
			if(arr[mid] == x) {
				return mid;
			}else if(arr[mid] > x) {
				//should search in the left array
				r = mid -1;
			}else {
				//should search in the right array
				l = mid + 1;
			}
		}
		return -1;
	}
}
