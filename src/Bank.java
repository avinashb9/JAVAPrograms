
public interface Bank {
	
	float ROI = 4.0f;
	
	default float rateOfInterest() {
		return this.ROI;
	}

}

class SBI implements Bank{

	/*
	 * @Override public float rateOfInterest() { // TODO Auto-generated method stub
	 * return Bank.ROI + 3.5f; }
	 */
	
}

class InterfaceTest{
	
	public static void main(String[] args) {
		Bank b = new SBI();
		
		System.out.println(b.rateOfInterest());
	}
}
