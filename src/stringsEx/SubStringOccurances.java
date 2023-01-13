package stringsEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubStringOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ProgrammingJavaProgrammingPythonProgrammingProgramming";
//		String str = "CCCAAABBBCCCDDD";
		String word = "Programming";
//		String word = "CCC";
		int index = 0, counter = 0;

		while (true) {
			index = str.indexOf(word, index);
			if (index != -1) {
				counter++;
				index++;
			} else
				break;
		}

		System.out.println("Counter:" + counter);

		// METHOD-2
		Matcher matcher = Pattern.compile(word).matcher(str);
		while (matcher.find()) {
			counter++;
		}
		System.out.println("Counter:" + counter);
		

	}

}
