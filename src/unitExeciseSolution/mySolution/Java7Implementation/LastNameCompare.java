package unitExeciseSolution.mySolution.Java7Implementation;

import java.util.Comparator;

import unitExeciseSolution.Person;

public class LastNameCompare implements Comparator<Person>{

	@Override
	public int compare(Person person1, Person person2) {
		// TODO Auto-generated method stub
		return person1.getLastName().compareTo(person2.getLastName());
	}

}
