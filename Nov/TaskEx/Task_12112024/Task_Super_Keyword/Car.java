package Nov.TaskEx.Task_12112024.Task_Super_Keyword;

public class Car extends Vehicle{
	private int maxSpeed = 281;
	
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Child");
	}

	Car(){
		super(19);
		System.out.println("DC Car");
		System.out.println("Childs varible" + this.maxSpeed);
		System.out.println("Parents Variable" + super.maxSpeed);
		this.display();
		super.display();
		
	}
}