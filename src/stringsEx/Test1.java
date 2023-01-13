package stringsEx;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Map<String,String> mapObj = new HashMap<String,String>();
		mapObj.put("name","avinash");
		mapObj.put("salary","20000");
		mapObj.put("dept","name");
		Set<String> keySet = mapObj.keySet();
		for(Map.Entry< String, String> entry: mapObj.entrySet()) {
			if(keySet.contains(entry.getValue())) {
				System.out.println(entry.getKey()+":"+entry.getValue());
				System.out.println(mapObj.get(entry.getValue()));
			}
		}
		*/
		
//		int[] numbersList = Arrays.asList(1,5,6,778,23).toArray();
		/*
		 * int[] numbers = {1,5,6,778,23};
		 * 
		 * 
		 * for(int i=0;i<numbers.length-1;i++) { for(int j=i;j<numbers.length;j++) {
		 * if(numbers[i]>numbers[j]) { //swap int temp = numbers[j]; numbers[j] =
		 * numbers[i]; numbers[i] = temp; } } }
		 * 
		 * //print for(int i:numbers) { System.out.println(i); }
		 * 
		 * System.out.println(numbers[2]);
		 */
		
		String str ="ABBCCCDDDDCCC";
		Map<Character,Long> entry = str.chars().mapToObj(ch -> (char)ch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		List<Map.Entry<Character,Long>> list = new LinkedList<Map.Entry<Character,Long>>(entry.entrySet());
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder(new Comparator<Map.Entry<Character, Long>>(){

			@Override
			public int compare(Entry<Character, Long> o1, Entry<Character, Long> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
			
		}));
		System.out.println(list);
		Map.Entry<Character, Long> secondHigh= list.stream().skip(1).findFirst().get();
		System.out.println("second Highest:"+secondHigh);
		/*
		 * LinkedHashMap<Character,Long> entrySorted =
		 * entry.entrySet().stream().sorted(Map.Entry.comparingByValue())
		 * .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(a,b)->
		 * b,LinkedHashMap::new)); System.out.println(entrySorted);
		 */
//		printMap(entrySorted);
		
		}
		
	
	public static void printMap(LinkedHashMap<Character,Long> mapObj) {
		for(Map.Entry<Character, Long> entry:mapObj.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
	
	
	
	
	
}
