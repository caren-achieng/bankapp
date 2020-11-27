import java.util.Scanner;

public class BankingApplication 
{
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		
		System.out.println("Hello. Welcome to Kenya National Bank. Would you like to create an account? (Yes/No)");
		String answer = keyboard.nextLine();
		String fname = null;
		
		if(answer.equalsIgnoreCase("yes"))
		{
			System.out.println("Please enter your first name.");
			fname = keyboard.nextLine();
			
			while(!fname.matches("[a-zA-Z ]+"))
			{
				System.out.println("Enter a valid first name.");
				fname = keyboard.nextLine();
			}
		}
		else
		{
			System.out.println("Thank you for choosing the Kenya National Bank.");
			System.exit(0);	
		}
		
		System.out.println("Enter your second name.");
		String lname = keyboard.nextLine();
		
		while(!lname.matches("[a-zA-Z ]+"))
		{
			System.out.println("Enter a valid first name.");
			lname = keyboard.nextLine();
		}
		
		System.out.println("Enter your national identification number.");
		String idno = keyboard.nextLine();
		
		while(!idno.matches("[0-9]+"))
		{
			System.out.println("Enter a valid first name.");
			idno = keyboard.nextLine();
		}
		
		System.out.println("Enter your account number.");
		String accountid = keyboard.nextLine();
		
		while(!accountid.matches("[0-9]+"))
		{
			System.out.println("Enter a valid first name.");
			accountid = keyboard.nextLine();
		}
		
		SubClass z = new SubClass(fname, lname, idno, accountid);
		z.choose();
		
		
	}
}

