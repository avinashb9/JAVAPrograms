
public class Reverse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Avinash";
		char[] name = s.toCharArray();
		char[] rev = new char[s.length()];
//		System.arraycopy(name, s.length()-1, name, 0, s.length());
		
		for(int i=name.length-1,j=0;i>=0;i--,j++) {
			rev[j]=name[i];
		}
		System.out.println(String.valueOf(rev));
	}

}
