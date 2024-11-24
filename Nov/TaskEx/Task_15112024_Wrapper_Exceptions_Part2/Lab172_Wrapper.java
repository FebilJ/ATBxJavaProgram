package Nov.TaskEx.Task_15112024_Wrapper_Exceptions_Part2;

public class Lab172_Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Primitive to Wrapper class
		
		int a = 10;
		Integer b = a; //Boxing - int->Integer
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		b.intValue();
		
		
		//Wrapper to Integer
		Integer a2 = 42;
		int value = a2;
		System.out.println(value);
	}
}