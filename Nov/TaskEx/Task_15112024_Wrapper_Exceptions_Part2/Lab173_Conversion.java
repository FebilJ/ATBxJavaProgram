package Nov.TaskEx.Task_15112024_Wrapper_Exceptions_Part2;

public class Lab173_Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String num = "10";
		//String -> Wrapper Integer -> primitive Int
		Integer a = Integer.valueOf(num);
		int a2 = a;//unboxing
		
		//String to Primitive
		int a3 = Integer.parseInt(num);
		
		Long l = 10l;
		Short s = 23;
		Boolean bb = true;
	}
}