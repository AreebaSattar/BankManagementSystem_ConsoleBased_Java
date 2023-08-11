import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class User 
{
	public User()
	{
		super();
	}
	
	public String U_Name;
	public String U_Address;
	public String U_Ph_Num;
	protected String U_Acc_Num;
	Saving_Acc Save_Acc;
	Checking_Acc Check_Acc;
	int CountSave = 0;
	int CountCheck=0;
	
	
	public User(String u_Name, String u_Address, String u_Ph_Num, String u_Acc_Num, Saving_Acc save_Acc,
			Checking_Acc check_Acc, int countSave, int countCheck) {
		super();
		U_Name = u_Name;
		U_Address = u_Address;
		U_Ph_Num = u_Ph_Num;
		U_Acc_Num = u_Acc_Num;
		Save_Acc = save_Acc;
		Check_Acc = check_Acc;
		CountSave = countSave;
		CountCheck = countCheck;
	}
	public User(String u_Name, String u_Address, String u_Ph_Num) {
		super();
		U_Name = u_Name;
		U_Address = u_Address;
		U_Ph_Num = u_Ph_Num;
		//U_Acc_Num = u_Acc_Num;
	}
	public void UserAddingg(String u_Name, String u_Address, String u_Ph_Num)
	{
		//super();
		U_Name = u_Name;
		U_Address = u_Address;
		U_Ph_Num = u_Ph_Num;
		//U_Acc_Num = u_Acc_Num;
	}
	public void AddUserss(String u_Name, String u_Address, String u_Ph_Num)
	{
		Scanner inc = new Scanner(System.in);
		//String name,add,ph;
		System.out.println("Enter User name: ");
		//name= inc.nextLine();
		System.out.println("Enter User Address: ");
		//add= inc.nextLine();
		System.out.println("Enter User Phone Number: ");
		//ph= inc.nextLine();
	}
	
	public String getU_Name() {
		return U_Name;
	}
	public void setU_Name(String u_Name) {
		U_Name = u_Name;
	}
	public String getU_Address() {
		return U_Address;
	}
	public void setU_Address(String u_Address) {
		U_Address = u_Address;
	}
	public String getU_Ph_Num() {
		return U_Ph_Num;
	}
	public void setU_Ph_Num(String u_Ph_Num) {
		U_Ph_Num = u_Ph_Num;
	}
	public String getU_Acc_Num() {
		return U_Acc_Num;
	}
	public void setU_Acc_Num(String u_Acc_Num) {
		U_Acc_Num = u_Acc_Num;
	}
	public static boolean createNewFile() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
}
