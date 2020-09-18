package week03;

import java.util.Scanner;
//ctrl +shift +o  导入包
//ctrl 1  提示
public class Customer11 {
	private String name11;

	public String getName() {
		return name11;
	}

	public Customer11(String name11) {
		super();
		this.name11 = name11;
	}
	public String buy() {
		System.out.println("请输入购买的商品：");
		Scanner scanner=new Scanner(System.in);
		
		return scanner.next();
	}
}
