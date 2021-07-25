package pack1;

public class withdraw_account extends create_account{	
	void withdraw(int amount) {							// balance variable inherited here . 
		check_balance sk=new check_balance();
		
		if(balance<=0) {
			System.out.println("Insufficient fund in account.");
		}
		else if(balance>=0 && balance<=10000) {
			if((balance-amount)>=0) {
				balance=balance-amount;
				System.out.println("Remaining balance = "+balance);
				sk.check_bal(balance);
			}
			else {
				System.out.println("Insufficient funds in account.");
			}	
		}
		else {
			balance=balance-amount;
			System.out.println("Remaining balance = "+balance);
			sk.check_bal(balance);
		}
	}

}
