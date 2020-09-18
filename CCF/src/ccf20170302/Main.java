package ccf20170302;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
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
		arr.forEach(a->{System.out.print(a+" ");});
	}
public static void change(ArrayList< Integer> arr) {
	int p,q;
	p=in.nextInt();
	q=in.nextInt();
	int position=arr.indexOf(p);
	int interval;
	if(q>0) {
		interval=arr.size()-(position+1);
		if(q==interval) {
			arr.remove(position);
			arr.add(p);
		}
		else {
			arr.remove(new Integer(p));
			arr.add(position+q, p);
		}
	}
	else {
		interval=position;
		if(q==interval) {
			arr.remove(position);
			arr.add(0, p);
		}
		else {
			arr.remove(new Integer(p));
			arr.add(position+q, p);
		}
	}
	
	
}

}
