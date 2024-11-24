package Nov.TaskEx.Task_18112024_Exceptions_Part2;

public class Task_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Febil";
		
		try {
			String a1 = args[0];
			System.out.println("First argument: " + a1);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Caught an Array Index Out Of Bounds Exception: " + e.getMessage());
		}
		
		try {
			int a = 10/0;
		}catch(ArithmeticException e){
			System.out.println("Arithmetic Exception: Cannot " + e.getMessage());
		}
		
		try{
			s1 = null;
			s1.length();
		}catch(NullPointerException e){
			System.out.println("Caught An Exception!!! " + e.getMessage());
		}
	}
}