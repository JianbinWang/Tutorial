package action;

import com.opensymphony.xwork2.Action;

public class HelloWorldAction implements Action {

	private String message;
	
	public String getMessage() {
		return message;
	}
	
	public String execute() throws Exception 
	{
		message = "Hello World";
		return SUCCESS;
	}

}
