package week15.map;

import java.util.TreeMap;
import java.util.Scanner;

public class CountWords {
	public static void main(String[] args) {
		showCount(countWord(input()));
	}
	public static TreeMap<Character, Integer> countWord(char... arr) {
		TreeMap<Character, Integer> wordMap=new TreeMap<Character, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if((arr[i]>='a'&&arr[i]<='z')||(arr[i]>='A'&&arr[i]<='Z')) {
				wordMap.put(arr[i],wordMap.get(arr[i])==null?1:wordMap.get(arr[i])+1);
			}
		}
		return wordMap;
}
	public static void showCount(TreeMap<Character, Integer> hMap) {
		System.out.println("统计结果如下：");	
		hMap.forEach((k,v)->{
				if(hMap.get(k)>0) {
					System.out.print(k+"("+v+")"+" ");
				}
			});
	}
	public static char[] input() {
		Scanner in=new Scanner(System.in);
		System.out.println("请输入要统计字母出现次数的字符串：");
		String str=in.next();
		in.close();
		char[] temp=str.toCharArray();
		return temp;
		
	}

}
