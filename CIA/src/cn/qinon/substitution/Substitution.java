package cn.qinon.substitution;

public class Substitution {
	
	public static void main(String[] args) {
		//String ciphertext="PELCGBTENCUL";
		String ciphertext="pelcgbtencul";
		char[] ciphertextArray=ciphertext.toCharArray();
		for (int i = 1; i < 26; i++) {
			System.out.println("offset:"+i);
			for (int j = 0; j < ciphertextArray.length; j++) {
				char c=ciphertextArray[j];
				int message=i+Integer.valueOf(c);
				System.out.print(message<=122?(char)message:(char)(message-26));
			}
			System.out.println();
		}
	}
	
}
