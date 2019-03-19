package stringprograms;

import java.util.Scanner;

public class RemoveString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a String:");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String str = sc.next();
		String replaceStr = input.replaceAll(str, "");
		System.out.println(replaceStr);
		sc.close();
	}

}
