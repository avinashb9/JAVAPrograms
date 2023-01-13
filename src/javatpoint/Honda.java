package javatpoint;

public class Honda extends Bike{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Honda is running");
	}
	
	//Can not override final method
	/*
	 * public void changeGear() { System.out.println("Gear Changed"); }
	 */
	
	public static void tyres() {
		System.out.println("Honda tyres - 2");
	}
	public static void main(String[] args) {
		Bike b = new Honda();
		b.changeGear();
		b.run();
		Bike.tyres();
		Honda.tyres();
	}

}
