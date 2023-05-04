package dependencyinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Myconfig {
	A aobj;

	@Bean
	public AB ab(A aobj, B bobj) {
		AB ab = new AB(aobj, bobj);
		ab.setAobj(aobj);
		return ab;

	}

//
	@Bean
	public A createA() {
		aobj = new A();
		aobj.setA(90);
		aobj.setMsg("Good Afternoon");
		return aobj;
	}

//
	@Bean
	public B createB() {
		return new B(67, "Good Sunday");
	}
//
}