package pack1;

// BANK MANAGEMENT SYSTEM MINI PROJECT 

// NAME: AMAN NARAYAN SINGH; USN: 4NI19IS119; BRANCH: ISE; SECTION: B

import java.io.*;
import java.util.*;
import pack2.phone;								// IMPORTING PACK2 FILES ONE BY ONE 
import pack2.phone_delete;						//WE CAN ALSO IMPORT ALL CLASSES OF pack2 PACKAGE BY import pack2.*;
import java.lang.*;
import pack2.Implementing_thread;

class create_account{
	
	public int balance;							// ACCESS SPECIFIERS 
	protected String type;
	private String code="0160";
	
	create_account(){							//DEFAULT CONSTRUCTOR TO GIVE DEFAULT DETAILS TO A NEWLY CREATED ACCOUNT.
		
		balance=10000;
		type="Savings";
		
	}
	void new_account(String name, String phone) throws Exception{ 						// THROWS KEYWORD 
		
		System.out.println("BANK BRANCH CODE: "+code);
		File file = new File("D:\\Aman Narayan Singh\\NIE\\Course Materials\\4th Sem\\BANK MANAGEMENT SYSTEM OOPJ\\"+phone+".txt");
		
		if(!file.exists()) {											    
			file.createNewFile();											// CREATE FILE(ACCOUNT) FOR NEW CUSTOMER
			try {															// TRY CATCH STATEMENTS 
				FileWriter fw=new FileWriter(file,true);					// FILE HANDLING IN JAVA USING FILEWRITER AND BUFFERED WRITER 
				BufferedWriter bw=new BufferedWriter(fw);					// CLASS TO PERFORM WRITE OPERATION.
				bw.write(phone);
				bw.close();
			}
			finally{														//FINALLY KEYWORD 
				System.out.println("Account created successfully\n");
			}	
		}
		else {
			System.out.println("Account already exists.");
		}
	}
}



public class main_page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);			// SCANNER CLASS USAGE 
		
		create_account acc=new create_account();		// CREATING AN OBJECT acc OF create_account CLASS
		welcome wel=new welcome();
		
		conclusion conc=new conclusion();
		endline l=new endline();
		
		wel.display();									//FUNCTION CALL FROM ANOTHER CLASS FILE 
		
		
		System.out.println("Please choose an option to proceed: ");
		
		int choice;
		
		do {
			
			choice=0
					;
			System.out.println();
			System.out.println("1. Create Account");
			System.out.println("2. Withdraw");
			System.out.println("3. Deposit");
			System.out.println("4. Check Balance");
			System.out.println("5. Employee List and check employement");
			System.out.println("6. Contact number registration confirmation");
			System.out.println("7. Delete account");
			System.out.println("8. Exit");
			
			System.out.println("Enter a valid option: ");
			choice=sc.nextInt();
			
			switch(choice) {
			
				case 1: System.out.println("Please enter your name: ");
						String name = sc.nextLine();
						sc.nextLine();
						System.out.println("Please enter your phone number: ");
						String phone= sc.nextLine();
						try {
							acc.new_account(name, phone);
						}
						catch(Exception e) {
							System.out.println("Error! Not able to create account");
						}
						break;
						
				case 2: int amount;
						System.out.println("Enter the amount to be withdrawn: ");
						amount=sc.nextInt();
						withdraw_account wd=new withdraw_account();
						wd.withdraw(amount);
						break;
						
				case 3: int amount_deposit;
						System.out.println("Enter the amount to be deposited: ");
						amount_deposit=sc.nextInt();
						deposit_account da=new deposit_account();
						da.deposit(amount_deposit);
						break;
						
				case 4: check_balance cb=new check_balance();
						cb.check_bal(acc.balance);		
						break;
						
				case 5: employee emp=new employee();
						System.out.println("Enter an option:");
						int option=sc.nextInt();
						
						if(option==1) {
							emp.check();
						}
						else {
							emp.emp_list();
						}
						break;
						
				case 6: // Here phone number key acts as a primary key.
						phone p=new phone();
						p.display_phone();
						String str_ph=sc.next();
						p.display_phone(str_ph);
						break;
						
				case 7: phone_delete del=new phone_delete();
						String ph_del=sc.next();
						phone_delete d_phone=new phone_delete(ph_del);
						break;
						
				case 8: System.out.println("EXIT");
						break;
						
				default:System.out.println("Please enter a valid option.");
						break;
						
			}
			
		}while(choice!=8);
		
		System.out.println();
		
		//Implementing_thread obj =new Implementing_thread();
		new Implementing_thread();
		
		try {
			for(int i=3;i>0;i--) {
				System.out.println("Main program or main thread will be closed in: "+i+" seconds.");
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			System.out.println("Error! Unable to exit the Main program");
		}
		System.out.println("Exiting Main program.");
		
		conc.display();
		l.line();
		thanks thank=new thanks();
		lastline la=new lastline();
		la.thnks(thank);
		la.display(thank);
		
	}
	// NAME: AMAN NARAYAN SINGH; USN: 4NI19IS119; BRANCH: ISE; SECTION: B

}
