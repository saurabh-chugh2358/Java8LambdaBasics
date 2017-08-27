package unitExeciseSolution.jbSolution.LambdaImplementation;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import unitExeciseSolution.Person;
import unitExeciseSolution.jbSolution.Condition;


public class UnitExcercise1 {

	public static void main(String[] args) {
		String conditionalStr = "C";
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Caroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charllotte", "Bronte", 45),
				new Person("Mathew", "Arnold", 39)
				);
		
		
		// Step1: Sort List By Last Name...
		System.out.println("Step1: Sort List By Last Name...");
		Collections.sort(people, (person1, person2) -> person1.getLastName().compareTo(person2.getLastName()));
		
		
		// Step2: Create a Method that prints all the elements in the list...
		System.out.println("Step2: Create a Method that prints all the elements in the list...");
		displayConditionally(people, (p) -> true);
		
		// Step3: Create a Method that prints all people that have last name beginning with C...
		System.out.println("Step3: Create a Method that prints all people that have last name beginning with C...");
		displayConditionally(people, (p) -> p.getLastName().startsWith(conditionalStr));

	}
	
	public static void displayConditionally(List<Person> people, Condition condition) {
		for(Person p: people){
			if(condition.test(p)){
				System.out.println(p);
			}
		}
	}
}
