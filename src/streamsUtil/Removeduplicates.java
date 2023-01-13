package streamsUtil;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "avinashbommidi"; //expected - avinshbomd
		char[] arr = s.toCharArray();
		
		for(char ch:arr) {
			System.out.print(ch+" ");
		}
		System.out.println();
				s.chars().mapToObj(ch -> (char)ch).distinct().collect(Collectors.toList())
				.stream().forEach(System.out::print);
		
		
		System.out.println();
		//without streams
		Set<Character> charSet = new HashSet<Character>(); //HashSet doesn't maintain insertion order - ListHashSet maintains order
		for(char ch:arr) {
			charSet.add(new Character(ch));
		}
		charSet.forEach(ch -> System.out.print(ch));
	}

}
