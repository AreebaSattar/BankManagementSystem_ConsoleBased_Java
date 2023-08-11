import java.io.IOException;
import java.text.ParseException;

public class Saving_Acc extends Account
{

	public Saving_Acc() 
	{
		super();
		
	}

	


	

	@Override
	public double Make_Withdrawl(double Amount) throws ParseException 
	{
		if(Amount > balance)
		{
			System.out.println("Your balance is not enough to Withdraw");
		}
		else
		{
			balance = balance - Amount;
			try {
				functions("deduct",Amount);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return balance;
	}

	public void func()
	{
		System.out.println("*******************");
		System.out.println("1. Transfer Money.");
		System.out.println("2. WithDraw Money.");
		System.out.println("3. Deposit Money.");
		System.out.println("4. Check Balance");
		System.out.println("5. Check Zakaat");
		System.out.println("6. Display User Info");
		System.out.println("7. Interest Rate.");
		System.out.println("8. Display deduction.");
		System.out.println("9. Go Back");
		System.out.println("*******************");
		System.out.println("Enter: ");
	}
	public double Check_Interest()
	{
		double Interest = 0;
		//if(balance >= 20000)
		//{
			Interest = (balance*0.01)*1;
			balance = balance - Interest;
			System.out.println("Interest: ");
			System.out.println(Interest);
		//}
		//else if(balance < 20000)
		//{
		//	System.out.println("Not enough balance... Zakat will be deducted for balance >= 20000");
	//	}
		
		return Interest;
		
	}
	
	public double Check_Zakaat() throws ParseException
	{
		double Zakaat = 0;
		if(balance >= 20000)
		{
			Zakaat = (balance*2.5)/100;
			balance = balance + Zakaat;
			System.out.println("Zakat: ");
			System.out.println(Zakaat);
			try {
				functions("zakat",Zakaat);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(balance < 20000)
		{
			System.out.println("Not enough balance... Zakat will be deducted for balance >= 20000");
		}
		
		return Zakaat;
		
	}


	@Override
	public double Make_Deposit(double Amount) {
		balance = balance + Amount;
		 
		 return Amount;
	}






	public void Displays(User[] customrss, int i)
	{
		// TODO Auto-generated method stub
		System.out.println("U_Name: ");
		System.out.println(customrss[i].U_Name);
		System.out.println("U_Address: ");
		System.out.println(customrss[i].U_Address);
		System.out.println("U_Ph No: ");
		System.out.println(customrss[i].U_Ph_Num);
		System.out.println("U_Account No: ");
		System.out.println(customrss[i].Save_Acc.Acc_Num);
		System.out.println("Date Created: ");
		System.out.println(customrss[i].Save_Acc.Date_Created);
		System.out.println("Balance: ");
		System.out.println(customrss[i].Save_Acc.balance);
	}
	
	
	

}
