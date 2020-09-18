package week14.comparator;

import java.util.HashSet;
import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ascSet=new TreeSet<String>(new ComparatorByLengthAsc());
		TreeSet<String> descSet=new TreeSet<String>(new ComparatorByLengthDesc());
		HashSet<String> hashSet=new HashSet<String>();
		//�Ƚ�����Ԫ�ش��hashSet���ڰ�hashSet����TreeSet���Ա�֤���ظ� 
		hashSet.add("aa");
		hashSet.add("bb");
		hashSet.add("aa1");
		hashSet.add("aa333");
		hashSet.add("aa66666");
		ascSet.addAll(hashSet);
		descSet.addAll(hashSet);
		System.out.println("-------����---------");
		ascSet.forEach(System.out::println);
		System.out.println("-------����---------");
		descSet.forEach(System.out::println);
	}

}
