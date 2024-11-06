package Nov.TaskEx.Task_05112024;

public class Dog {
		
		String name;
		String breed;
		int age;
		String food;
		
		void getdetails() {
			System.out.println("Name: " +name);
			System.out.println("Breed: "+breed);
			System.out.println("Age: "+age);
			System.out.println("Food: "+food);
		}
		
		void sleep() {
			System.out.println(name +" Sleeps");
		}
		
		void eat() {
			System.out.println(name +" Eats");
		}
}