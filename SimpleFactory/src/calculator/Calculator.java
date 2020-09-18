package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Operation operation=OperationFactory.getInstance("+");
//		operation.setNum1(1);
//		operation.setNum2(99);
//		System.out.println(operation.getResult());
//		System.out.println(input());
		int num1;
		String operate=" ";
		System.out.println("请输入第一个数");
		num1=input();
		System.out.println("请输入运算符");
		operate=input(" ");
		Operation operation=OperationFactory.getInstance(operate);
		operation.setNum1(num1);
		System.out.println("请输入第二个数");
		operation.setNum2(input());
		System.out.print("结果是："+operation.getResult());
	}
	static int input() {
		int num=0;
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		num=Integer.parseInt(in.next());
		//in.close();
		return num;
	}
	static String input(String a) {
		
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		String string=in.nextLine();
		//in.close();	
		System.out.println(string);
		return string;
	}
}
