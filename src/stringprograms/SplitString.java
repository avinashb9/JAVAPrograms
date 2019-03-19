package stringprograms;

import java.util.Scanner;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a String:");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] arr = input.split(" ");
		for(String s: arr)
			System.out.println(s);
	}

}
