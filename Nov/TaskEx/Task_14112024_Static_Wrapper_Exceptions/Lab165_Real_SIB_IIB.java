package Nov.TaskEx.Task_14112024_Static_Wrapper_Exceptions;

public class Lab165_Real_SIB_IIB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ATB a1 = new ATB("febil");
		ATB a2 = new ATB("jeff");
		ATB a3 = new ATB("jake");
		
		ATB a5;
		new ATB("febil");
		
		a1.readDocument();
		a2.readDocument();
		
		//calling static methods by Class name not by object reference
		ATB.doAssignments();
		System.out.println(ATB.courseName);
	}

}

class ATB{
	{
		System.out.println("IIB");
		//what is the purpose? -
		//Here you can write code related to
		//start a website or anything before staring the
		// web automation or api automation
		
		System.out.println("Reading from CSV file");
	}
	
	
	
	static {
		System.out.println("SIB will once");
	}
	
	private String name;
	private String phone;
	static String courseName = "ATB9x";
	
	
	
	public ATB(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	//non static method or a function can access a static variable
	void readDocument() {
		System.out.println("Non Static Mehthod");
	}
	
	// static method or a function cannot access instance variable
	static void doAssignments() {
		System.out.println("Do Assignment");
		}
}