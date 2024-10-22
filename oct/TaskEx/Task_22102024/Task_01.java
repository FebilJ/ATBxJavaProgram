package oct.TaskEx.Task_22102024;

//Reverse the number using for loop. (In - 12345, Out - 54321)
//refer https://www.youtube.com/watch?v=G8nt9w_U1Zc

import java.util.Scanner;

public class Task_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
        int originalNumber= sc.nextInt();
        
        //int originalNumber = 12345; // Input number
        
        int reversedNumber = 0;     // Variable to store the reversed number

        // Loop to reverse the number
        for (; originalNumber != 0; originalNumber /= 10) {
         int lastDigit = originalNumber % 10; // Extract last digit
         reversedNumber = reversedNumber * 10 + lastDigit; // Build reversed number
     }

     System.out.println("Reversed Number: " + reversedNumber); // Output the result
     
 }
}
