package stringsEx;

public class BalancedBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "([{]))";
//		String str = "([{{[(())]}}])";
		System.out.println("Is Balanced? : "+isBalanced(str));
		
	}
	
	public static boolean isBalanced(String str) {
		if(str == null || str.length() %2 != 0)
			return false;
		char[] chars = str.toCharArray();
		int counter = 0;
		for(char ch:chars) {
			if(str.contains("(")) {
				if(!str.contains(")"))
					return false;
				else {
					str = str.replaceFirst("\\(", "");
					str = str.replaceFirst("\\)", "");}
			}
			else if(str.contains("[")) {
				if(!str.contains("]"))
					return false;
				else {
					str = str.replaceFirst("\\[", "");
					str = str.replaceFirst("\\]", "");}
			}
			else if(str.contains("{")) {
				if(!str.contains("}"))
					return false;
				else {
					str = str.replaceFirst("\\{", "");
					str = str.replaceFirst("\\}", "");}
			}
			counter++;
			if(str.length() == 0)
				break;
		}
		System.out.println(counter);
		return (str.length()==0);
		
		/*
		 * while(str.contains("()") || str.contains("[]") || str.contains("{}")) { str =
		 * str.replaceAll("\\(\\)", "").replaceAll("\\[\\]",
		 * "").replaceAll("\\{\\}",""); } return (str.length() == 0);
		 */
	}

}
