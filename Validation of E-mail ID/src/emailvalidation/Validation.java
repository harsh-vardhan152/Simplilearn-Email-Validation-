//Creating a package
package emailvalidation;

//importing all the useful package
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//creating a validation class to check email is valid or not by using regex 
public class Validation {
	int E =0;
	void validation(String arr[]) 
	{
		//creating scanner object
		Scanner sc  =  new Scanner(System.in); 
		
		// taking input from the user in s variable
		System.out.println("Enter emailthat you want to enter/validiate/search");
		String j = sc.next();
		
		// checking the email enter by the user is in correct or not
		Pattern p = Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
		Matcher m = p.matcher(j); 
		boolean b = m.matches();
		
		for(int i=0;i<arr.length;i++) 
		 {
			 String k=arr[i];
			 
			//if the statement is true increase the counter (c) value by 1
			 if(k.equals(j)) 
			 {
				 E++;
			 }
			
		 }
		//check the condition if c is grater than zero or not.
		 if(E>0) 
		 {
			 System.out.println("The email id that is enter are avaliable in our Array");
		 }
		 else 
		 {
			 System.out.println("The email id that is enter are not avaliable in our Array");
		 }
		 
		// checking if the email is valid or not
		 
		 if(b==true) 
		 {
			 System.out.println("The email id enter is valid");
		 }
		 else 
		 {
			 System.out.println("The email id enter is not valid ");
		 }
		 
	}
	
	
	// creating a main method for executation
	
	public static void main(String[] args) {
		
		Scanner sc  =  new Scanner(System.in);
		
		//Decelerating the array contain employee email id
		
		String  EmployeeEmailID[] = {"harsh.vardhan@gmail.com",
				"akansha.patawa.gmail.com",
				"santosh.kumar@gmail.com",
				"jackpot234567@gmail.com"};
		
			Validation obj =  new Validation();//creating validation class object 
			
			obj.validation(EmployeeEmailID);

	}

}