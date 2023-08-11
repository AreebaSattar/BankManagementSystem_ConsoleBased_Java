import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Main
{

	public static void main(String[] args) throws IOException, ClassNotFoundException, ParseException
	{
		File objFile = new File("filee.txt");
		if(objFile.createNewFile())
		{
			System.out.println("File created: "+ objFile.getName());
		}
		else 
		{
			System.out.println("file already exists.");
		}
		//Checking_Acc Acc = new Checking_Acc();
		
		//User Us = new User();
		
		
		
		
		
		
		User customrss[]= new User[50];
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int ceck_c=1;
		Admin administrator = new Admin();
		System.out.println("Total Accounts: ");
		System.out.println(administrator.AllCounter);
		//administrator.AllCounter
		//administrator.AllCounter++;
		System.out.println("Total Accounts: ");
		System.out.println(administrator.AllCounter);
		administrator.UserAdding(customrss, administrator.AllCounter);
		System.out.println("Account number");
		System.out.println(customrss[0].Save_Acc.Acc_Num);
		customrss=administrator.ReadCustomers(customrss);
		System.out.println(customrss[0].Save_Acc.Acc_Num);
		//System.out.println(customrss[1].Save_Acc.Acc_Num);
		//System.out.println(customrss[2].Save_Acc.Acc_Num);
		//System.out.println(customrss[0].Check_Acc.Acc_Num);
		
		ceck_c =1;
		Scanner inpp = new Scanner(System.in);
		while(true)
		{
			System.out.println("Are you 1. An Admin or 2. A customer? ");
			System.out.println("Enter: ");
			int user;
			
			user = inpp.nextInt();
			if (user == 1)
			{
				//System.out.println("Helloo");
				//ceck_c++;
				administrator.Options(customrss, ceck_c);
				
				
			}
			else if (user == 2)
			{
				System.out.println("What is your Account No?");
				System.out.println("Enter: ");
				int AccountNumberr;
				AccountNumberr= inpp.nextInt();
				
				
				for(int i=0;i<administrator.AllCounter-1;i++)
				{
					//customrss[i].Check_Acc = new Checking_Acc();
					//customrss[i].Save_Acc = new Saving_Acc();
					//System.out.println(customrss[i].Check_Acc.Acc_Num);
					//System.out.println(administrator.AllCounter);

			 		if( customrss[i].CountCheck==1 && customrss[i].Check_Acc.Acc_Num == AccountNumberr  )
					{
			 			int opt=0;
			 			while(opt!=7)
			 			{
			 				
			 			
						//customrss[i].Check_Acc = new Checking_Acc();
			 				customrss[i].Check_Acc.Opt();//Optionsss
			 			
						
						opt = inpp.nextInt();
						if (opt == 1)
						{
							System.out.println("How much money you want to Transfer? ");
							double Amount;
							Amount = inpp.nextDouble();		
							System.out.println("Enter reciever acc no. ");
							int Acc;
							Acc = inpp.nextInt();
							customrss[i].Check_Acc.Make_Withdrawl(Amount);
							customrss[i].Check_Acc.transfer_Amount( Amount, Acc, customrss);
							
								
						}
								
						else if (opt ==2)
						{
							//customrss[i].Check_Acc.Make_Withdrawl(customrss[i].Check_Acc.balance);
							//customrss[i].Check_Acc.balance
							System.out.println("How much money you want to Withdraw? ");
							double Amount;
							Amount = inpp.nextDouble();
							customrss[i].Check_Acc.Make_Withdrawl(Amount);

								
						}
						else if (opt ==3)
						{
							
							System.out.println("Enter the Amount you want to deposit: ");
							double  Amount;
							Amount= inpp.nextDouble();
							customrss[i].Check_Acc.Make_Deposit(Amount);
							
						}
						else if (opt == 4)
						{
							//customrss[i].Check_Acc.Check_Interest();
								
						}
						else if (opt == 5)
						{
							
								customrss[i].Check_Acc.Check_Bal();
						}
						else if (opt == 6)
						{
							
								customrss[i].Check_Acc.Display(customrss,i);
								
								
							//}
						}
						else if (opt == 7)
						{
							
								break;
						}
						
			 			}
					}
			 		else if( customrss[i].CountSave==1 && customrss[i].Save_Acc.Acc_Num == AccountNumberr  )
					{
						int opt = 0;
						/*System.out.println("*******************");
						System.out.println("1. Transfer Money.");
						System.out.println("2. WithDraw Money.");
						System.out.println("3. Deposit Money.");
						System.out.println("4. Check Balance");
						System.out.println("5. Check Zakaat");
						System.out.println("6. Display User Info");
						System.out.println("7. Deductions Displaying.");
						System.out.println("8. Go Back");
						System.out.println("*******************");
						System.out.println("Enter: ");*/
						while(opt != 9)
						{
							
						
						customrss[i].Save_Acc.func();
						
						
						opt = inpp.nextInt();
						if (opt == 1)
						{
												
							System.out.println("How much money you want to Transfer? ");
							double Amount;
							Amount = inpp.nextDouble();		
							System.out.println("Enter reciever acc no. ");
							int Acc;
							Acc = inpp.nextInt();
							customrss[i].Save_Acc.Make_Withdrawl(Amount);
							customrss[i].Save_Acc.transfer_Amount( Amount, Acc, customrss);
								
						}
								
						else if (opt ==2)
						{
							
							System.out.println("Enter the Amount you want to WithDraw: ");
							double  Amount;
							Amount= inpp.nextDouble();
							System.out.println(customrss[i].Save_Acc.Acc_Num);
							System.out.println(i);
							customrss[i].Save_Acc.Make_Withdrawl(Amount);
							
						}
						else if (opt ==3)
						{
							System.out.println("Enter the Amount you want to deposit: ");
							double  Amount;
							Amount= inpp.nextDouble();
							customrss[i].Save_Acc.Make_Deposit(Amount);
						}
						
						else if (opt == 4)
						{
							
							customrss[i].Save_Acc.Check_Bal();
						}
						else if (opt == 5)
						{
							
							customrss[i].Save_Acc.Check_Zakaat();
						}
						else if (opt == 6)
						{
							customrss[i].Save_Acc.Displays(customrss,i);
							
							
						}
						else if (opt == 7)
						{
							customrss[i].Save_Acc.Check_Interest();
							
						}
						else if (opt ==8)
						{
							System.out.println("ss");
							customrss[i].Save_Acc.DisplayFunc();
							//customrss[i].Save_Acc.fileread();
							//customrss[i].Save_Acc.readTrainsFromFile();
							//customrss[i].Save_Acc.Adding_transactions(customrss);
							
						}
						else if(opt ==9)
						{
							break;
						}
						
						}
					}
				}
				
				
					
					
					
				
				
			}
			
		}
		
		
		//inpp.close();
		
		
		
		
	}

}
