package services;
import java.util.Random;
import interfaces.ICredentials;
import model.Employee;

public class CredentialServices implements ICredentials {

	
	public String generatePassword() {
	String capitalLetters ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String smallLetters   ="abcdefghijklmnopqrstuvwxyz";
	String numbers        ="0123456789";
	String symbols        ="!@#$%&*";
	
	String value = capitalLetters + smallLetters + numbers + symbols;
    
	Random random = new  Random();
	
	String password="";

	for (int i=0;i<8;i++) {
		
	password += String.valueOf(value.charAt(random.nextInt(value.length())));	
		
	}
	
		return password;
	}
	
	public String generateEmailAddress(String firstName, String lastName, String department) {
		
		return firstName+lastName+"@"+department+".gl.com";
	}

	public void showCredentials(Employee employee) {
	     
	  System.out.println("hi "+employee.getFirstName()+" your email address and password is : ");
      System.out.println("email    : "+employee.getEmail());
      System.out.println("password : "+employee.getPassword());
      
	}

}
