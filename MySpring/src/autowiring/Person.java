package autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {
	@Autowired
    @Qualifier("trichyaddress")
	Address address;
	public Person() {
		
	}
	
	@Override
	public String toString() {
		return "Person [address=" + address + "]";
	}
   
	
	public void setAddress(Address address) {
		this.address = address;
	}

	public Person(Address address) {
		this.address=address;
	}
	
	
	
	

}
