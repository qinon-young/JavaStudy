package cn.qinon.permutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class Permutation {
	private TreeMap<Character, ArrayList> repository;
	private char[] keyArray;// ��Կ�ַ�����
	public Permutation(char[] keyArray) {
		this.keyArray = keyArray;
		this.repository = getRepository(keyArray);
	}

	public String encipher(char[] plaintext) {
		StringBuilder ciphertext = new StringBuilder();
		ArrayList<Character> plaintextArrayList = new ArrayList<>(); 
		for (Character i:plaintext){ 
			plaintextArrayList.add(i); 
		}
		// ���㹲�м���
		int count = plaintext.length % keyArray.length == 0 ? plaintext.length / keyArray.length
				: ((plaintext.length / keyArray.length) + 1);
		// ���Ĳ���ʱ����abc��˳��λ
		int vacant = 97;
		for (int i = 0; i < count; i++) {
			// ������д����
			for (int j = 0; j < keyArray.length; j++) {
				ArrayList wordList = repository.get(keyArray[j]);
				if (plaintextArrayList.size() > 0) {
					wordList.add(plaintextArrayList.get(0));
					plaintextArrayList.remove(0);

				} else {
					wordList.add((char) vacant);
					vacant++;
				}
				repository.put(keyArray[j], wordList);
			}
		}
		// ���г�д������
		Set<Character> keySet = repository.keySet();
		for (Iterator iterator = keySet.iterator(); iterator.hasNext();) {
			Character character = (Character) iterator.next();
			ArrayList tempList = repository.get(character);
			for (Iterator iterator1 = tempList.iterator(); iterator1.hasNext();) {
				char object = (char) iterator1.next();
				ciphertext.append(object);
			}
		}
		return ciphertext.toString();
	}

	private String decipher(char[] ciphertext) {
		String plaintext = "";
		return plaintext;
	}

	private static TreeMap<Character, ArrayList> getRepository(char[] charArray) {
		TreeMap<Character, ArrayList> repository = new TreeMap<Character, ArrayList>();
		for (int i = 0; i < charArray.length; i++) {
			repository.put(charArray[i], new ArrayList<Character>());
		}
		return repository;
	}

}
