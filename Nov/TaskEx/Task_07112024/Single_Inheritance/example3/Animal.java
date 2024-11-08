package Nov.TaskEx.Task_07112024.Single_Inheritance.example3;

public class Animal {
	String name;
	int age;
	
	public Animal(String n, int a){
		this.name = n;
		this.age = a;
	}
	void display() {
		System.out.println("Name of Dog:" + name);
		System.out.println("Age: " + age);
	}
}