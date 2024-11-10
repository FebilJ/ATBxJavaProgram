package Nov.TaskEx.Task_08112024.Task_02.Multilevel_Inheritance;

public class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	void displayInfo() {
		System.out.println(name);
		System.out.println(age);
	}
}