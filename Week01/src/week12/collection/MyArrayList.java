package week12.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class MyArrayList extends ArrayList{
	//��ע�Ͱ����ϸ磬��2019.6.8�ٻ�������������Ϊɶ��sb
	
	//ţ�ƣ��������������ˣ����Ȼ��toString��д��ArrayList�����
	public String toString()  {
		StringBuffer sb=new StringBuffer();
		for (Iterator iterator = this.iterator(); iterator.hasNext();) {
			Person person = (Person) iterator.next();			
			sb.append(person.getName());
			sb.append(" ");
			sb.append(person.getAge());
			sb.append("\n");
		}
		return sb.toString();
	}
}
