import java.io.IOException;
import java.text.ParseException;

public class Checking_Acc extends Account 
{
	static int counter = 0;

	public Checking_Acc() 
	{
		super();
		// TODO Auto-generated constructor stub
		////////
		/////////
		//////////
		/*
		 * public class Account{

    private Double balance;

    public Account(Double initBalance, String name, int number){
        this.balance = initBalance;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }

	}
		 */
		/////////
		////////
		////////
		
	}

	



	@Override
	public double Make_Withdrawl(double Amount) throws ParseException
	{
		//Account C_Acc = new Account();
		
		double Amu = 0;
		if(Amount > balance)
		{
			Amu= Amount - balance;
			if(Amu > 5000)
			{
				System.out.println("Sorry!!!%nYou can't withdraw!!!");
				//balance = balance - (Amu + balance);
			}
			else 
			{
				balance = balance - (Amu + balance);
				
				if(Checking_Acc.counter >= 2)
				{
					System.out.println("Rs. 10 will be deducted from your account as your free transactions are done");
					if (balance > 0 )
					{
						balance = balance - 10;
						try {
							functions("deduct",10);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					else 
					{
						System.out.println("You can't proceed this transaction");
						//balance = balance
						//return -1;
					}
				}
			}
			
			//System.out.println("Your balance is not enough to Withdraw");
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
			
			if(Checking_Acc.counter >= 2)
			{
				System.out.println("Rs. 10 will be deducted from your account as your free transactions are done");
				if (balance > 0 )
				{
					balance = balance - 10;
					try {
						functions("deduct",10);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else 
				{
					System.out.println("You can't proceed this transaction");
					//return -1;
				}
			}
			
		}
		Checking_Acc.counter++;
		
		
		return balance;
	}
	
	




	@Override
	public double Make_Deposit(double Amount) 
	{
		balance = balance + Amount;
		if(Checking_Acc.counter >= 2)
		{
			System.out.println("Rs. 10 will be deducted from your account as your free transactions are done");
			if (balance > 0 )
			{
				balance = balance - 10;
			}
			else 
			{
				System.out.println("You can't proceed this transaction");
				//return -1;
			}
		}
		Checking_Acc.counter++;
		
		
		 
		 return Amount;
		//return 0;
	}





	public void Display(User[] customrss,int i) 
	{
		
		// TODO Auto-generated method stub
		System.out.println("U_Name: ");
		System.out.println(customrss[i].U_Name);
		System.out.println("U_Address: ");
		System.out.println(customrss[i].U_Address);
		System.out.println("U_Ph No: ");
		System.out.println(customrss[i].U_Ph_Num);
		System.out.println("U_Account No: ");
		System.out.println(customrss[i].Check_Acc.Acc_Num);
		System.out.println("Date Created: ");
		System.out.println(customrss[i].Check_Acc.Date_Created);
		System.out.println("Balance: ");
		System.out.println(customrss[i].Check_Acc.balance);
	}





	public void Opt() 
	
	{
		// TODO Auto-generated method stub
		System.out.println("*******************");
		System.out.println("1. Transfer Money.");
		System.out.println("2. WithDraw Money.");
		System.out.println("3. Deposit Money.");
		System.out.println("4. Calculate Tax");
		System.out.println("5. Check Balance");
		System.out.println("6. Display User Info");
		System.out.println("*******************");
		System.out.println("Enter: ");
		
	}

	
	
}
