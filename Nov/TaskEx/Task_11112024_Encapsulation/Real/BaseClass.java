package Nov.TaskEx.Task_11112024_Encapsulation.Real;

public class BaseClass {
	private String browser;

	BaseClass() {
		System.out.println("CC - BaseClass");
	}

	BaseClass(String b) {
		System.out.println("CC - BaseClass");
	}
	
	public String getBrowser() {
		return browser;
	}
	
	public void setBrowser(String browser, boolean isAuth) {
		if(isAuth) {
			this.browser = browser;
		}else {
			System.out.println("Not allowed");
		}
	}
	
	void openBrowser(String browserName) {
		System.out.println("Open Browser!! "+ browserName);
	}
	
	void closeBrowser() {
        System.out.println("Close Browser!!");
    }
}