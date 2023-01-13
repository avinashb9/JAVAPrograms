package streamsUtil;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighestInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {34,23,5,6,78,90,1,1,9,0,5,7};
		List<Integer> list = Arrays.asList(34,23,5,6,78,90,1,1,9,0,5,7);
		
		int secH = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println(secH);
		
		int secLowest = list.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println(secLowest);
	}

}
