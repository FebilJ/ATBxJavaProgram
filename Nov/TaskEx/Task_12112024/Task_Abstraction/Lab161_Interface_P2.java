package Nov.TaskEx.Task_12112024.Task_Abstraction;

public class Lab161_Interface_P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P p = new P();
		
		p.allFunction();
		
	}
}

class P implements I1{
	
	void allFunction() {
		f1();
		f2();
		f3();
	}
	
	@Override
	public void f1() {
		// TODO Auto-generated method stub
		System.out.println("Method Implemented by P Class");
	}

	@Override
	public void f2() {
		// TODO Auto-generated method stub
		System.out.println("Method Implemented by P Class");
	}

	@Override
	public void f3() {
		// TODO Auto-generated method stub
		System.out.println("Method Implemented by P Class");
	}
	
}
interface I1{
	void f1();
	void f2();
	void f3();
}