import java.util.*;
public class ATM {

	public static void main(String[] args) {
    Scanner console = new Scanner (System.in);
    System.out.println("1- Check balance");
    System.out.println("2- Deposit Money");
    System.out.println("3- Withdraw Money");
    System.out.println("4- Exit");
    System.out.println();
    System.out.println("Choose a number");
    int x = console.nextInt();
    if (x==1) {
    	System.out.println("Bank Balance = 1000 $");}
    else if (x==2) {
    	System.out.println("Enter the amount you want to deposit : ");
    	long y = console.nextLong();
    	System.out.println(y+" $ are deposited to your account balance");
        System.out.println("Your new account balance = "+(1000+y)+" $");}
    else if (x==3) {
    	System.out.println("Enter the amount you want to withdraw : ");
    	long z = console.nextLong();
    	System.out.println(z+" $ are deposited from your account balance");
        System.out.println("Your new account balance = "+(1000-z)+" $");}
    else {
    	System.out.println("THANK YOU");
    }
    	
    
    
    
    }
    }