package pack1;

public class deposit_account extends create_account{		//HIERARCHY LEVEL IHERITENCE 
	
	void deposit(int amount) {
		
		balance+=amount;
		System.out.println("Total amount currently available in your account = "+balance);
		check_balance sk=new check_balance();
		sk.check_bal(balance);
		
	}
	
	deposit_account(){
		
		super();																			// super keyword 
		System.out.println("The default balance in your account should be Rs"+balance);
		System.out.println("Account type: "+type);
		
	}

}
