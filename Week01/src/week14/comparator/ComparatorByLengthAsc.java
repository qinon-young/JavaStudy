package week14.comparator;

import java.util.Comparator;

public class ComparatorByLengthAsc implements Comparator<String> {

	@Override
	public int compare(String s0, String s1) {
		// TODO Auto-generated method stub
		return s0.length()-s1.length()==0?s0.compareTo(s1):s0.length()-s1.length();
	}

}
