package week03;

import java.util.Scanner;
//ctrl +shift +o  �����
//ctrl 1  ��ʾ
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
		System.out.println("�����빺�����Ʒ��");
		Scanner scanner=new Scanner(System.in);
		
		return scanner.next();
	}
}
