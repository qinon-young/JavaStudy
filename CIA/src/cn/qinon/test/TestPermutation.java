package cn.qinon.test;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

import cn.qinon.permutation.Permutation;

public class TestPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inScanner=new Scanner(System.in);
		System.out.println("请输入密钥(小写)：");
		String keyString=inScanner.next();
		System.out.println("请输入明文(小写)：");
		String plaintextString=inScanner.next();
		Permutation permutation=new Permutation(keyString.toCharArray());
		String ciphertext=permutation.encipher(plaintextString.toCharArray());
		System.out.println("----------列变换后的密文--------");
		System.out.println(ciphertext);
		 
		 
	}

}
