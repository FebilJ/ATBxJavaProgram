package Nov.TaskEx.Task_19112024;

public class Lab197_Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tempFun(100,200);
		tempFun("febil","jose");
		tempFun("roy", "thomas");
		tempFun(true,false);
	}
	    public  static <febil> febil tempFun(febil a, febil b){
	        System.out.println(a);
	        System.out.println(b);
	        return null;
	    }
}