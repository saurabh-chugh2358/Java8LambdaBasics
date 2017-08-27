package unitExeciseSolution.mySolution.LambdaImplementation;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.ListIterator;

import unitExeciseSolution.Person;

public class UnitExcercise1 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Caroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charllotte", "Bronte", 45),
				new Person("Mathew", "Arnold", 39)
				);
		
		
		// Step1: Sort List By Last Name...
		System.out.println("Step1: Sort List By Last Name...");
		Collections.sort(people, (Person person1, Person person2) -> person1.getLastName().compareTo(person2.getLastName()));
		
		
		// Step2: Create a Method that prints all the elements in the list...
		System.out.println("Step2: Create a Method that prints all the elements in the list...");
		displayPeople(people);
		
		// Step3: Create a Method that prints all people that have last name beginning with C...
		System.out.println("Step3: Create a Method that prints all people that have last name beginning with C...");
		displayForLastNameCharacter(people, 'C');

	}
	
	public static void displayPeople(List<Person> list) {
		ListIterator<Person> itr = list.listIterator();
		while (itr.hasNext()) {
			Person person = (Person) itr.next();
			System.out.println("First Name: "+person.getFirstName());
			System.out.println("Last Name: "+person.getLastName());
			System.out.println("Age: "+person.getAge());
		}
	}
	
	public static void displayForLastNameCharacter(List<Person> list, char firstCharacter) {
		ListIterator<Person> itr = list.listIterator();
		while (itr.hasNext()) {
			Person person = (Person) itr.next();
			if(person.getLastName().charAt(0)==firstCharacter){
				System.out.println("First Name: "+person.getFirstName());
				System.out.println("Last Name: "+person.getLastName());
				System.out.println("Age: "+person.getAge());
			}
		}
	}
}
