package stringsEx;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "avinash";
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
		
		int length = str.length();
		String rev = "";
		for(int i=length-1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		
		 List<Character> reversList = str.chars().mapToObj(ch -> (char) ch).collect(Collectors.toList());
		 Collections.reverse(reversList);
	}

}
