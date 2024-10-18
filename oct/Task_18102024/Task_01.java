package oct.Task_18102024;

//✅ Calculator using switch case

import java.util.Scanner;
public class Task_01 {
	public static void main(String args[]) {
		
		double num1 = 0, num2 = 0;
		Scanner sc = new Scanner(System.in);
		 
		
		//Check for valid input for the first number
		while(true){
		System.out.print("Enter 1st Number for Calculation--:" );
		
		if(sc.hasNextDouble()){  // Check if the next input is a double
			num1 = sc.nextDouble();
			break; // Exit the loop if input is valid
		}else{
			 System.out.println("Error!!!! Please enter a valid number.");
			 sc.next();// Clear the invalid input
		}
		}
		
		// Check for valid input for the second number
		while(true){
		System.out.println("Enter 2nd Number for Calculation--:" );
		
		if(sc.hasNextDouble()){// Check if the next input is a double
			num2 = sc.nextDouble();
			break;// Exit the loop if input is valid
		}else {
			 System.out.print("Error!!!! Please enter a valid number.");
			 sc.next(); // Clear the invalid input
		}
		}
	
		
		System.out.println("Please Enter Operator for Calculation " );
		char op = sc.next().charAt(0);
		
		
		switch(op) {
		case '+':
			System.out.println(num1 + num2);
			break;
			
		case '-':
			System.out.println(num1 - num2);
			break;
			
		case '*':
			System.out.println(num1 * num2);
			break;
			
		case '/':
			if(num2 != 0) { //check the num2 input is not zero
				System.out.println(num1 / num2);
			}else {
				System.out.println("Error!!!! Cannot Divide by Zero");
			}
			break;
		
		default:
			System.out.println("Error!!!! Operator is Incorrct");
			break;
		}
		sc.close();
	}
}
