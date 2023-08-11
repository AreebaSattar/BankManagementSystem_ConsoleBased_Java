import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class func {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	Saving_Acc Save_Acc;
	Checking_Acc Check_Acc;
	User cc[];
	int counttt = 1;
	String funcT;
	Date time;
	double amountt;
	
		
	public void transset(String Ft, double Mon) throws IOException
	{
		//ReadCustomerss(functtt);
		
		amountt= Mon;
		time = new Date();
		funcT= Ft;
		File objFile = new File("C:\\Users\\DELL\\eclipse-workspace\\Task\\Transaction.txt");
		if(objFile.createNewFile())
		{
			System.out.println("File created: "+ objFile.getName());
		}
		else 
		{
			System.out.println("file already exists.");
		}
		FileWriter myWriter = new FileWriter("C:\\Users\\DELL\\eclipse-workspace\\Task\\Transaction.txt",true);
	      /*myWriter.write("Transaction No.  "+counttt+"\n");
	      myWriter.write("Type is  "+funcT+"\n");
	      myWriter.write("Amount equals  "+amountt+"\n");
	      myWriter.write("Time of transaction "+time+"\n");*/
		myWriter.write(counttt+","+funcT+","+amountt+","+time+"\n");
		counttt++;
		
	      myWriter.close();
	      System.out.println("Successfully wrote to the file.");
	}
	public void alldetails() throws IOException
	{
		System.out.print("Transaction No.  "+counttt+"\n"); 
		System.out.print("Type is  "+funcT+"\n"); 
		System.out.print("Amount equals  "+amountt+"\n"); 
		System.out.print("Time of transaction "+time+"\n"); 
		
	
	}
	
	
	

}
