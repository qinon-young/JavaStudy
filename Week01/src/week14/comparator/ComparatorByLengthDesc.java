package week14.comparator;

import java.util.Comparator;

public class ComparatorByLengthDesc implements Comparator<String> {

	@Override
	public int compare(String s0, String s1) {
		// TODO Auto-generated method stub
		return s1.length()-s0.length()==0?s1.compareTo(s0):s1.length()-s0.length();
	}

}
