package streamsUtil;

import java.util.Arrays;
import java.util.List;

public class NumberSquareAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(34,23,5,6,78,90,1,1,9,0,5,7);
		double avg =list.stream().map(a -> a*a).filter(a -> a>1000).mapToInt(a -> a).average().getAsDouble();
		System.out.println(avg);
	}

}
