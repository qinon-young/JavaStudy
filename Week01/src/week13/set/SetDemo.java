package week13.set;

import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student> students1=new HashSet<Student>();
		/*
		 * students1.add(new Student("31671", "�ۿ�˼", "��", 100)); students1.add(new
		 * Student("31671", "����˼", "��", 101)); students1.add(new Student("31673", "Ann",
		 * "��", 89)); students1.add(new Student("31675", "July", "Ů", 90));
		 * students1.add(new Student("31676", "Sim", "��", 100));
		 */
		
		System.out.println("--------HashSet--------");
		students1.forEach(System.out::println);
		
		//TreeSet<Student> treeSet=new TreeSet<Student>();
//		treeSet.add(new Student("31671", "�ۿ�˼", "��", 100));
//		treeSet.add(new Student("31671", "����˼", "��", 100));
//		treeSet.add(new Student("31673", "Ann", "��", 89));
//		treeSet.add(new Student("31675", "July", "Ů", 90));
//		treeSet.add(new Student("31676", "Sim", "��", 100));
		System.out.println("--------TreeSet--------");
		//treeSet .forEach(System.out::println);
		
		/*
		 * ͨ���Ƚ�����ʵ�ֽ����Ч������߸����ԡ���ά����
		 */
		//TreeSet<Student> treeSet=new TreeSet<Student>(new ComparatorByGoalAsc());
		TreeSet<Student> treeSet=new TreeSet<Student>(new ComparatorByGoalDesc());
		treeSet.addAll(students1);
		treeSet .forEach(System.out::println);
//		TreeSet<String> treeSet2=new TreeSet<String>(
//				(obj1,obj2)->{
//					String s1=(String)obj1;
//					String s2=(String)obj2;
//					return (s1.length()-s2.length())==0?(s1.compareTo(s2)):(s1.length()-s2.length());
//				}
//				);
		TreeSet<String> treeSet2=new TreeSet<String>(new Mycomparator());
		treeSet2.add("Ann");
		treeSet2.add("Bnn");
		treeSet2.add("Ann is ok");
		treeSet2.add("Ann  is  not ok!");
		treeSet2.add("3");
		System.out.println("--------TreeSet2--------");
		treeSet2 .forEach(System.out::println);
	}

}
