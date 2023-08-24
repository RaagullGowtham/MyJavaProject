package atmProgram;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		AtmOpInterface op = new AtmOperations();
		int atmpin = 1234;
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Yout Bank Account!!!");
		
		while(true) {
			System.out.println("\n1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Mini Statement\n5.Exit");
			System.out.println("Enter Choice:: ");
			int ch = in.nextInt();
			
			if(ch==1) {
				System.out.println("Enter ATM Pin:: ");
				int pin = in.nextInt();
				if(atmpin==pin) {
					System.out.println("Account Aouthorized!\n");
					op.viewBalance();
				}else {
					System.out.println("Incorrect ATM Pin!");
					System.exit(0);
				}
			}
			else if(ch==2) {
				System.out.println("Enter ATM Pin");
				int pin = in.nextInt();
				if(atmpin==pin) {
					System.out.println("Account Aouthorized!!");
					System.out.println("Enter Amount to Withdraw:");
					double withdrawAmount = in.nextDouble();
					op.withdrawAmount(withdrawAmount);
				}else {
					System.out.println("Incorrect Atm Pin!!");
					System.exit(0);
				}
			}
			else if(ch==3) {
				System.out.println("Enter ATM Pin: ");
				int pin = in.nextInt();
				if(atmpin==pin) {
					System.out.println("Account Authorized\n");
					System.out.println("Enter Amount to be Deposited");
					double depositAmount = in.nextDouble();
					op.depositAmount(depositAmount);
				}else {
					System.out.println("Incorrect ATM Pin!!");
					System.exit(0);
				}
			}
			else if(ch==4) {
				System.out.println("Enter the ATM Pin: ");
				int pin = in.nextInt();
				if(atmpin==pin){
					System.out.println("Account Authorized\n");
					System.out.println("Mini Statement");
					System.out.println("************************");
					op.miniStatement();
				}
			}
			else if(ch==5) {
				System.out.println("Collect Your ATM Card\n Thank You for Using Out ATM Machine");
				System.exit(0);	
			}
			
			else {
				System.out.println("Please Enter Valid Choice.");
			}
		}
	}
}
