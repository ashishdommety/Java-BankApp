package BankStuff;

public class Main {
	public static void main(String[] args) {
		BankAccount person = new BankAccount();
		person.setName("person");
		
		System.out.println("Hello "+ person.getName() +", your current balance is " + person.getBalance());
		
		person.withdraw(300);
		
		System.out.println("Hello, your current balance is " + person.getBalance());
		
		person.deposit(500);
		
		System.out.println("Hello, your current balance is " + person.getBalance());
		
		person.withdraw(1300);
	}
}
