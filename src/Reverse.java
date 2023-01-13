
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Avinash";
		char name[] = s.toCharArray();
		int len = name.length;
		int counter = len - 1;
		for(int i=0;i<len/2;i++,counter--) {
			char temp = name[i];
			name[i] = name[counter];
			name[counter] = temp;
			System.out.println(name[i]);
		}
		String rev = "";
		for(int i=0;i<len;i++) {
			rev = rev + name[i];
		}
		System.out.println(rev);
	}

}
