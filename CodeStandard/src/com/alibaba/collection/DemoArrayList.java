package com.alibaba.collection;

import java.util.Arrays;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) {
		String[] strArr=new String[] {"aad","bb"};
		List list=Arrays.asList(strArr);
		/*ʹ�ù�����Arrays.asList()������ת���ɼ���ʱ��
		 * ����ʹ�����޸ļ�����صķ� ����
		 * ����add/remove/clear����
		 * ���׳�UnsupportedOperationException �쳣�� 
		*/
		//list.add("223");
		strArr[0]="11";
		// listҲ����֮�޸ģ���֮��Ȼ�� 
		list.forEach(System.out::println);
	}

}
