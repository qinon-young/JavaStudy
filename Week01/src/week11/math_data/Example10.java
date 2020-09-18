package week11.math_data;

import java.util.Random;

public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		long starttime=System.currentTimeMillis();
//		int sum=0;
//		for (int i = 0; i < 100000000; i++) {
//			sum+=i;
//		}
//		System.out.println(System.currentTimeMillis()-starttime+"ºÁÃë");
//		
//		System.out.println(Math.E);
//		System.out.println(Math.PI);
//		System.out.println(Math.ceil(3.5));
//		System.out.println(Math.floor(3.5));
//		System.out.println(Math.round(3.5));
//		System.out.println(Math.random());
//		for (int i = 0; i < 10; i++) {
//			System.out.println((int)(Math.random()*6));
//		}
//		Random random=new Random();
//		System.out.println(random.nextInt());
//		for (int i = 0; i < 10; i++) {
//			System.out.println(random.nextInt(6));
//		}
		String str="223";
		int num=11;
		str=String.valueOf(num);
		Integer integer=Integer.valueOf(num);
		integer=Integer.valueOf(str);
		System.out.println(integer.toString());
		num=Integer.parseInt("2232");
		System.out.println(num);
		
		
		
	}

}
