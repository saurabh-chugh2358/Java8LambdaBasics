package unit2Exercise.exceptionHandling;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4};
		int key = 2;
		
		// Executing a wrapper method on on Lambda Expression rather than the Lambda Expression directly
		// This will allow us to handle any exception which could occur because of Lambda Expression 
		// Also, the exception handling code is isolated, making it more readable
		process(numbers, key, wrapperLambda((v, k)->System.out.println(v/(v-k))));
	}

	private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i = 0; i < numbers.length; i++) {
			consumer.accept(numbers[i], key);
		}
	}
	
	// This is a wrapper method on the Lambda Expression itself
	// This will execute exactly the same code/function as it is passed in the Lambda Expression
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		return (v, k)->{
			try {
				consumer.accept(v, k);
			} catch (ArithmeticException e) {
				System.out.println("Try-Catch Inside Wrapper Lambda Function");
			}
		};
	}
}
