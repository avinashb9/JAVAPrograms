package streamsUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondHieghestOccurChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ABBCCCDDDDCCC";
		/*
		 * Map<Character,Long> charCount = str.chars().mapToObj(ch ->
		 * (char)ch).collect(Collectors.groupingBy(Function.identity(),Collectors.
		 * counting())); System.out.println("Before sorting:"+charCount.entrySet());
		 * 
		 * //convert List List<Map.Entry<Character,Long>> list = new
		 * ArrayList<Map.Entry<Character,Long>>(charCount.entrySet());
		 * 
		 * //sorting Collections.sort(list,Collections.reverseOrder(new
		 * Comparator<Map.Entry<Character,Long>>(){
		 * 
		 * @Override public int compare(Entry<Character, Long> o1, Entry<Character,
		 * Long> o2) { // TODO Auto-generated method stub return
		 * o1.getValue().compareTo(o2.getValue()); }}));
		 * System.out.println("sorted:"+list);
		 * 
		 * //2nd highest from list Map.Entry<Character, Long> secondHigh =
		 * list.stream().skip(1).findFirst().get();
		 * System.out.println("Second Highest:"+secondHigh);
		 * 
		 * System.out.println(list.stream().skip(1).findFirst().get().getKey());
		 * System.out.println(list.stream().skip(1).findFirst().get().getValue());
		 */
		
		
		// Single Line
		Map.Entry<Character, Long> occurances = str.chars().mapToObj(ch -> (char) ch)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.collect(Collectors.toList()).stream()
				.skip(1).findFirst().get();

		System.out.println(occurances);

	}
}
