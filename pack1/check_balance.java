package pack1;
import java.text.*;
import java.util.*;
public class check_balance extends create_account{			// SINGLE LEVEL INHERITENCE 
	public void check_bal(int balance) {
		
		int bal=balance;
		NumberFormat us=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat ind=NumberFormat.getCurrencyInstance(new Locale( "en", "IN"));
        NumberFormat ch=NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat fr=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
		System.out.println("Your current balance will be dsplayed in currency format of INDIA, USA, FRANCE and CHINA: ");
		System.out.println();
        
        System.out.println("US: " + us.format(bal/74.75));
        System.out.println("India: " +  ind.format(bal));
        System.out.println("China: " + ch.format(bal/11.53));
        System.out.println("France: " + fr.format(bal/88.38));
        	
	}
}
