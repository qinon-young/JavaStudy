package week14.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "BeiJing");
		map.put(2, "NanAN");
		map.put(3, "XiAN");
		map.put(4, "QuanZhou");
		System.out.println("-------keySet------");
		Set<Integer> keySet=map.keySet();
		for (Iterator<Integer> it = keySet.iterator(); it.hasNext();) {
			Integer key = it.next();
			System.out.println(key);
		}
		System.out.println("-------values------");
		Collection<String> valueCollection=new ArrayList<String>(map.values());
		for (Iterator<String> it = valueCollection.iterator(); it.hasNext();) {
			String value =it.next();
			System.out.println(value);
		}
		System.out.println("-------Map.Entry------");
		Set<Map.Entry<Integer, String>> mapEntry=map.entrySet();
		for (Iterator<Map.Entry<Integer, String>> it = mapEntry.iterator(); it.hasNext();) {
			Entry<Integer, String> keyValue = it.next();
			//getKey() getValue()  是Map内部类Entry的方法 
			System.out.println(keyValue.getKey()+"::"+keyValue.getValue());	
		}		
	}

}
