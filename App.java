package Week5Assignment;

public class App {

	public static void main(String[] args) {
		
		Logger spacelogger = new SpacedLogger(); //Logger interface assigned to spacelogger variable. new SpacedLogger referencing class we want to use methods from
		
		Logger asterisklogger = new AsteriskLogger(); //Logger interface assigned to asterisklogger variable. new AsteriskLogger referencing the class we want to use methods from
		
		spacelogger.log("E63"); // calling log method from SpacedLogger class to take an input of E63
		spacelogger.error("Hello"); //calling error method from SpacedLogger class to take an input of Hello
		
		asterisklogger.log("E92 M3"); //calling log method from AsteriskLogger class to take an input of E92 M3.
		asterisklogger.error("E30 M3"); //calling log method from AsteriskLogger class to take an input of E90 M3
		

	}

}
