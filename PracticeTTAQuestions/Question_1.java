package PracticeTTAQuestions;

//✅ How to Take Input from Users?

import java.util.Scanner;
public class Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = sc.nextLine();
		
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		System.out.println("Hello "+ name + " You are " + age + " old");
		
		sc.close();
	}

}
