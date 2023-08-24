package atmProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AtmOperations implements AtmOpInterface{
	Atm atm = new Atm();
	Map<Double,String> ministmt = new HashMap<>();
	
	//method to view balance
	@Override
	public void viewBalance() {
		System.out.println("\nLoading Account Balance......");
		System.out.println("Your Current Balance is......."+atm.getBalance());
		System.out.println();
	}
	//method to withdraw Amount
	@Override
	public void withdrawAmount(double withdrawAmount){
		Scanner sc = new Scanner(System.in);
		if(withdrawAmount%10==0) {
			if(withdrawAmount<=atm.getBalance()){
				System.out.println("Confirm? Yes/No");
				String confirm = sc.next();
				if(confirm.equals("Yes")) {
					ministmt.put(withdrawAmount,"Amount Withdraw");
					System.out.println("Collect the Cash"+withdrawAmount);
					atm.setBalance(atm.getBalance()-withdrawAmount);
					viewBalance();
				}
			}else {
				System.out.println("Insufficient Balance!!");
			}
		}else {
			System.out.println("Enter the Amount in Multiples of 100");
		}
	}
	
	//method to Deposit Amount
	@Override
	public void depositAmount(double depositAmount) {
		System.out.println("Confirm? Yes/No");
		Scanner sc = new Scanner(System.in);
		String confirm = sc.next();
		if(confirm.equals("Yes")) {
			ministmt.put(depositAmount,"Amount Deposited");
			System.out.println(depositAmount+"Amount Deposited Successfully");
			atm.setBalance(atm.getBalance()+depositAmount);
			viewBalance();
		}
	}
	//method to view Mini statement
	public void viewMiniStatement() {
		for(Map.Entry<Double, String>m:ministmt.entrySet()) {
		 System.out.println(m.getKey()+""+m.getValue());	
		}
	}
	@Override
	public void miniStatement() {	
	}
}
