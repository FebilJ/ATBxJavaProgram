package Nov.LabEx.ex_06112024.LabEx01;

public class Person {
	String first_name;
	String last_name;
	int age;
	
	Person(){
		this.first_name = "james";
		this.last_name = "chacko0";
		this.age = 34;
	}
	
	Person(String f, String l){
		this.first_name = f;
		this.last_name = l;
	}
	
	Person(String f, String l, int a){
		this.first_name = f;
		this.last_name = l;
		this.age = a;
	}
	
	public void display() {
		System.out.println("First Name: " + first_name);
		System.out.println("Last Name: " + last_name);
		System.out.println("Age: " + age);
		
		System.out.println("----------------------------");
	}
}
