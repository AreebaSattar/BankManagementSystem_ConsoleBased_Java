import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
public class Admin 
{
	int Acc_No = 2345;
	static int AllCounter = 0;
	public void Options(User [] Cus, int counter) throws IOException
	{
		Admin adddminnn= new Admin();
		Scanner inc = new Scanner(System.in);
		System.out.println("1. Opening an account. ");
		System.out.println("2. Closing an account. ");
		System.out.println("3. Display all accounts info.");
		int opt;
		opt = inc.nextInt();
		if(opt ==1 )
		{
			
			//adddminnn.User[](name,add,ph);
			//Account_open( Cus,counter);
			UserAddingss(Cus,AllCounter);
		}
		else if (opt ==2)
		{
			
		}
		else if (opt ==3)
		{
			Display(Cus,AllCounter);
		}
	}
	public void UserAddingss(User [] customers, int check_c) throws IOException
	{
		customers[AllCounter] = new User();
		System.out.println("AllCounter-1 ");
		System.out.println(AllCounter-1);
		Scanner inc = new Scanner(System.in);
		String name,add,ph;
		System.out.println("Enter User name: ");
		name= inc.nextLine();
		System.out.println("Enter User Address: ");
		add= inc.nextLine();
		System.out.println("Enter User Phone Number: ");
		ph= inc.nextLine();
		customers[AllCounter].UserAddingg(name, add, ph);
		//check_c ++;
		Account_open(customers,AllCounter);
		//System.out.println("Accout created successfully	");
	}
	public void Display(User [] customers, int check_c)
	{
		for(int i=0;i<AllCounter;i++)
		{
			int s = i+1;
			System.out.print("User "+ s+" : \n");
			//System.out.println("AllCounter: ");
			//System.out.println(AllCounter);
			//System.out.println(customers[0].U_Acc_Num);
			if(customers[i].CountSave==1)
			{
				System.out.print("U_Name: "+customers[i].U_Name+"\n"); 
				System.out.print("U_Address: "+customers[i].U_Address+"\n");
				System.out.print("U_Ph No:: "+customers[i].U_Ph_Num+"\n");
				System.out.print("U_Account: "+customers[i].Save_Acc.Acc_Num+"\n");
				System.out.print("Date Created: "+customers[i].Save_Acc.Date_Created+"\n");
				System.out.print("Balance: "+customers[i].Save_Acc.balance+"\n");
				
				
			}
			else if (customers[i].CountCheck==1)
			{
				System.out.print("U_Name: "+customers[i].U_Name+"\n"); 
				System.out.print("U_Address: "+customers[i].U_Address+"\n");
				System.out.print("U_Ph No:: "+customers[i].U_Ph_Num+"\n");
				System.out.print("U_Account: "+customers[i].Check_Acc.Acc_Num+"\n");
				System.out.print("Date Created: "+customers[i].Check_Acc.Date_Created+"\n");
				System.out.print("Balance: "+customers[i].Check_Acc.balance+"\n");
			
			}
			System.out.println("\n\n");
			
			
		}
		
		
		
		
		//System.out.println("Accout created successfully	");
	}
	public void UserAdding(User [] customers, int check_c) throws IOException
	{
		customers[0] = new User();
		Scanner inc = new Scanner(System.in);
		String name,add,ph;
		System.out.println("Enter User name: ");
		name= inc.nextLine();
		System.out.println("Enter User Address: ");
		add= inc.nextLine();
		System.out.println("Enter User Phone Number: ");
		ph= inc.nextLine();
		customers[0].UserAddingg(name, add, ph);
		check_c =1;
		Account_open(customers,AllCounter);
		//AllCounter++;
		System.out.println("Account number");
		//System.out.println(customers[0].Save_Acc.Acc_Num);
		//System.out.println("Accout created successfully	");
	}
	public User[] ReadCustomers(User [] CustomerssArrayy) throws IOException, ParseException { 
		File objFile = new File("C:\\Users\\DELL\\eclipse-workspace\\Task\\filename.txt");
Admin administrator = new Admin();
		

int Total = 0;
try (BufferedReader READDDD = new BufferedReader(new FileReader("C:\\Users\\DELL\\eclipse-workspace\\Task\\filename.txt"))) {
    while (READDDD.readLine() != null)
    	{
    		Total++;
    	}
} catch (IOException erroee) {
	erroee.printStackTrace();
}

        CustomerssArrayy = new User[Total];
        int tempcounter = 0;
        for (int jack = 0; jack < Total; jack++) 
        {
            CustomerssArrayy[jack] = new User();
        }

       

        try (BufferedReader ReadingBuffer = new BufferedReader(new FileReader("C:\\Users\\DELL\\eclipse-workspace\\Task\\filename.txt")))
        {
            String stringg;

            while ( (tempcounter <  Total) && ((stringg = ReadingBuffer.readLine()) != null)  ){

                String[] strings = stringg.split(",");


                 CustomerssArrayy[tempcounter].CountSave =  Integer.parseInt(strings[0]);
                CustomerssArrayy[tempcounter].Save_Acc= new Saving_Acc();
                CustomerssArrayy[tempcounter].Save_Acc.Acc_Num= Integer.parseInt(strings[1]);
                CustomerssArrayy[tempcounter].U_Name=strings[2];
                CustomerssArrayy[tempcounter].U_Address=strings[3];
                CustomerssArrayy[tempcounter].U_Ph_Num=strings[4];
               // Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(strings[5]);  
                //CustomerssArrayy[tempcounter].Save_Acc.Date_Created=new SimpleDateFormat("dd/MM/yyyy").parse(strings[5]);
                CustomerssArrayy[tempcounter].Save_Acc.balance =Double.parseDouble( strings[6]);
                administrator.AllCounter++;
             
                    tempcounter++;

                
            }
            
        }
        for(int i=0;i<Total;i++)
        {
        	System.out.println(CustomerssArrayy[i].CountSave);
   		 System.out.println( CustomerssArrayy[i].Save_Acc.Acc_Num);
   		 System.out.println(CustomerssArrayy[i].U_Name);
   		 System.out.println( CustomerssArrayy[i].U_Address);
   		 System.out.println(CustomerssArrayy[i].U_Ph_Num);
   		System.out.println( CustomerssArrayy[i].Save_Acc.Date_Created);
   		 System.out.println(CustomerssArrayy[i].Save_Acc.balance);
        }
        
		
		return CustomerssArrayy;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void Account_open(User [] customers, int check_c) throws IOException
	{
		Scanner impp = new Scanner (System.in);
		System.out.println("Opening Saving Account or Checking Account: ");
		
		String imput ;
		imput = impp.nextLine();
		System.out.println("Enter customers phone number: ");
		String Ph_N;
		Ph_N = impp.nextLine();
		Admin administrator = new Admin();
		//impp.close();
		//customers[0].CountSave=0;
		for(int i=0;i<AllCounter+1;i++)
		{
		//int i = check_c-1;
			System.out.println("AllCounter: ");
			System.out.println(AllCounter);
			if (imput.equals( "Saving"))
			{
				if(customers[i].U_Ph_Num.equals(Ph_N) && customers[i].CountSave==0  )
				{
					Scanner inc = new Scanner(System.in);
					int accountnumber;
					System.out.println("Enter New Acc No. : ");
					accountnumber= inc.nextInt();
					customers[i].CountSave=1;
					customers[i].Save_Acc= new Saving_Acc();
					customers[i].Save_Acc.Acc_Num= accountnumber;
					System.out.println("customers[i].Save_Acc.Acc_Num");
					System.out.println(customers[i].Save_Acc.Acc_Num);
					customers[i].Save_Acc.Date_Created= new Date();
					customers[i].Save_Acc.balance= 250;
					
					//Acc_No = Acc_No +1;
					AllCounter++;
					System.out.println("AllCounter: ");
					System.out.println(AllCounter);
					System.out.println("Account created Successfully!!!");
					File objFile = new File("filee.txt");
					if(objFile.createNewFile())
					{
						System.out.println("File created: "+ objFile.getName());
					}
					else 
					{
						System.out.println("file akready exists.");
					}
					FileWriter myWriter = new FileWriter("filename.txt",true);
				      myWriter.write(customers[i].CountSave+"," + customers[i].Save_Acc.Acc_Num+","+customers[i].U_Name+","+customers[i].U_Address+","+customers[i].U_Ph_Num+","+customers[i].Save_Acc.Date_Created+","+customers[i].Save_Acc.balance+"\n");
				      myWriter.close();
				      System.out.println("Successfully wrote to the file.");
					break;
				}
			}
			else if(imput.equals("Checking"))
			{
				if(customers[i].U_Ph_Num.equals(Ph_N) && customers[i].CountCheck==0  )
				{
					Scanner inc = new Scanner(System.in);
					int accountnumber;
					System.out.println("Enter New Acc No. : ");
					accountnumber= inc.nextInt();
					customers[i].CountCheck=1;
					customers[i].Check_Acc= new Checking_Acc();
					customers[i].Check_Acc.Acc_Num= Acc_No;
					System.out.println("customers[i].Check_Acc.Acc_Num");
					System.out.println(customers[i].Check_Acc.Acc_Num);
					customers[i].Check_Acc.Date_Created= new Date();
					customers[i].Check_Acc.balance= 250;
					System.out.println("Account created Successfully!!!");
					AllCounter++;
					Acc_No = Acc_No +1;
					
					File ssddd = new File("filename.txt");
					if(ssddd.createNewFile())
					{
						System.out.print("file created ");
					}
					else 
					{
						System.out.println("file already exists.");
					}
					FileWriter myWriter = new FileWriter("filename.txt");
				      myWriter.write(customers[i].CountCheck+"," + customers[i].Check_Acc.Acc_Num+","+customers[i].U_Name+","+customers[i].U_Address+","+customers[i].U_Ph_Num+","+customers[i].Check_Acc.Date_Created+","+customers[i].Check_Acc.balance);
				      myWriter.close();
				      System.out.println("Successfully wrote to the file.");
					break;
					
					
					
				}
			}
			
		
			
			//i++;
		}
	}
}
