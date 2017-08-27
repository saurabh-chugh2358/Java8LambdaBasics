package unit2Exercise.exceptionHandling;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4};
		int key = 2;
		
		process(numbers, key, (v, k)->{
			try {
				System.out.println(v/(v-k));
			} catch (ArithmeticException e) {
				System.out.println("An Arithmetic Exception Happenned...!");
			}
		});
	}

	public static void process(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i = 0; i < numbers.length; i++) {
			consumer.accept(numbers[i], key);
		}
	}
}
