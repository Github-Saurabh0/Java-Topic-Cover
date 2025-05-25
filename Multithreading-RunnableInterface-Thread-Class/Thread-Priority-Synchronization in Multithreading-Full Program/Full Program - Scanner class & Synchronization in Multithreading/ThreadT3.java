import java.util.*;

class Account
{
	int currentBal;
	Account(int Bal)
	{
		currentBal = Bal;
	}

public boolean isSufficientBalance(int withdrawalBalance)
{
	if(currentBal > withdrawalBalance)
	{
		return true;	
	}
	else
	{
		return false;
	}
}

public void withdrawal(int withdrawalBalance)
{
	currentBal = currentBal - withdrawalBalance;
	System.out.println("Withdrawal Successfull !!");
	System.out.println("Current Balance is : " + currentBal);
}
}
class Customer implements Runnable
{
	Account h1;
	String name;
	Customer (Account g1, String s1)
	{
		h1 = g1;
		name = s1;
	}
	
	public void run()
	{
		synchronized(h1)
		{
		   Scanner sc = new Scanner(System.in);
		   System.out.println( "Hey " + name +" : " + " Please Enter Your Withdrawal Amount :");
		   int Amount = sc.nextInt();
		   if(h1.isSufficientBalance(Amount))
		   {
		   System.out.println( "Hey " + name +" Your Quick Transaction Details => " );
		   h1.withdrawal(Amount);
		   }
		   else
		   {
		   System.out.println(name+" InSufficient Balance");
		   }
		}
	}
	
}
class ThreadT3
{
	
public static void main(String [] args)
{
	Account a1 = new Account(1000);
	Customer c1 = new Customer(a1, "Payal");
	Customer c2 = new Customer(a1, "Pushpak");
	Thread t1 = new Thread(c1);
	Thread t2 = new Thread(c2);
	t1.start();
	t2.start();
}
}