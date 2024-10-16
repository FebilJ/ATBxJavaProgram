package oct.Task_15102024;

//1. Finding the Largest of Three Numbers a,b,c using the Ternary Operator.
public class Task1 {
	public static void main(String args[]) {
		 int a = 10;
	        int b = 40;
	        int c = 30;

	        // Nested ternary operator to find the largest number
	        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

	        System.out.println("The largest number is: " + largest);
	}
}
