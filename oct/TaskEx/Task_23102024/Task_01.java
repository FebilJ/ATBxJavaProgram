package oct.TaskEx.Task_23102024;

//user input using functions

import java.util.Scanner;
public class Task_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		 
		 
		 System.out.println("Enter Num 1");
		 int a = sc.nextInt();
		 System.out.println("Enter Num 2");
		 int b = sc.nextInt();
		 
		// Using printf for formatted output
		 System.out.printf("%d + %d = %d%n", a,b,sum(a,b));
		 System.out.printf("%d - %d = %d%n", a,b,sub(a,b));
		 System.out.printf("%d * %d = %d%n", a,b,mul(a,b));
		 System.out.printf("%d / %d = %d%n", a,b,div(a,b));
		 sc.close();
	}
		static int sum(int a, int b) {
			return a+b;
		}
		
		static int sub(int a, int b) {
			return a-b;
		}
		
		static int mul(int a, int b) {
			return a*b;
		}
		
		static int div(int a, int b) {
			return a / b;
		}
}