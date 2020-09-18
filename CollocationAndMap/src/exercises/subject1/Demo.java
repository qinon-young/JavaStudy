package exercises.subject1;

import java.util.HashSet;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Person> set1=new HashSet<Person>();
		set1.add(new Person("Jim", 11));
		set1.add(new Person("Jim", 11));
		set1.add(new Person("Cim", 11));
		set1.forEach(System.out::println);
	}

}
