package UnitExcercise1MySolution;

import java.util.Comparator;

public class LastNameCompare implements Comparator<Person>{

	@Override
	public int compare(Person person1, Person person2) {
		// TODO Auto-generated method stub
		return person1.getLastName().compareTo(person2.getLastName());
	}

}
