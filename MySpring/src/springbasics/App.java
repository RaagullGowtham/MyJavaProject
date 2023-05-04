package springbasics;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

//		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml");
//		Employee obj = (Employee) ctx.getBean("emp");
//		obj.showMessage();
		ClassPathXmlApplicationContext ctx2 = new ClassPathXmlApplicationContext("valueannotationdemo2.xml");
		Person person= (Person) ctx2.getBean("person");
		System.out.println(person);

//		Coach coach = ctx.getBean("basketball", Coach.class);
//		coach.todayActivity();
	}

}
