package cn.qinon.test;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

import cn.qinon.permutation.Permutation;

public class TestPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inScanner=new Scanner(System.in);
		System.out.println("��������Կ(Сд)��");
		String keyString=inScanner.next();
		System.out.println("����������(Сд)��");
		String plaintextString=inScanner.next();
		Permutation permutation=new Permutation(keyString.toCharArray());
		String ciphertext=permutation.encipher(plaintextString.toCharArray());
		System.out.println("----------�б任�������--------");
		System.out.println(ciphertext);
		 
		 
	}

}
