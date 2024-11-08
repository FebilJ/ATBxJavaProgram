package Nov.TaskEx.Task_07112024.Single_Inheritance.example3;

public class Dog extends Animal{
	String breed;
	
	public Dog(String n, int a, String b){
		super(n, a);
		this.breed = b;
	}
	void display() {
		super.display();
		System.out.println("Breed:" + breed);
	}
}