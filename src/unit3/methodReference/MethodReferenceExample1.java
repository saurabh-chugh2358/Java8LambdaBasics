package unit3.methodReference;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		Thread th1 = new Thread(() -> printMessage());
		th1.start();
		
		// This is equivalent to the lambda expression in above statement
		// MethodReferenceExample1::printMessage === () -> printMessage()
		Thread th2 = new Thread(MethodReferenceExample1::printMessage);
		th2.start();
	} 
	
	public static void printMessage() {
		System.out.println("Hello");
	}

}
