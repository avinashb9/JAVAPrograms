package streamsUtil;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(34,23,5,6,78,90,1,1,9,0,5,7);
		Optional<Integer> sum = list.stream().reduce((a,b)->a+b);
		System.out.println(sum);
		
		int sumStream = list.stream().mapToInt(a -> a).sum();
		System.out.println(sumStream);

	}

}
