package pack1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

interface emp1{												// INTERFACE CLASS
	void emp_list();
}
interface emp2{
	void check();
}

public class employee implements emp1,emp2 {    			// multiple interface (CAN MAKE MULTIPLE INHERITENCE POSSIBLE IN JAVA)
	
	employee(){
		System.out.println("1. Check employement");
		System.out.println("2. Display tthe list of all the employees");
	}
	
	public void emp_list() {
		try {
			
			File fl=new File("name.txt");
			Scanner scan_file = new Scanner(fl);
			System.out.println("Displaying the list of all the employees of Central Bank:");
			
			while(scan_file.hasNextLine()) {
				
				System.out.println(scan_file.nextLine());
				
			}
			scan_file.close();
		}
		catch(FileNotFoundException e) {					// FILE NOT FOUND EXCEPTION
			System.out.println("File doesn't exist.");
		}
	}
	
	public void check() {
		System.out.println("Enter the employee's name to be searched: ");
		Scanner p=new Scanner(System.in);
		String s=p.nextLine();
		int flag=1;
		
		try {
			File fl=new File("name.txt");
			Scanner scan=new Scanner(fl);
			while(scan.hasNextLine()) {
				if(scan.nextLine().equals(s)) {												// STRING HANDLING
					System.out.println("Yes! "+s+" is an employee of the Central Bank");
				}
				else {
					flag=0;
					continue;
				}
			}
			
		}
		catch(Exception e) {																// GENERIC EXCEPTION
			System.out.println("Error! File not found.");
		}
		if(flag==0) {
			System.out.println("Not an employee of Central Bank.");
		}
		
	}
}
