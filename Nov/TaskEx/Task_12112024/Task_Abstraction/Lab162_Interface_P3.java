package Nov.TaskEx.Task_12112024.Task_Abstraction;

public class Lab162_Interface_P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubss
		
		son c = new son();
		
		c.allFunctions();
		c.f1();
	}

}

class son implements james, mother{
	
	void allFunctions() {
		m1();
		m2();
		f1();
		f2();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Method Implemented by Child Class from m1 method");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("Method Implemented by Child Class from m2 method");
	}

	@Override
	public void f1() {
		// TODO Auto-generated method stub
		System.out.println("Method Implemented by Child Class from f1 method");
	}

	@Override
	public void f2() {
		// TODO Auto-generated method stub
		System.out.println("Method Implemented by Child Class from f2 method");
	}
	
}
interface james{
	void f1();
	void f2();
}

interface mother{
	void m1();
	void m2();
}