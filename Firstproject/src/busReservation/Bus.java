package busReservation;

public class Bus {
	//for every data(instance variable inside a class are safe to put in private
	private int busNo;
	private boolean ac;
	private int capacity;
	//for accessing the private methods get(getting) and set(changing) methods created
	
	Bus(int no,boolean ac,int cap){
		this.busNo = no;;
		this.ac = ac;
		this.capacity = cap;
		
	}

	public int getBusNo() {
		return busNo;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int cap) {
		this.capacity = cap;
	}
	
	public void displayBusInfo() {
		System.out.println("Bus No: " + busNo + " Ac: " + ac + "Total Capacity: " + capacity);
	}
}
