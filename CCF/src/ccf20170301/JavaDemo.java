package ccf20170301;

import java.util.Arrays;
import java.util.Scanner;

public class JavaDemo {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int distribution,count=0;
		int [] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		Arrays.sort(a);
		for (int i = 0; i < a.length; ) {
			distribution=0;
			while(distribution<k&&i < a.length) {
				distribution+=a[i++];
			}
			count++;
		}
		System.out.println(count);
	}

}
