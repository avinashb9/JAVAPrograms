package selenium;

import java.util.Scanner;

public class Test3 {
	
	private static int totalNotesCount;
	private static int noOfNotes;
	private static int pendingCash;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter cash required in multiples of 100:");
		int cashRequired = sc.nextInt();
		
		getNoOfNotes(cashRequired,500);
		getNoOfNotes(pendingCash,200);
		getNoOfNotes(pendingCash,100);
		System.out.println(totalNotesCount);
	}
	
	public static void getNoOfNotes(int totalCash,int multiplier) {
		noOfNotes = totalCash/multiplier;
		totalNotesCount = totalNotesCount + noOfNotes;
		pendingCash = totalCash - noOfNotes * multiplier;
	}
	
	
}
