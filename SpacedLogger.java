package Week5Assignment;

public class SpacedLogger implements Logger {
	
	public void log(String log) { //take input of String
		
		System.out.println(log.replace("", " ").trim()); // replace empty strings with space, trim to remove leading and trailing spaces
			
		}
		


	
	public void error(String error) { //take input of String
		
		System.out.println("ERROR: " +  error.replace("", " ").trim()); // replace empty strings with space, trim to remove leading and trailing spaces
		
		
	}

}
