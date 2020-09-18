package exercises.subject2;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, String> tm=new TreeMap<String, String>(new MyComparator());
	//	TreeMap<String, String> tm=new TreeMap<String, String>();
		tm.put("1", "An");
		tm.put("4", "Jhon");
		tm.put("3", "Candy");
		tm.put("2", "Bon");
		tm.put("5", "Jim");
		tm.forEach((i,j)->System.out.println(i+j));
		Set<String> tSet=new TreeSet<String>();
		tSet.addAll(tm.keySet());
		for (Iterator<String> iterator = tSet.iterator(); iterator.hasNext();) {
			String key = (String) iterator.next();
			System.out.println(key+":"+tm.get(key));
			
		}
	}

}
class MyComparator implements Comparator<Object>{

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		String s1=(String)arg0;
		String s2=(String)arg1;
		return s2.compareTo(s1);
	}

	
	
}
