package demo3_11;

import java.util.Scanner;

public class BankDemo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank11.sayHello();
		Bank11 bank11=new Bank11("小吴", "311211", 100);
		bank11.deposit11(500);
		
		System.out.println("取款请输入密码");
		Scanner inScanner=new Scanner(System.in);
		
		String passwordString=inScanner.next();
//		bank11.withdrawals11("232444", 200);
//		bank11.withdrawals11("311211", 1000);
//		bank11.withdrawals11("311211", 200);
		
		
		bank11.withdrawals11(passwordString, 200);
		System.out.println("取款请输入密码");
		bank11.withdrawals11("311211", 200);
		Bank11.sayGoodbay();
	}

}
