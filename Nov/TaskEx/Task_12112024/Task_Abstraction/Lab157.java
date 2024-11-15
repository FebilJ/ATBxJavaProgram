package Nov.TaskEx.Task_12112024.Task_Abstraction;

public class Lab157 {
	public static void main(String[] args) {
		febil f = new febil();
		f.loan30k();
		f.loan50k();
		f.loan1L();
	}
}

class febil extends loan{

	@Override
	void loan50k() {
		// TODO Auto-generated method stub
		System.out.println("Giving the loan");
	}

	@Override
	void loan30k() {
		// TODO Auto-generated method stub
		System.out.println("Giving the loan");
	}

	@Override
	void loan1L() {
		// TODO Auto-generated method stub
		System.out.println("Child is giving loan");
		super.loan1L();
	}
	
	
}

abstract class loan{
	abstract void loan50k();
	abstract void loan30k();
	
	void loan1L() {
		System.out.println("1L loan is there");
	}
}