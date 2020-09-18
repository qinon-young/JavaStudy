package com.alibaba.collection;

import java.util.Arrays;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) {
		String[] strArr=new String[] {"aad","bb"};
		List list=Arrays.asList(strArr);
		/*使用工具类Arrays.asList()把数组转换成集合时，
		 * 不能使用其修改集合相关的方 法，
		 * 它的add/remove/clear方法
		 * 会抛出UnsupportedOperationException 异常。 
		*/
		//list.add("223");
		strArr[0]="11";
		// list也会随之修改，反之亦然。 
		list.forEach(System.out::println);
	}

}
