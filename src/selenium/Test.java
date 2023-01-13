package selenium;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Input: 
			int[] arr1 = { 1, 4, 5, 3,8}; 
			int[] arr2 = {2, 6, 8, 4};
//		Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}
			int[] arr3 = new int[arr1.length + arr2.length];
			/*
			 * int index = 0; for(int i=0;i<arr1.length;i++) { arr3[index] = arr1[i];
			 * index++; }
			 * 
			 * for(int i=0;i<arr2.length;i++) { arr3[index] = arr2[i]; index++; }
			 * 
			 * //print for(int i=0;i<arr3.length;i++) { System.out.print(arr3[i]+","); }
			 * 
			 * //sorting for(int i=0;i<arr3.length;i++) { for(int j=i+1;j<arr3.length;j++) {
			 * if(arr3[j] < arr3[i]) { //swap int temp = arr3[j]; arr3[j] = arr3[i]; arr3[i]
			 * = temp; } } } System.out.println("***"); //print for(int
			 * i=0;i<arr3.length;i++) { System.out.print(arr3[i]+","); }
			 */
			System.arraycopy(arr1, 0, arr3, 0, arr1.length);
			System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
			for(int i:arr3) {
				System.err.print(i+",");
			}
			
			/*
			 *  Map<Integer, Long> mapCount =
			 * Arrays.stream(arr3).boxed().collect(Collectors.toList()).stream().collect(
			 * Collectors.groupingBy(Function.identity(),Collectors.counting()));
			 * 
			 * mapCount.entrySet().forEach(System.out::println);
			 */
			
			/*
			 * Map<Integer,Integer> intCount = new HashMap<Integer,Integer>(); for(int
			 * i=0;i<arr3.length;i++) { if(intCount.keySet().contains(arr3[i])) {
			 * intCount.put(Integer.valueOf(arr3[i]),
			 * intCount.get(Integer.valueOf(arr3[i]))+1); }else {
			 * intCount.put(Integer.valueOf(arr3[i]),1); }
			 * 
			 * }
			 */
			/*
			 * System.out.println(intCount.entrySet()); List<Entry<Integer, Integer>>
			 * duplicateInts = intCount.entrySet().stream().filter(x -> x.getValue() >
			 * 1).collect(Collectors.toList()); duplicateInts.stream().forEach(entry ->
			 * System.out.println(entry.getKey()));
			 */
			
	}

}
