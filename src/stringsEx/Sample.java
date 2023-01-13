package stringsEx;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ProgrammingJavaProgrammingPythonProgrammingPython";
//		System.out.println(s.length());
		String word = "Programming";
		int numlen = word.length();
		StringBuffer sb = new StringBuffer().append(s);
		char[] stChar = s.toCharArray();
		int counter = 0;

		for (int i = 0; i < stChar.length - 1; i++) {

			if (s.charAt(i) == 'P') {
				int j = i + numlen;
//				System.out.println(sb.substring(i, j));
//				String str = sb.substring(i, j);
				if (j <= stChar.length && sb.substring(i, j).equals(word)) {
					counter++;
				}
			}
		}

		/*
		 * for (int i = 0; i < stChar.length - numlen; i++) { int j = i + numlen; String
		 * str = sb.substring(i, j); if (str.equals(word)) {
		 * System.out.println(sb.substring(i, j));
		 * 
		 * counter++;
		 * 
		 * } }
		 */
		System.out.println("count:" + counter);
	}
}
