package ccf20170303;

import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.transform.Templates;

public class MainAnnotation {
	static ArrayList<String> content=new ArrayList<String>();
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=null;
		boolean previous, current;
		str=in.nextLine();
		current=str.isEmpty()?true:false;
		if(str!=null) {
			content.add("<p>"+str);
		}
		previous=current;
		while(in.hasNextLine()) {
			str=in.nextLine();
			previous=current;
			current=str.isEmpty()?true:false;
			str=paragraphMark(str, previous, current);
			if(previous==false&&current==true) {
				content.set(content.size()-1,str);
			}
			else {
				content.add(str);
			}
			if(str.startsWith(" ")||str.endsWith(" ")){
				break;
			}
		}
		content.forEach(System.out::println);
	}
static String paragraphMark(String temp,boolean previous,boolean current) {
	if(previous&&temp!=null&&!(temp.startsWith(" ")||temp.endsWith(" "))) {
		return "<p>"+temp;
	}
	else {
		if (current) {
			return content.get(content.size()-1)+"</p>";
		}
		else {
			return temp;
		}
	}
}
//####  6
static String titleMark(String temp) {
	
	return temp;
}
}
