package autowiring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Myconfig {
	
	@Bean
	@Qualifier("chennaiaddress")
	public Address address() {
		Address addr=new Address();
		addr.setCity("Chennai");
		addr.setDoorNo(13);
		addr.setStreet("12th Main Road");
		return addr;
	}
	
	@Bean
	@Qualifier("trichyaddress")
	public Address address2() {
		Address addr=new Address();
		addr.setCity("Trichy");
		addr.setDoorNo(13);
		addr.setStreet("13th Main Road");
		return addr;
	}
	
	@Bean 
	public Person person() {
		
		Address addr=new Address();
		addr.setCity("Chennai");
		addr.setDoorNo(13);
		addr.setStreet("12th Main Road");
		Person person=new Person();
		person.setAddress(addr);
		return person;
		
	}

}
