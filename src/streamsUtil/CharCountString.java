package streamsUtil;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharCountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "GeeksForGeeks";
		
		Map<Character, Long> mapObj = str.chars().mapToObj(ch -> (char) ch)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		for(Map.Entry< Character, Long> entry: mapObj.entrySet()) {
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
		
		System.out.println("********************");
		mapObj.entrySet().stream().forEach(System.out::println);
		System.out.println("********************");
		System.out.println(mapObj.entrySet());
		
	}

}
