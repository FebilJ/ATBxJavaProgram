package oct.Task_16102024;

import java.util.Scanner;

public class Task1 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name");
		String name = sc.nextLine();
		
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		System.out.println("Enter Your Salary");
		float sal = sc.nextFloat();
		
		sc.close();
		
		System.out.println("Your Details");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + sal);
	}
}
