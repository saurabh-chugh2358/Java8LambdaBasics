package FirstExample.Greeter;
public class Greeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter greeter1 = new Greeter();

		// Passing a behavior using an interface
		HelloWorldGreeting greeting = new HelloWorldGreeting();
		greeter1.greet(greeting);
		

		// Passing a behavior using an Anonymous Inner Class
		Greeting innerClassLamda = new Greeting() {
			@Override
			public void perform() {
				System.out.println("Hello Inner Class World...!!!");
			}
		};
		greeter1.greet(innerClassLamda);
		
		// Passing a behavior using an Anonymous Lambda Expression
		//Greeting helloLamdaExpression = () -> System.out.println("Hello Lambda World...!!!");
		greeter1.greet(() -> System.out.println("Hello Lambda World...!!!"));
	}
	
	public void greet(Greeting greet) {
		greet.perform();
	}
}
