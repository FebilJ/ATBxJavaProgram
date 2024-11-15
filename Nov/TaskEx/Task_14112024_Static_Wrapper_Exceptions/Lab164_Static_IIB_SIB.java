package Nov.TaskEx.Task_14112024_Static_Wrapper_Exceptions;

public class Lab164_Static_IIB_SIB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A a = new A();
		A a = new A();
		//new A();
	}
}

class A{

	//IIB
	{ 
		System.out.println("IIB");
	}
	
	//SIB
	static {
		System.out.println("SIB");
	}
}
