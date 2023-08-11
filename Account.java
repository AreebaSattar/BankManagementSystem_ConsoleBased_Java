import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Account 
{
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}


	protected int Acc_Num;
	protected double balance;
	protected Date Date_Created;
	//int account =0;
	int done= 0;
	func functtt[]= new func[500];
	
	
	
	public Account(int acc_Num, double balance, Date date_Created) {
		super();
		Acc_Num = acc_Num;
		this.balance = balance;
		Date_Created = date_Created;
	}
	public int getAcc_Num() 
	{
		return Acc_Num;
	}
	public void setAcc_Num(int acc_Num) 
	{
		Acc_Num = acc_Num;
	}
	public double getBalance() 
	{
		return balance;
	}
	public void setBalance(double balance) 
	{
		this.balance = balance;
	}
	public Date getDate_Created()                                           
	{
		return Date_Created;
	}
	public void setDate_Created(Date date_Created)
	{
		Date_Created = date_Created;
	}
	
	
	//Methodssss
	
	public double Check_Bal()
	{
		System.out.println( balance);
		return balance;
	}
	public abstract  double Make_Deposit(double Amount);

	
	 //{ balance = balance + Amount;
	 
	 // return balance; }
	 
	public abstract double Make_Withdrawl(double Amount) throws ParseException;
	public double transfer_Amount(double Amount, int Rec_Acc_Numm, User [] customers) throws IOException, ParseException
	{
		Admin administrator = new Admin();
		
		System.out.println("Counter: ");
		System.out.println(administrator.AllCounter);
		
		for(int j=0;j<administrator.AllCounter;j++)
		{
			System.out.println("Counter: ");
			System.out.println(administrator.AllCounter);
			if( customers[j].CountCheck==1 && customers[j].Check_Acc.Acc_Num == Rec_Acc_Numm  )
			{
				System.out.println("In Check: ");
				customers[j].Check_Acc.Make_Deposit(Amount);
				functions("deduct",Amount);
				break;
				
			}
			if( customers[j].CountSave==1 && customers[j].Save_Acc.Acc_Num == Rec_Acc_Numm  )
			{
				System.out.println("In Save: ");
				customers[j].Save_Acc.Make_Deposit(Amount);
				functions("transfer",Amount);
				break;
			}
		}
		return Amount;
	}
	public void functions (String trans, double money) throws IOException, ParseException
	{
		////for( int count = 0; count <done;count++)
		//functtt[0]= new func();
		functtt=ReadCustomerss(functtt);
		
			functtt[done]= new func();
			functtt[done].transset(trans,money);
			

			done= done+1;
		//}
	}
	public void DisplayFunc() throws IOException
	{
		for(int jack = 0 ; jack<done; jack++)
		{
			if(functtt[jack].funcT.equals("deduct"))
			{
				functtt[jack].alldetails();
			}
			if(functtt[jack].funcT.equals("zakat"))
			{
				functtt[jack].alldetails();
			}
			/*if(functtt[jack].funcT.equals("deduct"))
			{
				functtt[jack].alldetails();
			}*/
		}
	}
	
		
	
	
	
	
	
	
	
	public func[] ReadCustomerss(func [] functtt) throws IOException, ParseException 
	{ 
		
		int Total = 0;
		try (BufferedReader READDDD = new BufferedReader(new FileReader("C:\\Users\\DELL\\eclipse-workspace\\Task\\Transaction.txt"))) {
		    while (READDDD.readLine() != null)
		    	{
		    		Total++;
		    	}
		} catch (IOException erroee) {
			erroee.printStackTrace();
		}
		      

        functtt = new func[Total];
        int tempcounter = 0;
        for (int jack = 0; jack < Total; jack++) 
        {
            functtt[jack] = new func();
        }
        BufferedReader ReadingBuffer = new BufferedReader(new FileReader("C:\\Users\\DELL\\eclipse-workspace\\Task\\Transaction.txt"));
        
            String stringg;
            while ( (tempcounter <  Total) && ((stringg = ReadingBuffer.readLine()) != null))
            {
                String[] strings = stringg.split(",");
                functtt[tempcounter].counttt =  Integer.parseInt(strings[0]);
                functtt[tempcounter].funcT= strings[1];
                functtt[tempcounter].amountt= Double.parseDouble(strings[2]);
               // functtt[tempcounter].time=strings[2];
                 tempcounter++;
            }
            
            for(int i=0;i<Total;i++)
            {
        System.out.println(functtt[i].counttt);
		System.out.println(functtt[i].funcT);
		 System.out.println( functtt[i].amountt);
            }
            done= Total-1;
		return functtt;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	//}
	//
		
		//balance = balance - Amount;
		
		//return Amount;
	//}
	
	

	
	

	

}
