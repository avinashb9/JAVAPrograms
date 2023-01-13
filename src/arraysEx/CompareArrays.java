package arraysEx;

import java.util.Arrays;

public class CompareArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3};
		int[] arr2= {2,3,1};
		int[] arr3= {3,4,5};
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		Arrays.sort(arr3);
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	}
	

}
