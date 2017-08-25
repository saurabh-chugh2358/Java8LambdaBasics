
public class Greeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter greeter = new Greeter();
		HelloWorldGreeting greeting = new HelloWorldGreeting();
		greeter.greet(greeting);
	}
	
	public void greet(Greeting greet) {
		greet.perform();
	}
}
