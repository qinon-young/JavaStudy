package collectiondemo.foreach;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoForeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList aList=new ArrayList();
		aList .add("data1");
		aList .add("data2");
		aList .add("data3");
		aList .add("data4");
		System.out.println("-----------list.forEach输出-----");
		aList .forEach(a->System.out.println(a));
		System.out.println("-----------println输出-----");
		System.out.println(aList);
		System.out.println("----------");
		Iterator iterator=aList.iterator();
		System.out.println("-----------forEachRemaining----");
		iterator.forEachRemaining(a->System.out.println(a));
		System.out.println("-----------forEach循环----");
		
		for (Object object : aList ) {
			System.out.print(object);
			if("data1".equals(object.toString()));
		}
		System.out.println("-----------迭代器hasNext输出-----");
		iterator=aList.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println(object);
			if("data1".equals(object.toString())) {
				iterator.remove();
			}
		}
		System.out.println(aList);
		
	}

}
