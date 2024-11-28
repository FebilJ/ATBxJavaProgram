package Nov.TaskEx.Task_25112024;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		System.out.println("Enter Word to check Palindrome: ");
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String r ="";
		
		
		for(int i = s.length()-1; i >=0; i--) {
			r += s.charAt(i);
		}
		
		System.out.println("String: "+s);
		System.out.println("Reversed String: "+r);
		
		if(s.equals(r)) {
			System.out.println(s +" is a Plaindrome");
		}else {
			System.out.println(s +" is not a Plaindrome");
		}
	}
}