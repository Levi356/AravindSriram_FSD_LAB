package main;
import java.util.Scanner;
import interfaces.ICredentials;
import model.Employee;
import services.CredentialServices;

public class Driver {

	private static final int invalid = 0;

	public static void main(String[] args) {
		
		Employee employee = new Employee("levi","akrman");
		
		ICredentials cs = new CredentialServices();
		
		System.out.println("please enter the department form the options ");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resources");
		System.out.println("4.Leagel");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		String generatedEmail= null;
		String generatedPassword = null;
		
		switch(option) {
		
		
		case 1: {
			
			generatedEmail= cs.generateEmailAddress(employee.getFirstName(),employee.getLastName(),"tech");
            generatedPassword = cs.generatePassword();
		     break;
		}
		        
		case 2: {
			
			generatedEmail= cs.generateEmailAddress(employee.getFirstName(),employee.getLastName(),"admin");
	        generatedPassword = cs.generatePassword();
	     break;
		}
		
		case 3: {
			
			generatedEmail= cs.generateEmailAddress(employee.getFirstName(),employee.getLastName(),"HR");
	        generatedPassword = cs.generatePassword();
	     break;
		}
		
		case 4: {
			
			generatedEmail= cs.generateEmailAddress(employee.getFirstName(),employee.getLastName(),"Leagel");
	        generatedPassword = cs.generatePassword();
	     break;
		}
		
		default :   {
			System.out.println("Enter a valid option!");
			
	     }
	       System.exit(invalid);
	}
		
          employee.setEmail(generatedEmail);
          employee.setPassword(generatedPassword);
          cs.showCredentials(employee);
          sc.close();
             
   }
}  
