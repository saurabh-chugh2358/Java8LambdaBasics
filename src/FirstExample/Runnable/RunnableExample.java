package FirstExample.Runnable;

public class RunnableExample {

	public static void main(String[] args) {
		// Anonymous Runnable Class Implementation of Runnable object.
		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Printed Inside Anonymous Runnable Class");
			}
		});
		
		myThread.start();
		
		// Lambda Expression implementation of Runnable object.
		Thread myLambdaThread = new Thread(() -> System.out.println("Printed Inside Lambda Runnable"));
		myLambdaThread.start();
	}

}
