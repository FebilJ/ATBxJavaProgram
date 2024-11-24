package Nov.TaskEx.Task_15112024_Wrapper_Exceptions_Part2;

public class Lab178_Exceptions_Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c = 0;
        int b = 0;
        try {
            b = 10/c;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
	}
}