package Nov.TaskEx.Task_12112024.Task_Abstraction;

public class Lab158 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		child c = new child();
		//c.loan25();
		c.loan50K();
	}

}

class child extends father{

	@Override
	void loan50K() {
		// TODO Auto-generated method stub
		System.out.println("Child will pay the 50k loan");
	}
	
}

abstract class father{
	abstract void loan50K();
	
	void loan25(){
		System.out.println("Paid by Father");
	}
}