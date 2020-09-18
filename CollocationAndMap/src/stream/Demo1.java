package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> aList=new ArrayList<String>();
		aList.add("An");
		aList.add("Andy");
		aList.add("Boom");
		aList.add("Cailin");
		aList.add("an");
		//.��ʽ���ʽ��������ֱֵ�ӵ�����һ������
//		Stream<String> s1=aList.stream();
//		Stream<String> s2=s1.filter(i->i.startsWith("A"));
//		Stream<String> s3=s2.limit(1);
//		s3.forEach(System.out::println);
//		
//		aList.stream().filter(i->i.startsWith("A")).limit(2)
//			.forEach(System.out::println);
//		System.out.println();
		//���������ݺ�������ӳ�䣬���򣨿ɼ���comparator��
		//aList.stream().skip(1).map(String::toUpperCase).forEach(System.out::println);
		//aList.stream().skip(1).map(String::toUpperCase).sorted().forEach(System.out::println);
		
		//collect(Collectors.joining(" and ")) �ս�����������ַ���
		String weString=aList.stream()
				.skip(1).limit(2).map(String::toUpperCase)
				.collect(Collectors.joining(" and "));
		System.out.println(weString);
		
		//collect(Collectors.toList()) �ս����������list����
		ArrayList<String> aList2=new ArrayList<String>();
		aList2.addAll(
				aList.stream().skip(2).collect(Collectors.toList())
				);
		aList2.forEach(System.out::println);
	}

}
