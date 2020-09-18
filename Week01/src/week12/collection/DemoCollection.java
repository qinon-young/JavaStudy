package week12.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoCollection {
	/*
	 * 					���Ͽ��
	 * Collection 	
	 * 			--list:
	 * 			1.����ģ�����˳����ȡ����˳��һ��
	 * 			2.Ԫ������������	get��set����
	 * 			3.Ԫ�ؿ����ظ�
	 * 			
	 * 			list�ӿ�֧����ɾ�Ĳ������
	 * 			list:
	 * 					1:Arraylist:���ݽṹ������ṹ����ͬ������ѯ�ٶȿ�
	 * 									*��ѯΪ��*
	 * 					2��Linkedlist�����ݽṹ������ṹ ��ͬ����1.2�Ժ�İ汾�� ��ͬ����
	 * 									��ɾ���ٶȿ�
	 * 									*�޸�Ϊ��*				��Ҫͬ���Լ���synchronized
	 * 					3��Vector ����ṹ��˳��ṹ��ͬ���ģ������Ѿ���arraylist���
	 * 						��ΪЧ�ʵ͡�
	 *list�б����������list���еĵ������������ٵ�����ʵ����ɾ�Ĳ�
	 *  		 
	 * listIterator �����еģ�������������Ҫ�����У� Ψһ�Դ���������ɾ�Ĳ�
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
