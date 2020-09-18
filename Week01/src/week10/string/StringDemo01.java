package week10.string;

import java.util.Arrays;

public class StringDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="�Ұ�ѧϰ������ѧϰ���ұ���ѧϰ��������ѧϰ��";
		String str1="     �մ�ǿ    ";
		String str2="25765869";
		String str3="��������";
		System.out.println("----------------------");
		System.out.println(str);
		System.out.println("������"+countSubString(str, "ѧϰ")+"�Ρ�ѧϰ��");
		
		System.out.println("----------------------");
		System.out.println(str1);
		System.out.println("ȥ���ַ������˵Ŀհ�");
		System.out.println(MyTrim(str1));
		
		System.out.println("----------------------");
		System.out.println(str2);
		System.out.println("�ַ�������");
		System.out.println(sortString(str2));
		
		System.out.println("----------------------");
		System.out.println(str3);
		System.out.println("�ַ�����ת");
		System.out.println(reverseString(str3));
		
	}
	static String reverseString(String str) {
		StringBuffer stringBuffer=new StringBuffer(str);
		
		
		return stringBuffer.reverse().toString();
	}
	
	static String sortString(String str) {
		char[] charArray=str.toCharArray();
		Arrays.sort(charArray);
		
		return new String(charArray);
	}
	
	static String MyTrim(String str) {
//		int index=-1;
//		int begin;		
		while (str.startsWith(" ")) {
			str=str.substring(1);
		}
		while (str.endsWith(" ")) {
			str=str.substring(0,str.length()-2);
		}
		return str;
		
	}
	static int countSubString(String str,String substr) {
		int count=0;
		int index=-1;
		int length=substr.length();
		index=str.indexOf(substr);
		
		while(index!=-1) {
			count++;
			index=str.indexOf(substr,index+length);
			
			//System.out.println(index );
		}			
		return count;
	}
}
