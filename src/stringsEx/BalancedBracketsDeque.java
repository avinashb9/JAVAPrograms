package stringsEx;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class BalancedBracketsDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "([{{[(())]}}])";
		System.out.println(isBalanced(str));

	}
	
	public static boolean isBalanced(String str) {
		Deque<Character> deque = new LinkedList<Character>();
		for(char ch:str.toCharArray()){
			if(ch == '[' || ch == '(' || ch == '{') {
				deque.add(ch);
			}else {
				if(!deque.isEmpty() && (
						(deque.peekFirst( )== '(' && ch == ')') ||
						(deque.peekFirst() == '{' && ch == '{') ||
						(deque.peekFirst()=='[' && ch == ']')			
						)){
							deque.removeFirst();
						}
				else {
					return false;
				}
				
			}
		}
		return deque.isEmpty();
	}

}
