package javatpoint;

public class CallByRef {
	
	int i = 50;
	
	public CallByRef(int i) {
		this.i = i + 50;
	}
	
	public CallByRef() {
		
	}
	
	public CallByRef(CallByRef c) {
		this.i = c.i + 100;
	}
	
	public void print() {
		System.out.println(this.i);
	}
	
	public static void main(String[] args) {
		CallByRef cbr = new CallByRef(50);
		CallByRef cbr1 = new CallByRef();
		cbr.print();
		cbr1.print();
		CallByRef cbr2 = new CallByRef(cbr);
		cbr2.print();
	}

}
