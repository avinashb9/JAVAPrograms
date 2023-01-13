package streamsUtil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(34,23,225,62,78,90,1,21,9,20,25,7);
		List<Integer> numStartsWtih2  = list.stream()
				.map(a -> String.valueOf(a))
				.filter(e -> e.startsWith("2"))
				.map(e -> Integer.valueOf(e))
				.collect(Collectors.toList());
	System.out.println(numStartsWtih2);
	}

}
