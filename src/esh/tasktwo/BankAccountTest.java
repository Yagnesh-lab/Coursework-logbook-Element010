/* Bank account that stores "John" and "Joe" banking details.
 * Furthermore, user are allowed to add two new accounts.*/

package esh.tasktwo;

import javax.swing.*;

public class BankAccountTest {
	public static JOptionPane box = new JOptionPane();

	public static void main(String[] args) {
		
		// Stores banking detail about the balance and name of account holder.
		BankAccount first = new BankAccount(2700, "John");
		BankAccount second = new BankAccount(-120, "Joe");
		
		System.out.println(first.getName() + "bank account: " + first.getBalance());
		System.out.println(second.getName() + "bank account: " + second.getBalance());
		
		//b
		BankAccount third = new BankAccount();
		BankAccount fourth = new BankAccount();
		
		//Display Balance and Name of bank account
		JOptionPane.showMessageDialog(box,  "Name: " + third.getName() +  " Balance: " + third.getBalance()
		                        		+ "\n Name; " + fourth.getName() + " Balance: " + fourth.getBalance());

	}

}

//Class for banking information.
class BankAccount {
	public static JOptionPane box = new JOptionPane();
	
	// Account holder name
	private String name; 
	// Balance of account
	private float balance;  
	
	public BankAccount() {
		name = JOptionPane.showInputDialog(box, "Enter name");
		
		// Get string
		String input = JOptionPane.showInputDialog(box, "Enter money"); 
		// Convert string into float
		float startBalance = Float.valueOf(input);
		// Stores the float into balance
		balance = startBalance;
	}
	
	public  BankAccount(float startBalance, String startName) {
		name = startName; 
		balance = startBalance;
		
	}
	// Return balance to main
	public float getBalance() {
		return balance;
		
	}
	
	public void pauIn(float balance) {
		this.balance += balance;
	}
	// Return name to main
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
