package Week5Assignment;

public class AsteriskLogger implements Logger {

	
	public void log(String log) {
		System.out.println("***" + log + "***"); // surround input of log with 3 asterisks on eeach side
		
	}

	
	public void error(String error) {
		System.out.println("******************\n***Error:" + error + "***\n******************"); // surround input of error with a box of asterisks
		
	}

}
