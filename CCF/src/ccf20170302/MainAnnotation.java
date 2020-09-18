package ccf20170302;

import java.util.ArrayList;
import java.util.Scanner;

public class MainAnnotation {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		
		int n,m;
		n=in.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			arr.add(i);
		}
		m=in.nextInt();
		for (int i = 0; i < m; i++) {
			change(arr);
		}
		//arr.forEach(a->{System.out.print(a+" ");});
	}
public static void change(ArrayList< Integer> arr) {
	int p,q;
	p=in.nextInt();
	q=in.nextInt();
System.out.println("P:"+p+" Q:"+q);
	int position=arr.indexOf(p);
System.out.println("positon:"+position);
	int interval;
	if(q>0) {
		interval=arr.size()-(position+1);
System.out.println("interval:"+interval);
		if(q==interval) {
			arr.remove(position);
			arr.add(p);
		}
		else {
System.out.println("移动后的位置:"+(position+q));
System.out.println("移动前的队列:");
arr.forEach(a->{System.out.print(a+" ");});
System.out.println();
			arr.remove(new Integer(p));
			arr.add(position+q, p);
		}
	}
	else {
		interval=position;
System.out.println("interval:"+interval);
		if(q==interval) {
			arr.remove(position);
			arr.add(0, p);
		}
		else {
			arr.remove(new Integer(p));
System.out.println("调整后的位置："+(position+q));
			arr.add(position+q, p);
		}
	}
	
arr.forEach(a->{System.out.print(a+" ");});
	
}

}
