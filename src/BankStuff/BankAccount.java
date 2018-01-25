package BankStuff;

public class BankAccount {
	
	private int balance = 1000;
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void withdraw(int amount) {
		if(balance > amount) {
			balance -= amount;
		}else {
			System.out.println("Insufficient Funds");
		}
	}
	
	public void deposit(int amount) {
		balance += amount;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
}
