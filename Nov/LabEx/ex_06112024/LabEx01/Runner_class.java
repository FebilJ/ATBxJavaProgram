package Nov.LabEx.ex_06112024.LabEx01;

public class Runner_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person();
		
		System.out.println("This is a Default constructor");
		p1.display();
		
		Person p2 = new Person("Jake", "James");
		System.out.println("This is a two parameterized constructor");
		p2.display();
		
		Person p3 = new Person("Jake", "James", 23);
		System.out.println("This is a three parameterized constructor");
		p3.display();
	}

}
