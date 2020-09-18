package week12.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WorkCollection {

	public static void main(String[] args) {
		List<Person> aList=new ArrayList<Person>();
		aList.add(new Person("张三", 19));
		aList.add(new Person("张的", 17));
		aList.add(new Person("张大概", 18));
		aList.add(new Person("张定稿", 19));
		aList.add(new Person("张嘎嘎", 19));
		aList.forEach(a->System.out.println(((Person)a).toString()));
		System.out.println();
		for (Iterator<Person> iterator = aList.iterator(); iterator.hasNext();) {
			Person person = (Person) iterator.next();	
			System.out.println(person);
		}
	}
//
}
