package javatpoint;

public class ThreadEx extends Thread{

	public void run() {
		System.out.println("Thread is running...");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx te = new ThreadEx();
		System.out.println(te.getId());
		System.out.println(te.getName());
		System.out.println(te.getPriority());
		System.out.println(te.getClass());
		System.out.println(te.getState());
		
		System.out.println("**********");
		te.start();
		System.out.println(te.getState());
	}

}
