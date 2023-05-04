package dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//		AB ab = (AB) ctx.getBean("abobj");
//		ab.show();

		// using XML Configuration

//		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//		AB ab = (AB) ctx.getBean("abobj");
//		ab.show();

		// using Java class annotation

		ApplicationContext ctx = new AnnotationConfigApplicationContext(Myconfig.class);

		AB ab = (AB) ctx.getBean("ab");
		ab.show();
	}

}