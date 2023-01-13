package stringsEx;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "How are you";

		String[] words = input.split(" ");
		
		for (String str : words) {
			str.chars();
			char[] chars = str.toCharArray();
			for (int i = chars.length - 1; i >= 0; i--) {
				System.out.print(chars[i]);
			}
			System.out.print(" ");
		}

		// single Line using Stream
		List<StringBuffer> wordReverse = Arrays.asList(input.split(" ")).stream()
				.map(str -> new StringBuffer().append(str).reverse()).collect(Collectors.toList());
		wordReverse.forEach(System.out::println);
		//joining the list to string
		String output = wordReverse.stream().map(Object::toString).collect(Collectors.joining(" "));
		System.out.println("OUTPUT JOINED:"+output);
		
	}

}
