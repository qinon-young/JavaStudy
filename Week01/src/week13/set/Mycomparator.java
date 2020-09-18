package week13.set;

import java.util.Comparator;

public class Mycomparator implements Comparator{

	

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		String s1=(String)o1;
		String s2=(String)o2;
		return (s1.length()-s2.length())==0?(s1.compareTo(s2)):(s1.length()-s2.length());
	
	}



}
