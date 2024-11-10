package Nov.TaskEx.Task_08112024.Task_03;

//Methodoverloading Example
public class OverloadingEx {
	
	 public void sayHello(String name) {
	        System.out.println("Good day, " + name + "!");
	    }

	    // Overloaded method to greet two people
	    public void sayHello(String firstGuest, String secondGuest) {
	        System.out.println("Good day, " + firstGuest + " and " + secondGuest + "!");
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingEx o1 = new OverloadingEx();
			
		o1.sayHello("Febil");
		o1.sayHello("Febil", "Jose");
		
	}
}