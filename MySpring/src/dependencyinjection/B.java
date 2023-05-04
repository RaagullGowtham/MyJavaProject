package dependencyinjection;

public class B {
//	property
	int b;
	String msg;

	public B(int b, String msg) {
		System.out.println("B Constructor");
		this.b = b;
		this.msg = msg;
	}

	public void m2() {
		System.out.println("B m2()");
		System.out.println("msg: " + msg + " " + "b= " + b);
	}

}
