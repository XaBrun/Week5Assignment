package Week5Assignment;

public class App {

	public static void main(String[] args) {
		
		Logger spacelogger = new SpacedLogger();
		
		Logger asterisklogger = new AsteriskLogger();
		
		spacelogger.log("E63");
		spacelogger.error("Hello");
		
		asterisklogger.log("E92 M3"); 
		asterisklogger.error("E30 M3"); //added extra stars for alignment
		

	}

}
