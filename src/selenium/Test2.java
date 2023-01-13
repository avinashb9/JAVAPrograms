package selenium;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int legs = 300;
		int heads = 100;
		
		for(int i=0;i<=heads;i++) {
			for(int j=0;j<=heads;j++) {
				if((2* i + 4 * j == legs) && (i + j == heads)) {
					System.out.println("Cats:"+i+"\t Dogs:"+j);
					break;
				}
			}
		} 
		
	}

}
