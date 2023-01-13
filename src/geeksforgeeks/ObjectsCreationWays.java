package geeksforgeeks;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * 1.Using new keyword
2. Using new instance
3. Using clone() method
4. Using deserialization
5. Using newInstance() method of Constructor class
*/
public class ObjectsCreationWays implements Cloneable{
	
	private String name ="Avinash";
	
	public ObjectsCreationWays() {
		System.out.println("Constructor called...");
	};
	
	 public ObjectsCreationWays(String name) { super(); this.name = name;
	 System.out.println("String Constructor called...");} 
	 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
    protected Object clone()
        throws CloneNotSupportedException
    {
        // Super() keyword refers to parent class
        return super.clone();
    }

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//2. Using new instance
		ObjectsCreationWays ocw = null;
		try {
			Class cls = Class.forName("geeksforgeeks.ObjectsCreationWays");
			ocw = (ObjectsCreationWays)cls.newInstance();
			System.out.println(ocw.name);
			ocw.setName("New Name");
			System.out.println(ocw.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//3. Using clone() method - implements Clonable interface - constructor doesn't get called
		ObjectsCreationWays ocw2 = null;
		try {
			ocw2 = (ObjectsCreationWays) ocw.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(ocw2.getName());
		
		//5. Using newInstance() method of java.lang.reflect.Constructor class
		try {
			Constructor<ObjectsCreationWays> constructor = ObjectsCreationWays.class.getDeclaredConstructor(String.class);
			ObjectsCreationWays ocw3 = constructor.newInstance("Another Name");
			System.out.println(ocw3.getName());
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
