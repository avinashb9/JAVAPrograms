package javatpoint;

public class NewThread implements Runnable{

	private String name;
	private Thread thread;
	//constructer
	public NewThread(String name) {
		this.name = name;
		thread = new Thread(this,name);
		System.out.println(thread.getName()+" Thread is Created");
		System.out.println(name+" Thread state:"+thread.getState());
		thread.start();//RUNNABLE state - invokes run method
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewThread t1 = new NewThread("t1");
		NewThread t2 = new NewThread("t2");
		NewThread t3 = new NewThread("t3");
//		t1.run();
//		t2.run();
//		t3.run();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
		for(int j=5;j>0;j--) {
			System.out.println(thread.getName()+" Thread : j: "+j);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println(thread.getName()+" Thread is Exited");}
}
