package oct.Task_17102024;

import java.util.Scanner;
//✅ Triangle Classifier:
public class Task2 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int side1, side2, side3;
		
		System.out.println("Enter the value of side1:");
		side1 = sc.nextInt();
		
		System.out.println("Enter the value of side2:");
		side2 = sc.nextInt();
		
		System.out.println("Enter the value of side3:");
		side3 = sc.nextInt();
		
		sc.close();
		
		if(side1 == side2 && side1 == side3) {
			System.out.println("Your Triangle is Equilateral");
		}else if(side1 == side2 || side1 == side3) {
			System.out.println("Your Triangle is Isosceles");
		}else {
			System.out.println("Your Triangle is Scalene");
		}
		
	}
}
