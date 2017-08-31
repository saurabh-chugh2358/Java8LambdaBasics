package unit3.methodReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import unitExeciseSolution.Person;

public class MethodReferenceExample2 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Caroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charllotte", "Bronte", 45),
				new Person("Mathew", "Arnold", 39)
				);
		
		// Step2: Create a Method that prints all the elements in the list...
		System.out.println("Step2: Create a Method that prints all the elements in the list...");
		displayConditionally(people, p -> true, System.out::println);
		
	} 
	
	public static void displayConditionally(List<Person> people, Predicate<Person> condition, Consumer<Person> consumer) {
		for(Person p: people){
			if(condition.test(p)){
				consumer.accept(p);
			}
		}
	}
	
	public static void printMessage() {
		System.out.println("Hello");
	}

}
