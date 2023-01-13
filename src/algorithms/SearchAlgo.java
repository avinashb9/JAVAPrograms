package algorithms;

import java.util.Arrays;
import java.util.List;

public class SearchAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {23,4,56,34,56,7767,12,3};
		int x = 3;
//		int index = SearchAlgo.linearSearch(numbers, 1123);
		int index = SearchAlgo.RecLinearSearch(numbers, 0, numbers.length - 1, x);
		if(index==-1) {
			System.out.println("Search number: "+x+" NOT Found.");
		}else {
			System.out.println("Search number: "+x+"  Found at Index: "+index);
		}
	}
	
	public static int linearSearch(int[] arr,int x) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				return i;
			}
		}
		return -1;
	}
	
	//recursive linear search
	public static int RecLinearSearch(int[] arr,int l,int r, int x) {
		if(r < l) {
			return -1;
		}
		if(arr[l] == x) {
			return l;
		}
		if(arr[r] == x) {
			return r;
		}
		return RecLinearSearch(arr,l+1,r-1,x);
	}
	

}
