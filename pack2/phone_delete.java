package pack2;

import java.io.File;

public class phone_delete {
	
	String ph;
	
	public phone_delete(){
		
		System.out.println("Enter the phone number to delete the account of the customer: ");
		ph=this.ph;						// 'this' keyword 
	}
	public phone_delete(String ph){		//PARAMETERISED CONSTRUCTOR   AND    OVERLOADING FUNCTION phone_delete()
		
		File file=new File("D:\\Aman Narayan Singh\\NIE\\Course Materials\\4th Sem\\BANK MANAGEMENT SYSTEM OOPJ\\"+ph+".txt");
		if(file.delete()) {
			System.out.println("Account deleted: "+file.getName());
		}
		else {
			System.out.println("Unable to delete file.");
		}
	}

}
