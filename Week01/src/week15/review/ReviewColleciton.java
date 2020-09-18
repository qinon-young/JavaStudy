package week15.review;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

public class ReviewColleciton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> hMap=new HashMap<Integer, String>();
		hMap.put(1, "an");
		hMap.put(2, "Bean");
		hMap.put(3, "Cailin");
		
		Collection<Map.Entry<Integer, String>> kvEntries=hMap.entrySet();
		for (Iterator<Entry<Integer, String>> iterator = kvEntries.iterator(); iterator.hasNext();) {
			Entry<Integer, String> entry =  iterator.next();
			System.out.println(entry.getKey()+entry.getValue());
		}
		
		LinkedList<String> l1=new LinkedList<String>();
		LinkedList<String> l2=new LinkedList<String>();
		
		l1.add("a");
		l1.add("b");
		l1.add("c");

		l2.add("a");
		l2.add("b");
		l2.add("c");
		System.out.println("duilie");
		for(;!l1.isEmpty();) {
			System.out.println(l1.getFirst());
			l1.removeFirst();
		}
		System.out.println("¶ÑÕ»");
		for(;!l2.isEmpty();) {
			System.out.println(l2.getLast());
			l2.removeLast();
		}
	}

}
