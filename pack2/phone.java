package pack2;

import java.io.*;
public class phone {
	
	public void display_phone() {
		System.out.println("Enter the phone number to check the registration of a phone number");
	}
	public void display_phone(String ph) {							// OVERLOADING display_phone()
		File file = new File("D:\\Aman Narayan Singh\\NIE\\Course Materials\\4th Sem\\BANK MANAGEMENT SYSTEM OOPJ\\"+ph+".txt");
		if(file.exists()) {
			System.out.println("Yes! "+"phone number "+ph+" is registered.");
		}
		else {
			System.out.println("Customer not registered with Central Bank.");
		}
	}

}
