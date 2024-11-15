package Nov.TaskEx.Task_12112024.Task_Abstraction;

public class Lab160_Interface_P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface I{
	void m1();
	void m2();
	
	// Interface cannot have complete methods but Abstract can have complete methods.
	// To create complete method in Interface use default keyword.
//	void m3() {
//		System.err.println("Complete method");
//	}
	default void m4() {
		System.out.println("Default Method in Interface");
	}
	
	default void m5() {
		System.out.println("Default Method in Interface");
	}
	
	static void m6() {
		System.out.println("Static Method in Interface");
	}
}