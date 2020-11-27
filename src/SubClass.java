import java.util.Scanner;

public class SubClass 
{
	//instance variables
		private double balance;
		private double prevTransaction;
		private String fname;
		private String lname;
		private String idno;
		private String accountid;
		
	//constructor
		public SubClass(String firstName, String lastName, String identificationNo, String accountNo)
		{
			fname = firstName;
			lname = lastName;
			idno = identificationNo;
			accountid = accountNo;
		}
		
	//depositing cash	
		void deposit(int amount)
		{
			if (amount != 0)
			{
				balance = balance + amount;
				prevTransaction = amount;
			}
		}
		
	//withdrawing cash
		void getwithdrawals(double amount)
		{
			if (amount <= balance)
			{
				balance = balance - amount;
				prevTransaction  = - amount;
			}
			else
			{
				System.err.println("Dear customer, you do not have sufficient funds to make this transaction.");
			}
		}
		
		void gettransaction()
		{
			if(prevTransaction > 0)
			{
				System.out.println("---------------------------------");
				System.out.println("You have deposited: " + prevTransaction);
				System.out.println("---------------------------------");
			}
			else if (prevTransaction < 0)
			{
				System.out.println("---------------------------------");
				System.out.println("You have withdrawn: " + Math.abs(prevTransaction));
				System.out.println("---------------------------------");
			}
			else
			{
				System.out.println("---------------------------------");
				System.out.println("No transaction occured.");
				System.out.println("---------------------------------");
			}
		}
		
		void choose()
		{
			int choice = 0;
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Welcome " + fname);
			System.out.println("Account No : " + accountid + "\n");
			System.out.println("****************************************************");
			System.out.println("----------------------MENU--------------------------");
			System.out.println("****************************************************");
			System.out.println("Press 1 to Check balance.");
			System.out.println("Press 2 to Deposit cash.");
			System.out.println("Press 3 to Withdraw cash.");
			System.out.println("Press 4 to see the previous transaction.");
			System.out.println("Press 5 to exit.");
			System.out.println("****************************************************");
			System.out.println("\n");
			do
			{
				System.out.println("Please enter your choice.");
				
				choice = scanner.nextInt();
				
				switch(choice)
				{
				case 1:
				{
					System.out.println("------------------------------");
					System.out.println("Balance = " + balance);
					System.out.println("------------------------------");
				break;
				}
				
				case 2:
				{
					System.out.println("Please enter the amount you want to deposit.");
					int amount = scanner.nextInt();
					deposit(amount);
				break;
				}
				
				case 3:
				{
					System.out.println("How much would you like to withdraw?");
					int amount1 = scanner.nextInt();
					getwithdrawals(amount1);
				break;
				}
				
				case 4:
				{
					gettransaction();
				break;
				}
				
				case 5:
				{
					System.out.println("_________________________________________________________");
					break;
				}
				
				default:
				{
				System.out.println("Please enter a valid option!!!");
				break;
				}
				}
			
			}while(choice != 5);
				
				System.out.println("Thank you for using our services.");
		}
		
	}


