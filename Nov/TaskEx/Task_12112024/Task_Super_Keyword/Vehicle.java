package Nov.TaskEx.Task_12112024.Task_Super_Keyword;

public class Vehicle {
	protected int maxSpeed = 180;

	void display() {
		System.out.println("Parent");
	}
	
	public Vehicle() {
		System.out.println("DC Vehicle");
	}
	
	public Vehicle(int a) {
		System.out.println("PC Vehicle");
	}
}