package autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("autowiringdemo.xml");
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
//		Address address=(Address)ctx.getBean("chennaiaddress");
//		System.out.println(address);
//		

//		ApplicationContext ctx = new AnnotationConfigApplicationContext(Myconfig.class);
//
////		Person person = (Person) ctx.getBean("person");
////		System.out.println(person);
//		
//		Address address=(Address)ctx.getBean("chennaiaddress");
//		System.out.println(address);
	}

}
