package Nov.TaskEx.Task_12112024.Task_Abstraction;

public class Lab159 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gwagon G = new Gwagon();
		G.drive();
		
		Defender D = new Defender();
		D.drive();
	}
}

class Gwagon extends engine{
	
	void drive() {
		startEngine();
		stopEngine();
	}

	@Override
	void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("Engine Started by Gwagon");
	}

	@Override
	void stopEngine() {
		// TODO Auto-generated method stub
		System.out.println("Engine Stoped by Gwagon");
	}
	
}

class Defender extends engine{
	
	void drive() {
		startEngine();
		stopEngine();
	}

	@Override
	void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("Engine Started by Defender");
	}

	@Override
	void stopEngine() {
		// TODO Auto-generated method stub
		System.out.println("Engine Stoped by Defender");
	}
	
}

abstract class engine{
	abstract void startEngine();
	abstract void stopEngine();
}