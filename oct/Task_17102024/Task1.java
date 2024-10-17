package oct.Task_17102024;

// ✅ Grade Calculator:

import java.util.Scanner;
public class Task1 {
	public static void main(String args[]) {
		
		System.out.println("Enter Marks:");
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		 
		 if(score<=100 && score >= 90) {
			 System.out.println("Your Grade is A");
		 }else if(score<=89 && score >= 80){
			 System.out.println("Your Grade is B");
		 }else if(score<=79 && score >= 70){
			 System.out.println("Your Grade is C");
		 }else if(score<=69 && score >= 60){
			 System.out.println("Your Grade is D");
		 }else if(score<=59 && score >= 0){
			 System.out.println("Your Grade is F");
		 }
		 sc.close();
	}
}