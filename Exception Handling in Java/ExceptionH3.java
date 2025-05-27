import java.util.*;

class ExceptionH3
{
public static void main(String [] args)
{
	
int AccountBalance = 5000;
System.out.println("Your Curremt balance is :" +AccountBalance);
Scanner sc = new Scanner(System.in);
System.out.println("Hey Enter Amount to Withdrawal: ");
int WithdrawalBalance = sc.nextInt();

try
{
	if(AccountBalance < WithdrawalBalance)
	{
		throw new ArithmeticException("Insufficient Balance");
	}
AccountBalance = AccountBalance - WithdrawalBalance;

	
System.out.println("Transaction Successfull");
System.out.println("Hey Your Current Balance is: " +AccountBalance );
}
catch(ArithmeticException e1)
{
System.out.println(e1.getMessage());
}
}
}