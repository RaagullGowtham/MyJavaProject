package valueannotation.copy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import springbasics.Person;

public class App {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("valueannotationdemo2.xml");
		Person p = ctx.getBean("person1", Person.class);
		System.out.println(p);

//		ApplicationContext ctx = new AnnotationConfigApplicationContext(Myconfig.class);
//		Person p = (Person) ctx.getBean("person");
//		System.out.println(p);
	}

}