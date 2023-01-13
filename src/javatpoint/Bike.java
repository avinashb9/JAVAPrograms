package javatpoint;

public abstract class Bike {
	
	public Bike() {
		System.out.println("Bike created");
	}
	
	public abstract void run();
	
	public final void changeGear() {
		System.out.println("Gear Changed");
	}
	
	public static void tyres() {
		System.out.println("Tyres - 2");
	}

}
