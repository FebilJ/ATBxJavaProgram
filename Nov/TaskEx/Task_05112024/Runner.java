package Nov.TaskEx.Task_05112024;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d1 = new Dog(); //object creation
		Dog d2 = new Dog(); //object creation
		Dog d3 = new Dog(); //object creation
		Dog d4 = new Dog(); //object creation
		Dog d5 = new Dog(); //object creation
		
		//d1
		d1.name = "Tomy"; //assigning values
		d1.breed = "poodle"; //assigning values
		d1.age = 4; //assigning values
		d1.food = "Dog Food"; //assigning values
		
		//calling get details to display details of dog
		d1.getdetails();
		
		// Example of calling other methods
		d1.eat();
		d1.sleep();
		
		System.out.println("-------------------------");
		
		//d2
		d2.name = "Buddy"; //assigning values
		d2.breed = "Golden Retriever"; //assigning values
		d2.age = 3; //assigning values
		d2.food = "Chicken"; //assigning values
		
		//calling get details to display details of dog
		d2.getdetails();
		
		// Example of calling other methods
		d2.eat();
		d2.sleep();
		
		System.out.println("-------------------------");
		
		//d3
		d3.name = "Max"; //assigning values
		d3.breed = "Bulldog"; //assigning values
		d3.age = 5; //assigning values
		d3.food = "Beef"; //assigning values
		
		//calling get details to display details of dog
		d3.getdetails();
		
		// Example of calling other methods
		d3.eat();
		d3.sleep();
		
		System.out.println("-------------------------");
		
		//d4
		d4.name = "Bella"; //assigning values
		d4.breed = "Labrador"; //assigning values
		d4.age = 2; //assigning values
		d4.food = "Fish"; //assigning values
		
		//calling get details to display details of dog
		d4.getdetails();
		
		// Example of calling other methods
		d4.eat();
		d4.sleep();
		
		System.out.println("-------------------------");
		
		//d5
		d5.name = "Lucy"; //assigning values
		d5.breed = "Beagle"; //assigning values
		d5.age = 6; //assigning values
		d5.food = "Vegetables"; //assigning values
		
		//calling get details to display details of dog
		d5.getdetails();
		
		// Example of calling other methods
		d5.eat();
		d5.sleep();
	}
}
