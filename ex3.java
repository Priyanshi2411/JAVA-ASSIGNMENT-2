//21CE141 : PRIYANSHI TALAVIYA PRAC3 : CLASS
import java.util.*;
public class ex3 {
	 private static int count;
	    private final String id;
	    private double balance;
//method which returns ID
	    public String getId() {
	        return id;
	    }
   //method which returns balance
	    public double getBalance() {
	        return balance;
	    }
    //default constructor
	    public ex3() {
	        count++;
	        if (count < 10) {
	            id = "AC00" + (count);
	        } else {
	            id = "AC0" + (count);
	        }
	        balance = 300;   }
	    //withsraw method
	    public void withdraw(double money) {
	        if (balance - money >= 300) {
	            balance -= money;
	            System.out.println(money + " Rs successfully withdrawn.");
	            System.out.println("Remaining Balance is : " + balance);
	        } else {
	            System.out.println("Insufficient balance to withdraw the amount.");
	        }  }
 //deposite method
	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println(amount + "Rs deposited to your account.");
	        System.out.println("Current Balance is : " + balance); }
	    //method for transfering money
	    public void MoneyTransfer(ex3 obj, double amount) {
	        if (balance - amount >= 300) {
	            balance -= amount;
	            obj.balance += amount;
	            System.out.println(amount + " Rs successfully Transferred.");
	            System.out.println("Remaining Balance is : " + balance);
	        } 
	        else {
	            System.out.println("Insufficient balance to transfer the amount.");
	        }
	    }
	    
	}


