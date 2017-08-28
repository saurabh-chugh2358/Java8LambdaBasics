package unit2Exercise.exceptionHandling;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4};
		int key = 2;
		
		process(numbers, key, wrapperLambda((v, k)->System.out.println(v/(v-k))));
	}

	private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i = 0; i < numbers.length; i++) {
			consumer.accept(numbers[i], key);
		}
	}
	
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
