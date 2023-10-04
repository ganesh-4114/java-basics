package datatypes;

public class JavaMainMethod {
	
	// JRE will trigger the main method to run the programm.
	public static void main(String[] args) {
		
		System.out.println(args[0]); 
		
		// the above will print "Ganesh" in the console. Because I've passed the arugments as Ganesh using the Run Configurations option in the Eclipse.
		
	}
	
	/*
	 * why public? --> Because this method should be callable by something outside
	 * of this class. JRE wouldn't have the access for the private or protected
	 * methods. private methods can be accessible in the same class itself.
	 */	
	
	
//	why static? ---> the static methods can be called on a class without needing the instance of that class.
	
	
//	why void? --> void is the return type of your main method. It won't return anything.
	
//	params ---> We're going to pass an Array of strings as arguments / params to the main method.
	
		
	
	
	
}
