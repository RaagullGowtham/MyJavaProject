package dependencyinjection;

public class A {
//	property
	String msg;
	int a;

	public A() {
		System.out.println("A constructor");
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void m1() {
		System.out.println("A m1()");
		System.out.println("msg: " + msg + " " + "a= " + a);

	}
}