package oct.TaskEx.Task_16102024;

public class Task2 {
	public static void main(String args[]) {
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		System.out.println(num1 > num2 ? "num1 is greater than num2" :
							num1 < num2 ? "num2 is greater than num3" : 
								"num1 and num2 are equal");
	}
}
