import java.util.Scanner;

public class StringOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a String:");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		StringBuilder sb = new StringBuilder(input);
		for(int i=0;i<sb.length();i++){
			if(sb.charAt(i)==' '){
				sb.deleteCharAt(i);
			}
		}
		System.out.println("Input trim: "+sb);
		sb.reverse();
		System.out.println("Input: "+sb);
		for(int i=0;i<sb.length();i=i+2)
			System.out.print(sb.charAt(i));
		sc.close();
	}

}
