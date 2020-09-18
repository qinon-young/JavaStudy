package week15.map;

import java.util.HashMap;
import java.util.Scanner;

public class CountWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap<String, Integer> hMap=new HashMap<String, Integer>();
		//addDate(hMap);
		//��ʽ���ʽ�����ò�����
		//���ص�������Stream�����Կ�����������ʽ
		//input().countWord.showCount();
		showCount(countWord(input()));
	}
	public static byte[] input() {
		Scanner in=new Scanner(System.in);
		System.out.println("������Ҫͳ����ĸ���ִ������ַ�����");
		String str=in.next();
		byte[] temp=str.getBytes();
		return temp;
	}
	public static HashMap<String, Integer> countWord(byte[] arr) {
			HashMap<String, Integer> wordMap=new HashMap<String, Integer>();
			int temp=0;
			addDate(wordMap);
			for (int i = 0; i < arr.length; i++) {
				if(((char)arr[i]>='a'&&(char)arr[i]<='z')||((char)arr[i]>='A'&&(char)arr[i]<='Z')) {
					String word=new String(arr,i,1);
					temp=wordMap.get(word);
					wordMap.put(word,temp+1);
				}
			}
			return wordMap;
	}
	public static void showCount(HashMap<String, Integer> hMap) {
		int temp=0;
		System.out.println("ͳ�ƽ�����£�");	
		hMap.forEach((k,v)->{
				if(hMap.get(k)>0) {
					System.out.print(k+"("+v+")"+" ");
				}
			});
	}
	public static void addDate(HashMap<String,Integer> hMap) {
		char lowerCase='a';
		char upCase='A';
		int temp=0;
		while (lowerCase<='z') {
				hMap.put(String.valueOf(lowerCase), 0);
				temp=Character.hashCode(lowerCase);
				lowerCase=(char)(temp+1);
		}
		while (upCase<='Z') {
			hMap.put(String.valueOf(upCase), 0);
			temp=Character.hashCode(upCase);
			upCase=(char)(temp+1);
	}
	}
}
