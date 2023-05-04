package dependencyinjection;

public class AB {
	// property
	A aobj = null;
	B bobj = null;

	// setter injection
	public void setAobj(A refobj) {
		aobj = refobj;
	}

//constructor Injection
	AB(A refobj, B refobj2) {
		System.out.println("AB constructor");
		this.aobj = refobj;
		this.bobj = refobj2;

	}

	public void show() {
		aobj.m1();// m1 method in A class
		bobj.m2();// m2 method in B class

	}

}