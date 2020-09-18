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
		//.链式表达式，不返回值直接调用下一个方法
//		Stream<String> s1=aList.stream();
//		Stream<String> s2=s1.filter(i->i.startsWith("A"));
//		Stream<String> s3=s2.limit(1);
//		s3.forEach(System.out::println);
//		
//		aList.stream().filter(i->i.startsWith("A")).limit(2)
//			.forEach(System.out::println);
//		System.out.println();
		//跳过，根据函数规则映射，排序（可加载comparator）
		//aList.stream().skip(1).map(String::toUpperCase).forEach(System.out::println);
		//aList.stream().skip(1).map(String::toUpperCase).sorted().forEach(System.out::println);
		
		//collect(Collectors.joining(" and ")) 终结操作，返回字符串
		String weString=aList.stream()
				.skip(1).limit(2).map(String::toUpperCase)
				.collect(Collectors.joining(" and "));
		System.out.println(weString);
		
		//collect(Collectors.toList()) 终结操作，返回list集合
		ArrayList<String> aList2=new ArrayList<String>();
		aList2.addAll(
				aList.stream().skip(2).collect(Collectors.toList())
				);
		aList2.forEach(System.out::println);
	}

}
