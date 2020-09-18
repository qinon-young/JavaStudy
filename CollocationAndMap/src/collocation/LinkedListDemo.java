package collocation;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedList=new LinkedList<String>();
		linkedList.add("ÕÅÈı");
		linkedList.add("Ann");
		linkedList.add("Bean");
		linkedList.add("An");
		linkedList.add("July");
		linkedList.forEach(System.out::println);
		linkedList.addFirst("Sun");
		linkedList.remove("Ann");
		linkedList.remove("July");
		linkedList.remove("July");
		linkedList.forEach(System.out::println);
		linkedList.offer("offer");
		linkedList.push("push");
		linkedList.forEach(System.out::println);
		
		
	}

}
