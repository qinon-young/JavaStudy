package week12.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class MyArrayList extends ArrayList{
	//加注释啊，老哥，我2019.6.8再回来看，不懂你为啥加sb
	
	//牛逼，我算是想起来了，你居然把toString重写到ArrayList里，厉害
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
