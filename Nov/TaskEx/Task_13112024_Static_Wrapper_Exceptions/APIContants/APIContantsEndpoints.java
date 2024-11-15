package Nov.TaskEx.Task_13112024_Static_Wrapper_Exceptions.APIContants;

public enum APIContantsEndpoints {
	
	 	BASE_URL("https://app.vwo.com"),
	    LOGIN_PAGE("https://app.vwo.com/login"),
	    DASHBOARD_PAGE("https://app.vwo.com/dasHboard"),
	    CHATBOT_PAGE("https://app.vwo.com/chat");
	
	
	private String name;

	APIContantsEndpoints(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}