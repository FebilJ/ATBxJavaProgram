package Nov.TaskEx.Task_15112024_Wrapper_Exceptions_Part2;

public class Lab177_Exceptions {
	
	public static void main(String[] args) {
		System.out.println("Start");
		String s1 = null;
		try {
			s1.trim();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		System.out.println("End");
	}
}