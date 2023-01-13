package streamsUtil;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "How are you";
		String[] words = input.split(" ");
		
		Arrays.stream(words).sorted(Collections.reverseOrder())
			.collect(Collectors.toList())
			.forEach(str -> System.out.print(str+" "));
	}

}
