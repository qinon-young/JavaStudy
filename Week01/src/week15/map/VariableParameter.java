package week15.map;

public class VariableParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ʵ�������������
		System.out.println(Character.hashCode('a'));
	}
	//�����Ĳ�����ȷ��
	public static int addInt(int... arr) {//�ɱ䳤��ʵ��Ϊ���飬  ���ڵ���0
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}
	public static int addInt(int a ,int b,int... arr) {//���ڵ���2  
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		
		return sum;
	}
}
