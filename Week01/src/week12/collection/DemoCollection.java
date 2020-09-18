package week12.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoCollection {
	/*
	 * 					集合框架
	 * Collection 	
	 * 			--list:
	 * 			1.有序的，存入顺序与取出的顺序一致
	 * 			2.元素是有索引的	get、set方法
	 * 			3.元素可以重复
	 * 			
	 * 			list接口支持增删改查操作；
	 * 			list:
	 * 					1:Arraylist:数据结构是数组结构，不同步，查询速度快
	 * 									*查询为主*
	 * 					2：Linkedlist：数据结构是链表结构 不同步（1.2以后的版本都 不同步）
	 * 									增删改速度快
	 * 									*修改为主*				需要同步自己加synchronized
	 * 					3：Vector 数组结构（顺序结构）同步的，现在已经被arraylist替代
	 * 						因为效率低。
	 *list列表迭代器，是list特有的迭代器，可以再迭代中实现增删改查
	 *  		 
	 * listIterator 里特有的，带上索引的主要方法有： 唯一自带完整的增删改查
	 * add(index,element),
	 * remove(index),
	 * set(index,element)
	 * get(index)
	 */
	public static void main(String[] args) {
		demo02();
		//demo01();
		
	}
	public static void demo02() {
		List arr=new ArrayList();
		arr.add("a1");
		arr.add("a2");
		arr.add("a3");
		arr.add("a4");
		boolean  flag=false;
		for (Iterator iterator = arr.listIterator(); iterator.hasNext();) {
			String itString=iterator.next().toString();
			if(itString.equals("a2"))
				flag=true;
			
		}
		if (flag) {
			arr.add("a8");
		}
		arr.forEach(o->System.out.println(o));
	}
	public static void demo01() {
		List arr=new ArrayList();
		arr.add("a1");
		arr.add("a2");
		arr.add("a3");
		arr.add("a4");
		System.out.println(arr.get(1));
		Iterator it=arr.iterator();
		it.forEachRemaining(o->System.out.print(o));
		System.out.println();
		for (Iterator itt = arr.iterator(); itt.hasNext();) {
			System.out.print(itt.next());
			
		}
		System.out.println();
		arr.forEach(o->System.out.println(o));
	}

}
