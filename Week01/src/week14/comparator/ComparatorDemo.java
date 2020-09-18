package week14.comparator;

import java.util.HashSet;
import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ascSet=new TreeSet<String>(new ComparatorByLengthAsc());
		TreeSet<String> descSet=new TreeSet<String>(new ComparatorByLengthDesc());
		HashSet<String> hashSet=new HashSet<String>();
		//先将集合元素存进hashSet，在把hashSet存入TreeSet可以保证不重复 
		hashSet.add("aa");
		hashSet.add("bb");
		hashSet.add("aa1");
		hashSet.add("aa333");
		hashSet.add("aa66666");
		ascSet.addAll(hashSet);
		descSet.addAll(hashSet);
		System.out.println("-------升序---------");
		ascSet.forEach(System.out::println);
		System.out.println("-------降序---------");
		descSet.forEach(System.out::println);
	}

}
