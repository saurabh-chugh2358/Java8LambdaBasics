package unit3.methodReference;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import unitExeciseSolution.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Caroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charllotte", "Bronte", 45),
				new Person("Mathew", "Arnold", 39)
				);
		
		System.out.println("Using For Loop");
		for(int i=0; i<people.size(); i++){
			System.out.println(people.get(i));
		}
		
		System.out.println("Using For Each Loop");
		for(Person p : people){
			System.out.println(p);
		}
		
		System.out.println("Using Lambda For Each Loop");
		people.forEach(System.out::println);
	}

}
