package stringsEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "avinash";

		/*
		 * char[] chars = str.toCharArray(); Map<String, Integer> mapcount = new
		 * HashMap<String, Integer>(); for (char ch : chars) { if
		 * (mapcount.keySet().contains(String.valueOf(ch))) { Integer value =
		 * mapcount.get(String.valueOf(ch)) + 1; mapcount.put(String.valueOf(ch),
		 * value); } else { mapcount.put(String.valueOf(ch), 1); } } for
		 * (Map.Entry<String, Integer> entry : mapcount.entrySet()) {
		 * System.out.println(entry.getKey() + " - " + entry.getValue()); }
		 */
		
		//through stream
		System.out.println(str.chars().mapToObj(ch -> (char)ch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));;
		
		//To find particular char count
//		char x= 'a';
		long occur = str.chars().mapToObj(x -> (char) x).filter(ch -> ch == 'b').count();
		System.out.println("Count: "+occur);

	}

}
