package javatpoint;

public class Singleton {
	
	//class variable
	private static Singleton singleton;
	
	//private constructor
	private Singleton() {
		System.out.println("Constructor called");
	}
	
	//static method to get singletonObject
	public static Singleton getSingleton() {
		if(singleton == null){
			singleton = new Singleton();
		}
		return singleton;
	}
	
	public void display() {
		System.out.println("displaying...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton.getSingleton().display();
		Singleton.getSingleton().display();
	}

}
